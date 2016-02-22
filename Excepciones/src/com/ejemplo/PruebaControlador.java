package com.ejemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaControlador {

	@Test
	public void test() {
		
		Controlador controlador = new Controlador(new Negocio(new Persistencia()));
		
		try {
			String resultadoObtenido = controlador.metodo();
			
			System.out.println(resultadoObtenido);
			
			
			System.out.println("Aunque hay error esto se ejecuta");
			
		} catch (MiPropiaExcepcion e) {
			fail("Se ha producido una excepcion no deseada");
			//System.out.println("Se ha producido un error");
		} finally {
			//Se ejecuta siempre, independientemente de si hay 
			//error o no
		}
		
		
		
		
		
	}

}
