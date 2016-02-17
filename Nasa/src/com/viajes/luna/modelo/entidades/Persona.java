package com.viajes.luna.modelo.entidades;

public abstract class Persona extends Entidad {
	private String nombre;
	private String apellido;
	private char genero; //M y F
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, char genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public abstract void comer();
	
}
