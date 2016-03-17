package com.meetic.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.meetic.model.UsuarioMeetic;

public class Reglas {

	public static boolean comprobarSiSonAfines(UsuarioMeetic elQueBusca, 
					UsuarioMeetic candidato) throws PortalException, SystemException {
		
		return // Que el candidato no sea igual al que busca
				!candidato.equals(elQueBusca)
				// Que la diferencia de Altura < 50cm
				&& Math.abs(candidato.getAltura() 
						- elQueBusca.getAltura()) < 0.50
				// Que la diferencia de Edad < 10 a�os
				&& Math.abs(candidato.getUserPortal().getBirthday().getTime() 
						- elQueBusca.getUserPortal().getBirthday().getTime()) 
																< 10 * 365 * 24 * 60 * 60 * 1000;
	}

	public static boolean comprobarSiSonIdeales(UsuarioMeetic elQueBusca, 
					UsuarioMeetic candidato) throws PortalException, SystemException {
		
		return 	// Que el candidato no sea igual al que busca
				!candidato.equals(elQueBusca)
				// Que la diferencia de Altura < 50cm
				&& Math.abs(candidato.getAltura() 
						- elQueBusca.getAltura()) < 0.10
				// Que la diferencia de Edad < 10 a�os
				&& Math.abs(candidato.getUserPortal().getBirthday().getTime() 
						- elQueBusca.getUserPortal().getBirthday().getTime()) 
																< 5 * 365 * 24 * 60 * 60 * 1000
				// Que el genero sea distinto
				&& !candidato.getUserPortal().getMale() == elQueBusca.getUserPortal().getMale();
	}
	
	
	
	
	
	
	
	
}
