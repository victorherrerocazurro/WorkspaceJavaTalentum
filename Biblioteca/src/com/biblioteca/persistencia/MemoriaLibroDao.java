package com.biblioteca.persistencia;

import java.util.Collection;

import com.biblioteca.modelo.entidades.Libro;
import com.biblioteca.persistencia.memoria.BaseDeDatosEnMemoria;

public class MemoriaLibroDao implements LibroDao {

	private BaseDeDatosEnMemoria bd;
	
	public MemoriaLibroDao(BaseDeDatosEnMemoria bd) {
		super();
		this.bd = bd;
	}

	@Override
	public void alta(Libro libro) {
		bd.insertarUnLibro(libro);		
	}

	@Override
	public void bajaPorIsbn(int isbn) {
		bd.borrarUnLibroPorIsbn(isbn);		
	}

	@Override
	public void modifica(Libro libro) {
		bd.modificarUnLibro(libro);		
	}

	@Override
	public Libro consultaPorIsbn(int isbn) {
		return bd.consultarUnLibroPorIsbn(isbn);
	}

	@Override
	public Collection<Libro> consultaTodos() {
		return bd.consultarTodosLosLibros();
	}

	@Override
	public Collection<Libro> consultaPorAutor(String autor) {
		return bd.consultarLibrosPorAutor(autor);
	}

	
	
	
	

}
