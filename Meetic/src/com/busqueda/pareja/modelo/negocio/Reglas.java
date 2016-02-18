package com.busqueda.pareja.modelo.negocio;

import com.busqueda.pareja.modelo.entidades.Usuario;

public class Reglas {

	public static boolean comprobarSiSonAfines(Usuario elQueBusca, Usuario candidato) {
		return // Que el candidato no sea igual al que busca
				!candidato.equals(elQueBusca)
				// Que la diferencia de Altura < 50cm
				&& Math.abs(candidato.getAltura() 
						- elQueBusca.getAltura()) < 0.50
				// Que la diferencia de Edad < 10 años
				&& Math.abs(candidato.getFechaNacimiento().getTime() 
						- elQueBusca.getFechaNacimiento().getTime()) 
																< 10 * 365 * 24 * 60 * 60 * 1000;
	}

	public static boolean comprobarSiSonIdeales(Usuario elQueBusca, Usuario candidato) {
		return 	// Que el candidato no sea igual al que busca
				!candidato.equals(elQueBusca)
				// Que la diferencia de Altura < 50cm
				&& Math.abs(candidato.getAltura() 
						- elQueBusca.getAltura()) < 0.10
				// Que la diferencia de Edad < 10 años
				&& Math.abs(candidato.getFechaNacimiento().getTime() 
						- elQueBusca.getFechaNacimiento().getTime()) 
																< 5 * 365 * 24 * 60 * 60 * 1000
				// Que el genero sea distinto
				&& !candidato.getGenero().equals(elQueBusca.getGenero());
	}
	
	
	
	
	
	
	
	
}
