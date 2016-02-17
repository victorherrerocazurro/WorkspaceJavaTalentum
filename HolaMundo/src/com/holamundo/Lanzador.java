package com.holamundo;

public class Lanzador {

	public static void main(String[] args) {

		//Ejercicio 1
		System.out.println("Hola Mundo!!!!!");

		//Ejercicio2
		Persona variableJuan = new Persona("Manuel");
		
		System.out.println(variableJuan.getNombre());
		
		variableJuan.setNombre("Miguel");
		
		System.out.println(variableJuan.getNombre());
		
		variableJuan.setNombre("Segismundo");
		
		System.out.println(variableJuan.getNombre());
		
		//variableJuan.nombre = "Juan";
		
		//System.out.println(variableJuan.nombre);
		
		variableJuan.presentar();
		
		Persona variableMaria = new Persona(null);
		
		//variableMaria.nombre = "Maria";
		
		variableMaria.presentar();
		
	}

}
