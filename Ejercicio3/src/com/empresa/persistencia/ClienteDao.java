package com.empresa.persistencia;

import com.empresa.modelo.entidades.Cliente;

public interface ClienteDao {
	
	/**
	 * Metodo que da de alta en la persistencia un Cliente 
	 * retornando el Id generado
	 * @param cliente
	 * @return un Integer que representa el Id autogenerado
	 */
	public Integer alta(Cliente cliente);
	
	public void baja(Integer pk);
	
	
}
