package com.biblioteca.persistencia;

import java.sql.SQLException;
import java.util.Collection;

import com.biblioteca.modelo.entidades.Libro;

public interface LibroDao {

	void alta(Libro libro) throws SQLException;
	
	void bajaPorIsbn(int isbn);
	
	void modifica(Libro libro);
	
	Libro consultaPorIsbn(int isbn);
	
	Collection<Libro> consultaTodos();
	
	Collection<Libro> consultaPorAutor(String autor);
	
}
