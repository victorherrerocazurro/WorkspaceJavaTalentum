package com.busqueda.pareja.modelo.negocio;

import java.util.Collection;

import com.busqueda.pareja.modelo.entidades.Usuario;

public interface ServicioGestionParejas {
	
	void registroDeUsuarioEnLaAplicacion(Usuario usuario) throws Exception;
	void bajaDeUsuarioEnLaAplicacion(int loguin) throws Exception;
	Collection<Usuario> buscarAfines(int loguin) throws Exception;
	Usuario buscarIdeal(int loguin) throws Exception;
	
	//ProcesoDeLoguin
	Usuario login(int id) throws Exception;
	
}
