package com.biblioteca.modelo.negocio;

import java.sql.SQLException;
import java.util.Collection;

import com.biblioteca.modelo.entidades.Libro;
import com.biblioteca.persistencia.LibroDao;

public class NegocioImpl implements Negocio {

	private LibroDao dao;
	
	public NegocioImpl(LibroDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void nuevoLibro(Libro libro) throws Exception {
		//Ejecutar tyodas las tareas que comprende el requisito
		//nuevoLibro, por ejemplo
		//	--Dar de alta el nuevo libro en el entorno de persistencia
		dao.alta(libro);
		//	--Enviar un correo electronico al bibliotecario
		
		//	--Tramito el pago de la factura

	}

	@Override
	public Collection<Libro> consultar() throws Exception {
		return dao.consultaTodos();
	}

}
