package com.viajes.luna.modelo.entidades;

import java.util.Date;

public class Viaje extends Entidad{
	
	//Atributos/Caracteristicas
	private Date fechaDePartida;
	private Date fechaDeRetorno;
	private Astronauta[] tripulacion;
	private ControladorAereo[] controladoresAereos;
	
	public Viaje() {
		super();
	}
	public Viaje(Date fechaDePartida, Date fechaDeRetorno, Astronauta[] tripulacion,
			ControladorAereo[] controladoresAereos) {
		super();
		this.fechaDePartida = fechaDePartida;
		this.fechaDeRetorno = fechaDeRetorno;
		this.tripulacion = tripulacion;
		this.controladoresAereos = controladoresAereos;
	}
	
	public Date getFechaDePartida() {
		return fechaDePartida;
	}
	public void setFechaDePartida(Date fechaDePartida) {
		this.fechaDePartida = fechaDePartida;
	}
	public Date getFechaDeRetorno() {
		return fechaDeRetorno;
	}
	public void setFechaDeRetorno(Date fechaDeRetorno) {
		this.fechaDeRetorno = fechaDeRetorno;
	}
	public Astronauta[] getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(Astronauta[] tripulacion) {
		this.tripulacion = tripulacion;
	}
	public ControladorAereo[] getControladoresAereos() {
		return controladoresAereos;
	}
	public void setControladoresAereos(ControladorAereo[] controladoresAereos) {
		this.controladoresAereos = controladoresAereos;
	}	
}
