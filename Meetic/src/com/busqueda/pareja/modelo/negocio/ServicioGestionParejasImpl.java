package com.busqueda.pareja.modelo.negocio;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.modelo.persistencia.UsuarioDao;

public class ServicioGestionParejasImpl implements ServicioGestionParejas {

	private UsuarioDao usuarioDao;
	
	public ServicioGestionParejasImpl(UsuarioDao usuarioDao) {
		super();
		this.usuarioDao = usuarioDao;
	}

	@Override
	public void registroDeUsuarioEnLaAplicacion(Usuario usuario) throws SQLException {
		int idGenerado = usuarioDao.alta(usuario);
		usuario.setId(idGenerado);
	}

	@Override
	public void bajaDeUsuarioEnLaAplicacion(int loguin) throws SQLException {
		usuarioDao.baja(loguin);
	}

	@Override
	public Collection<Usuario> buscarAfines(int loguin) throws SQLException {

		Collection<Usuario> afines = new HashSet<>();
		
		Usuario elQueBusca = usuarioDao.consulta(loguin);
		Collection<Usuario> candidatosConElQuebuscaIncluido 
										= usuarioDao.consulta();
		
		for (Usuario candidato : candidatosConElQuebuscaIncluido) {
			//Se tiene que cumplir que
			if(Reglas.comprobarSiSonAfines(elQueBusca, candidato)){
				afines.add(candidato);
			}
		}
		return afines;
	}

	@Override
	public Usuario buscarIdeal(int loguin) throws SQLException {

		Usuario elQueBusca = usuarioDao.consulta(loguin);
		Collection<Usuario> candidatosConElQuebuscaIncluido 
										= usuarioDao.consulta();
		
		for (Usuario candidato : candidatosConElQuebuscaIncluido) {
			//Se tiene que cumplir que
			if(Reglas.comprobarSiSonIdeales(elQueBusca, candidato)){
				return candidato;
			}
		}
		
		return null;
	}

	/**
	 * Metodo que recibiendo el identificador de un usuario, retornara
	 * el Usuario si encuentra un usuario en la base de datos con ese id y
	 * lanza una excepcion si no encuentra un usuario con ese id
	 */
	@Override
	public Usuario login(int id) throws Exception {
		Usuario usuario = usuarioDao.consulta(id);
		
		if(usuario != null){
			return usuario;
		} else {
			throw new Exception("El login es incorrecto");
		}
		
		
	}
}
