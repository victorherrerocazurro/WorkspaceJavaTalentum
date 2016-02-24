package com.biblioteca.modelo.negocio;

import java.util.Collection;

import com.biblioteca.modelo.entidades.Libro;

public interface Negocio {
	
	void nuevoLibro(Libro libro) throws Exception;
	
	Collection<Libro> consultar() throws Exception;
}
