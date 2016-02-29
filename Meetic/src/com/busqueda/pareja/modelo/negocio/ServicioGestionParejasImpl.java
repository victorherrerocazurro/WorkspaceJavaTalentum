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
	public void registroDeUsuarioEnLaAplicacion(Usuario usuario) {
		try {
			int alta = usuarioDao.alta(usuario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO recordar esto cuando veamos JDBC
	}

	@Override
	public void bajaDeUsuarioEnLaAplicacion(int loguin) {
		usuarioDao.baja(loguin);
	}

	@Override
	public Collection<Usuario> buscarAfines(int loguin) {

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
	public Usuario buscarIdeal(int loguin) {

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
}
