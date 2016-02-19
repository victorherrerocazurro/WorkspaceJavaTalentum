package com.ejemplo;

public class Lanzador {

	public static void main(String[] args) {

		Persona persona = new Persona("Victor");
		
		System.out.println("La persona antes: " + persona);
		
		modificarPersona(persona);
		
		System.out.println("La persona despues: " + persona);
		
		int j = 1;
		
		modificarEntero(j);
		
		persona = modificarPersonaPorAsignacion(persona);

	}
	
	public static void modificarPersona(Persona p){
		//No modifica la referencia del metodo invocante
		//p = new Persona("Pepe");
		p.setNombre("Pepe");
	}
	
	public static void modificarEntero(int i){
		i = 3;
	}
	
	public static Persona modificarPersonaPorAsignacion(Persona p){
		p = new Persona("Pepe");
		return p;
	}
}










