package com.empresa;

import com.empresa.modelo.entidades.Cliente;
import com.empresa.persistencia.MemoriaClienteDao;
import com.empresa.persistencia.memoria.BaseDeDatos;

public class Lanzador {

	public static void main(String[] args) {

		BaseDeDatos baseDeDatos = new BaseDeDatos();
		
		baseDeDatos.createTablaClientes();
		
		MemoriaClienteDao memoriaClienteDao 
							= new MemoriaClienteDao(baseDeDatos);
		
		Cliente cliente = new Cliente(null, "Victor", "Herrero");
		
		memoriaClienteDao.alta(cliente);
		
	}

}
