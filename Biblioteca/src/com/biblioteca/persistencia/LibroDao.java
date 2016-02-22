package com.biblioteca.persistencia;

import java.sql.SQLException;
import java.util.Collection;

import com.biblioteca.modelo.entidades.Libro;

public interface LibroDao {

	void alta(Libro libro) throws SQLException;
	
	void bajaPorIsbn(int isbn) throws SQLException;
	
	void modifica(Libro libro) throws SQLException;
	
	Libro consultaPorIsbn(int isbn) throws SQLException;
	
	Collection<Libro> consultaTodos() throws SQLException;
	
	Collection<Libro> consultaPorAutor(String autor) throws SQLException;
	
}
