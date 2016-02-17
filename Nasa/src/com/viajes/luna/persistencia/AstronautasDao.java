package com.viajes.luna.persistencia;

import com.viajes.luna.modelo.entidades.Astronauta;

public interface AstronautasDao extends Dao<Astronauta, Integer> {

	public Astronauta[] consultaPorNombre(String nombre);
	
}
