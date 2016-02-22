package com.busqueda.pareja.modelo.persistencia;

import static org.junit.Assert.*;

import org.junit.Test;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.modelo.persistencia.basededatos.memoria.BaseDeDatosEnMemoria;

public class TestSut {

	@Test
	public void test() {
		//Datos de entrada de pruebas
		Usuario usuario = null;
		
		//Datos esperados de salida
		int resultadoEsperadoParaLaOperacionDeAlta = 10;
		
		//SUT
		MemoriaUsuarioDao sut = new MemoriaUsuarioDao(
									new BaseDeDatosEnMemoria());		
		
		//Ejecucion de las pruebas y recabar 
		//los datos obtenidos con ellas
		int resultadoObtenidoParaLaOperacionDeAlta = sut.alta(usuario);
		
		//Asertos
		assertEquals(resultadoEsperadoParaLaOperacionDeAlta, resultadoObtenidoParaLaOperacionDeAlta);
		
		
		fail("Not yet implemented");
	}

}
