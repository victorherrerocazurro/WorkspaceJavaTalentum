package com.busqueda.pareja.modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Date;

import javax.sql.DataSource;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.utilidades.Genero;

public class MySqlUsuarioDao implements UsuarioDao {

	private static final String INSERT = null;
	private DataSource ds;
	
	public MySqlUsuarioDao(DataSource ds) {
		super();
		this.ds = ds;
	}

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
			
			ResultSet generatedKeys = ps.getGeneratedKeys();
			
			generatedKeys.first();
			
			return generatedKeys.getInt(0);
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
		return 0;
	}

	@Override
	public void baja(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Usuario> consulta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario consulta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
