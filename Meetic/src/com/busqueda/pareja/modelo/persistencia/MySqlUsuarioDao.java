package com.busqueda.pareja.modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.sql.DataSource;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.utilidades.Genero;

public class MySqlUsuarioDao implements UsuarioDao {

	private static final String INSERT = "INSERT INTO Usuario "
			+ "(altura, genero, nombre, fecha) "
			+ "VALUES (?,?,?,?)";
	private static final String DELETE = "DELETE FROM Usuario WHERE id = ?";
	private static final String SELECT_TODOS = "SELECT * FROM Usuario";
	private static final String SELECT_USUARIO_POR_ID = "SELECT * "
			+ "FROM Usuario WHERE id = ?";
	
	private DataSource ds;
	
	public MySqlUsuarioDao(DataSource ds) {
		super();
		this.ds = ds;
	}

	/**
	 * Metodo que recibiendo un Usuario, lo persiste en la base de datos,
	 * retornando el PK autogenerado en la base de datos
	 */
	
	@Override
	public int alta(Usuario usuario) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(
							INSERT, Statement.RETURN_GENERATED_KEYS);
			ps.setFloat(1, usuario.getAltura());
			ps.setString(2, usuario.getGenero().toString());
			ps.setString(3, usuario.getNombre());
			ps.setDate(4, new java.sql.Date(usuario.getFechaNacimiento().getTime()));
			// 3-Ejecutar la sentencia
			ps.executeUpdate();
			
			//Retornarme un cursor con todas las claves generadas
			ResultSet generatedKeys = ps.getGeneratedKeys();
			
			//Situarme en la primera clave generada (que será la unica, porque
			//solo inserto un registro)
			generatedKeys.first();
			
			//Del registro que me retorna el Cursor, me quedo con el primer campo
			//(que solo hay uno), que sera la clave generada
			return generatedKeys.getInt(1);
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
	}

	@Override
	public void baja(int id) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(DELETE);
			ps.setInt(1, id);
			// 3-Ejecutar la sentencia
			ps.executeUpdate();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
	}

	/**
	 * Metodo que retorna todos los usuarios registrados en la aplicacion
	 * @throws SQLException 
	 */
	@Override
	public Collection<Usuario> consulta() throws SQLException {
		Collection<Usuario> resultado = new HashSet<>();

		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(SELECT_TODOS);
			// 3-Ejecutar la sentencia
			ResultSet rs = ps.executeQuery();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.

			// Me posicionno en el primero
			if (rs.first()) {
				// Proceso el libro hasta que no haya siguiente
				do {
					// Procesar el libro
					Usuario usuario = new Usuario(
							rs.getString("nombre"), 
							new Date(rs.getDate("fecha").getTime()), 
							Genero.valueOf(rs.getString("genero")),
							rs.getFloat("altura"));
					resultado.add(usuario);
				} while (rs.next());
			}
			return resultado;
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
	}

	/**
	 * Metodo que retorna un usuario basandose en el identificador (id), que es
	 * la PK
	 * @throws SQLException 
	 */
	@Override
	public Usuario consulta(int id) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(SELECT_USUARIO_POR_ID);
			ps.setInt(1, id);
			// 3-Ejecutar la sentencia
			ResultSet rs = ps.executeQuery();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.

			// Posiciono el cursor
			if (rs.first()) {
				// Accedo a los campos del registro al que apuna e cursor
				Usuario usuario = new Usuario(
						rs.getString("nombre"), 
						new Date(rs.getDate("fecha").getTime()), 
						Genero.valueOf(rs.getString("genero")),
						rs.getFloat("altura"));
				usuario.setId(id);
				return usuario;
			}
			return null;
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
	}

}
