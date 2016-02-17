package com.empresa.modelo.negocio;

import com.empresa.modelo.entidades.Cliente;

public interface GestionClientes {
	public void darDeAltaUnNuevoClienteEnLaAplicacion(Cliente cliente);
	
	public void darDeBajaUnClienteExistenteEnLaAplicacion(Integer pk);
}
