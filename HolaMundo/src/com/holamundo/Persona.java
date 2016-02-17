package com.holamundo;

public class Persona {

	
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	//Nombre (caracteristica o atributo)
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(!nombre.toLowerCase().equals("segismundo")){
			this.nombre = nombre;
		}
	}

	//Metodo
	public String darSaludo(){
		return "Hola soy " + this.nombre;
	}
	
	public void presentar(){
		System.out.println(this.darSaludo());
	}
	
}
