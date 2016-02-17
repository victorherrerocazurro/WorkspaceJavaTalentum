package com.empresa.persistencia;

import com.empresa.modelo.entidades.Cliente;

public interface ClienteDao {
	
	public Integer alta(Cliente cliente);
	
	public void baja(Integer pk);
	
	
}
