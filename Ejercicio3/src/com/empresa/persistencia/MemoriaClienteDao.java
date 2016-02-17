package com.empresa.persistencia;

import java.util.Collection;
import java.util.Map;

import com.empresa.modelo.entidades.Cliente;
import com.empresa.persistencia.memoria.BaseDeDatos;

public class MemoriaClienteDao implements ClienteDao {

	//Dependencia
	private BaseDeDatos bd;
	
	public MemoriaClienteDao(BaseDeDatos bd) {
		super();
		this.bd = bd;
	}

	@Override
	public Integer alta(Cliente cliente) {
		
		bd.insertarRegistroEnTablaClientes(cliente);
		
		return null;
	}

	@Override
	public void baja(Integer pk) {
		
		bd.borrarRegistroEnTablaClientes(pk);
		
	}
	
	public Collection<Cliente> consultaTodos(){
		
	}

	

}
