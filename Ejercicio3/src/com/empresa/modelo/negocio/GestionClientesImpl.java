package com.empresa.modelo.negocio;

import com.empresa.modelo.entidades.Cliente;
import com.empresa.persistencia.ClienteDao;

public class GestionClientesImpl implements GestionClientes {

	//Dependencia
	private ClienteDao clienteDao;

	//Inyeccion por Constructor, indica es que la dependencia es
	//obligatoria para el componente 
	public GestionClientesImpl(ClienteDao clienteDao) {
		super();
		this.clienteDao = clienteDao;
	}

	//Inyeccion por Setter
	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	@Override
	public void darDeAltaUnNuevoClienteEnLaAplicacion(Cliente cliente) {
		// 1-Se debera guardar el cliente en el entorno de persistencia
		clienteDao.alta(cliente);
		// 2-Se deberá enviar un mail al administrador informando del alta
		// 3-Se deberá asignar un comercial al cliente

	}

	@Override
	public void darDeBajaUnClienteExistenteEnLaAplicacion(Integer pk) {

		clienteDao.baja(pk);

	}

}
