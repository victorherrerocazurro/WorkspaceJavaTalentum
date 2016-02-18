package com.busqueda.pareja.modelo.negocio;

import java.util.Collection;

import com.busqueda.pareja.modelo.entidades.Usuario;

public interface ServicioGestionParejas {
	
	void registroDeUsuarioEnLaAplicacion(Usuario usuario);
	void bajaDeUsuarioEnLaAplicacion(int loguin);
	Collection<Usuario> buscarAfines(int loguin);
	Usuario buscarIdeal(int loguin);
	
}
