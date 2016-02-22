package com.biblioteca.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

import javax.sql.DataSource;

import com.biblioteca.modelo.entidades.Libro;

public class MySqlLibroDao implements LibroDao {

	private static final String INSERT_LIBRO = "INSERT INTO Libros " 
			+ "(isbn,autor,titulo,num_paginas) "
			+ "VALUES (?,?,?,?)";

	private static final String DELETE_LIBRO = "DELETE FROM Libros " 
			+ "WHERE isbn = ?";

	private static final String UPDATE_LIBRO = "UPDATE Libros " 
			+ "SET autor = ?, titulo = ?, num_paginas = ? "
			+ "WHERE isbn = ?";

	private static final String SELECT_LIBRO_BY_ISBN = "SELECT * " 
			+ "FROM Libros " 
			+ "WHERE isbn = ?";

	private static final String SELECT_LIBRO = "SELECT * FROM Libros";

	private static final String SELECT_LIBRO_BY_AUTOR = "SELECT * "
			+ "FROM Libros "
			+ "WHERE autor = ?";

	private DataSource ds;

	public MySqlLibroDao(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void alta(Libro libro) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(INSERT_LIBRO);
			ps.setInt(1, libro.getIsbn());
			ps.setString(2, libro.getAutor());
			ps.setString(3, libro.getTitulo());
			ps.setInt(4, libro.getNumeroPaginas());
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

	@Override
	public void bajaPorIsbn(int isbn) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(DELETE_LIBRO);
			ps.setInt(1, isbn);
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

	@Override
	public void modifica(Libro libro) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(UPDATE_LIBRO);
			ps.setString(1, libro.getAutor());
			ps.setString(2, libro.getTitulo());
			ps.setInt(3, libro.getNumeroPaginas());
			ps.setInt(4, libro.getIsbn());
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

	@Override
	public Libro consultaPorIsbn(int isbn) throws SQLException {
		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(SELECT_LIBRO_BY_ISBN);
			ps.setInt(1, isbn);
			// 3-Ejecutar la sentencia
			ResultSet rs = ps.executeQuery();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.

			// Posiciono el cursor
			if (rs.first()) {
				// Accedo a los campos del registro al que apuna e cursor
				return new Libro(isbn, rs.getString("titulo"), rs.getString("autor"), rs.getInt("num_paginas"));
			}
			return null;
		} finally {
			// 5-Cerrar conexion
			if (connection != null) {
				connection.close();
			}
		}
	}

	@Override
	public Collection<Libro> consultaTodos() throws SQLException {

		Collection<Libro> resultado = new HashSet<>();

		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection.prepareStatement(SELECT_LIBRO);
			// 3-Ejecutar la sentencia
			ResultSet rs = ps.executeQuery();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.

			// Me posicionno en el primero
			if (rs.first()) {
				// Proceso el libro hasta que no haya siguiente
				do {
					// Procesar el libro
					Libro libro = new Libro(rs.getInt("isbn"), rs.getString("titulo"), rs.getString("autor"),
							rs.getInt("num_paginas"));
					resultado.add(libro);
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

	@Override
	public Collection<Libro> consultaPorAutor(String autor) throws SQLException {
		Collection<Libro> resultado = new HashSet<>();

		Connection connection = null;
		try {
			// 1-Obtener la conexion
			connection = ds.getConnection();
			// 2-Obtener el statament
			PreparedStatement ps = connection
							.prepareStatement(SELECT_LIBRO_BY_AUTOR);
			ps.setString(1, autor);
			// 3-Ejecutar la sentencia
			ResultSet rs = ps.executeQuery();
			// 4-(Opcional, Solo cuando sea una sentencia de tipo
			// executeQuery) Procesado de los resultados.

			// Me posicionno en el primero
			if (rs.first()) {
				// Proceso el libro hasta que no haya siguiente
				do {
					// Procesar el libro
					Libro libro = new Libro(rs.getInt("isbn"), rs.getString("titulo"), rs.getString("autor"),
							rs.getInt("num_paginas"));
					resultado.add(libro);
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

}
