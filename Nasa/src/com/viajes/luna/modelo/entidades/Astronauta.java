package com.viajes.luna.modelo.entidades;

public class Astronauta extends Persona{

	private float altura;
	private float peso;

	public Astronauta(String nombre, String apellido, char genero, float altura, float peso) {
		super(nombre, apellido, genero);
		this.altura = altura;
		this.peso = peso;
	}
	public Astronauta() {
		super();
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public void comer() {
		System.out.println("Come un pollo de plastico");
	}
	
}
