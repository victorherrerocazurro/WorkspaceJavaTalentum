package com.busqueda.pareja.modelo.persistencia;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.modelo.persistencia.basededatos.memoria.BaseDeDatosEnMemoria;
import com.busqueda.pareja.utilidades.Genero;
import com.busqueda.pareja.utilidades.Tabla;

public class TestMemoriaUsuarioDao {

	private MemoriaUsuarioDao sut;
	
	//El señor que estabamos esperando que nos crease los objetos
	public TestMemoriaUsuarioDao() {
		BaseDeDatosEnMemoria bd = new BaseDeDatosEnMemoria();
		bd.crearTabla(Tabla.USUARIO);
		sut = new MemoriaUsuarioDao(bd);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeIntegracionEntreDaoYBaseDeDatos() {
		
		//Datos de Prueba de Entrada
		Usuario usuarioVictor = new Usuario("Victor", new Date(), Genero.MASCULINO	, 1.85f);
		Usuario usuarioMaria = new Usuario("Maria", new Date(), Genero.FEMENINO , 1.75f);
		int idDelUsuarioConIdUno = 1;
		
		//Dato de Prueba Esperado
		int idEsperadoDeAltaVictor = 1;
		int idEsperadoDeAltaMaria = 2;
		int tamannoEsperadoDeLaTablaDeUsuariosDespuesDeDosInserciones = 2;
		Usuario usuarioEsperadoConIdUno = usuarioVictor;
		int tammnnoEsperadoDeLaTablaDeUsuariosDespuesDeBorrarUno = 1;
		
		//La ejecucion de la logica a probar
		int idObtenidoDeAltaVictor = sut.alta(usuarioVictor);
		int idObtenidoDeAltaMaria = sut.alta(usuarioMaria);
		Collection<Usuario> todosLosUsuarios = sut.consulta();
		Usuario usuarioObtenidoConIdUno = sut.consulta(idDelUsuarioConIdUno);
		
		//Los asertos de las pruebas
		assertEquals(idEsperadoDeAltaVictor , idObtenidoDeAltaVictor);
		assertEquals(idEsperadoDeAltaMaria, idObtenidoDeAltaMaria);
		assertEquals(
				tamannoEsperadoDeLaTablaDeUsuariosDespuesDeDosInserciones, 
				todosLosUsuarios.size());
		assertEquals(usuarioEsperadoConIdUno, usuarioObtenidoConIdUno);
		
		//La ejecucion de la logica a probar
		sut.baja(idDelUsuarioConIdUno);
		Collection<Usuario> todosMenosElBorrado = sut.consulta();
		
		//Los asertos de las pruebas
		assertEquals(
				tammnnoEsperadoDeLaTablaDeUsuariosDespuesDeBorrarUno, 
				todosMenosElBorrado.size());
	}

	
	
	
	
	
	
	
	
	
}
