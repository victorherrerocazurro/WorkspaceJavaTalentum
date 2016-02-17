package com.empresa.modelo.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.empresa.modelo.entidades.Cliente;
import com.empresa.persistencia.ClienteDao;
import com.empresa.persistencia.MemoriaClienteDao;

public class TestGestionClienteImpl {

	// Resultado esperado
	@Test(expected = NullPointerException.class)
	public void testClienteDaoObligatorioEnAlta() {
		// Datos de Entrada
		ClienteDao datoEntrada = null;
		Cliente cliente = null; // Me da igual que valga

		// SUT
		GestionClientesImpl sut = new GestionClientesImpl(datoEntrada);

		// Ejecutar la logica
		sut.darDeAltaUnNuevoClienteEnLaAplicacion(cliente);

		fail("Not yet implemented");
	}

	/*@Test
	public void testFuncionamientoCorrectoDelAlta() {

		// Datos de Entrada
		ClienteDao clienteDao = new MemoriaClienteDao();
		Cliente cliente = new Cliente();

		// SUT
		GestionClientesImpl sut = new GestionClientesImpl(clienteDao);

		// Ejecutar la logica
		sut.darDeAltaUnNuevoClienteEnLaAplicacion(cliente);

		// No hay asertos, porquen ose espera un resultado, es un
		// no news, good news

	}*/

	// Resultado esperado
	@Test(expected = NullPointerException.class)
	public void testClienteDaoObligatorioEnBaja() {
		// Datos de Entrada
		ClienteDao datoEntrada = null;
		Integer pk = null; // Me da igual que valga

		// SUT
		GestionClientesImpl sut = new GestionClientesImpl(datoEntrada);

		// Ejecutar la logica
		sut.darDeBajaUnClienteExistenteEnLaAplicacion(pk);

		fail("Not yet implemented");
	}
	
	/*@Test
	public void testFuncionamientoCorrectoDeLaBaja() {

		// Datos de Entrada
		ClienteDao clienteDao = new MemoriaClienteDao();
		Integer pk = null;

		// SUT
		GestionClientesImpl sut = new GestionClientesImpl(clienteDao);

		// Ejecutar la logica
		sut.darDeBajaUnClienteExistenteEnLaAplicacion(pk);

		// No hay asertos, porquen ose espera un resultado, es un
		// no news, good news

	}*/

}
