package com.biblioteca.persistencia;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

import com.biblioteca.modelo.entidades.Libro;

public class MySqlLibroDao implements LibroDao {

	private DataSource ds;
	
	public MySqlLibroDao(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void alta(Libro libro) throws SQLException {
		//1-Obtener la conexion
		Connection connection = ds.getConnection();
		
	}

	@Override
	public void bajaPorIsbn(int isbn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifica(Libro libro) {
		// TODO Auto-generated method stub

	}

	@Override
	public Libro consultaPorIsbn(int isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Libro> consultaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Libro> consultaPorAutor(String autor) {
		// TODO Auto-generated method stub
		return null;
	}

}
