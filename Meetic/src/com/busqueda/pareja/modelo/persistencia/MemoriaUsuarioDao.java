package com.busqueda.pareja.modelo.persistencia;

import java.util.Collection;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.modelo.persistencia.basededatos.memoria.BaseDeDatosEnMemoria;

public class MemoriaUsuarioDao implements UsuarioDao {

	//En este caso como no hay interrface entre el Dao y la BaseDeDatos
	//no es necesario la inyeccion de dependencias, ya que no ganamos
	//poder desarrollar en paralelo las dos clases
	//private BaseDeDatosEnMemoria bd = new BaseDeDatosEnMemoria();
	
	private BaseDeDatosEnMemoria bd;
	
	public MemoriaUsuarioDao(BaseDeDatosEnMemoria bd) {
		super();
		this.bd = bd;
	}

	@Override
	public int alta(Usuario usuario) {
		return bd.insertarRegistroUsuario(usuario);
	}

	@Override
	public void baja(int id) {
		bd.borrarRegistroUsuarioPorIdentificador(id);
	}

	@Override
	public Collection<Usuario> consulta() {
		return bd.seleccionDeTodosLosUsuarios();
	}

	@Override
	public Usuario consulta(int id) {
		return bd.seleccionDeUsuariosPorId(id);
	}

}
