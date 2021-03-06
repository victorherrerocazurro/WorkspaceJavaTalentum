package com.busqueda.pareja.modelo.persistencia;

import java.sql.SQLException;
import java.util.Collection;

import com.busqueda.pareja.modelo.entidades.Usuario;

public interface UsuarioDao {
	
	int alta(Usuario usuario) throws SQLException;
	void baja(int id) throws SQLException;
	Collection<Usuario> consulta() throws SQLException;
	Usuario consulta(int id) throws SQLException;
	
}
