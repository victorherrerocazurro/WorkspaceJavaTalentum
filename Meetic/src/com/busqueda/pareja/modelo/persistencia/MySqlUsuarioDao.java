package com.busqueda.pareja.modelo.persistencia;

import java.util.Collection;
import java.util.Date;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.utilidades.Genero;

public class MySqlUsuarioDao implements UsuarioDao {

	@Override
	public int alta(Usuario usuario) {
		// Paso a paso
		
		Date fechaQueTengo = new Date();//Hoy
		
		long milisengundosDesde1970 
					= fechaQueTengo.getTime();
		
		java.sql.Date fechaQueQuiero 
					= new java.sql.Date(milisengundosDesde1970);
		
		
		Genero.MASCULINO.toString();
		
		
		
		//Lo que tendremos que poner en nuestor dao
		
		/*ps.setString(1,usuario.getGenero().toString());
		
		ps.setDate(2,
				new java.sql.Date(
						usuario.getFechaNacimiento().getTime()));
		
		*/
		return 0;
	}

	@Override
	public void baja(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Usuario> consulta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario consulta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
