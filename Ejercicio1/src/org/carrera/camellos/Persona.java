package org.carrera.camellos;

public class Persona extends Object{
	private String nombre;

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Persona p){
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		return nombre.equals(obj);
	}
	
}
