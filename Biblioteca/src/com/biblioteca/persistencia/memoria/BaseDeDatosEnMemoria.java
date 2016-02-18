package com.biblioteca.persistencia.memoria;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.biblioteca.modelo.entidades.Libro;

public class BaseDeDatosEnMemoria {

	private Map<Integer, Libro> tablaLibros = null;
	
	/**
	 * Me permite inicializar la tabla de Libros
	 * Equivale a invocar en SQL la sentencia de CREATE TABLE
	 */
	public void createTablaLibros(){
		tablaLibros = new HashMap<>();
	}
	
	public void insertarUnLibro(Libro libro){
		tablaLibros.put(libro.getIsbn(), libro);
	}
	
	public void borrarUnLibroPorIsbn(int isbn){
		tablaLibros.remove(isbn);
	}
	
	/**
	 * 
	 * @param libro tendra el ISBN antiguo, el ya existente, ya que no
	 * se puede modificar por ser la PK y los datos nuevos
	 */
	public void modificarUnLibro(Libro libro){
		this.insertarUnLibro(libro);
	}
	
	public Libro consultarUnLibroPorIsbn(int isbn){
		/*Libro libro = tablaLibros.get(isbn);
		return libro;*/
		return tablaLibros.get(isbn);
	}	
	
	public Collection<Libro> consultarTodosLosLibros(){
		return tablaLibros.values();
	}
	
	public Collection<Libro> consultarLibrosPorAutor(String autor){
		Collection<Libro> libros = tablaLibros.values();
		
		Collection<Libro> resultado = new HashSet<>();
		
		for (Libro libro : libros) {
			if(libro.getAutor().equals(autor)){
				resultado.add(libro);
			}
		}
		
		return resultado;
	}
}
