package com.viajes.luna.modelo.negocio;

import java.util.Date;

import com.viajes.luna.modelo.entidades.Viaje;
import com.viajes.luna.persistencia.ContratoDePersistencia;

public class Negocio {
	
	//Dependencia
	private ContratoDePersistencia persistencia = null;
	
	//Inyeccion por constructor
	public Negocio(ContratoDePersistencia p) {
		super();
		this.persistencia = p;
	}
	
	//Inyeccion por Setter
	public void setPersistencia(ContratoDePersistencia persistencia) {
		this.persistencia = persistencia;
	}

	public void darDeAltaElViaje(Viaje viaje){
		
		//Completar los datos del Viaje que el usuario que ordena 
		//el alta no conoce
		Date fechaDeSalida = this.calcularFechaDeSalida();
		viaje.setFechaDePartida(fechaDeSalida);
		
		//Delegar en otro componente que es especialista en
		//trabajar con la BD (en concreto con la tabla de Viajes)
		persistencia.insertarViaje(viaje);
		
	}
	
	public Date calcularFechaDeSalida(){
		return new Date();		
	}
}
