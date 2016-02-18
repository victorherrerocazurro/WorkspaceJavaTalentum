package com.busqueda.pareja.modelo.persistencia;

import java.util.Collection;

import com.busqueda.pareja.modelo.entidades.Usuario;

public interface UsuarioDao {
	
	int alta(Usuario usuario);
	void baja(int id);
	Collection<Usuario> consulta();
	Usuario consulta(int id);
	
}
