package com.biblioteca.persistencia;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import com.biblioteca.modelo.entidades.Libro;

public class TestMySqlLibroDao {

	@Test
	public void test() {
		//Datos de entrada
		Libro libro = new Libro(12345, "El Quijote", "Cervantes", 545);
		//Datos esperado de Salida
		
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/biblioteca");// cadena de conexion
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		//sut
		MySqlLibroDao sut = new MySqlLibroDao(ds);
		//Ejecución
		try {
			sut.alta(libro);
			
			Libro libroObtenido = sut.consultaPorIsbn(libro.getIsbn());
			
			//Assertos
			assertEquals(libro, libroObtenido);
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Se produce un SQLException, y no deberia: " + e.getMessage());
		}
	}

}
