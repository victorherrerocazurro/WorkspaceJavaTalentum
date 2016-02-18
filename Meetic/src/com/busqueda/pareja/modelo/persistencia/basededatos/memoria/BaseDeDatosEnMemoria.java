package com.busqueda.pareja.modelo.persistencia.basededatos.memoria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.utilidades.Tabla;

public class BaseDeDatosEnMemoria {

	// Crear un Map por cada Tabla
	private Map<Integer, Usuario> tablaUsuario;
	
	//Atributo que modela el campo autoincremental de tabla Usuario
	private int valorDePkDeTablaUsuario = 1;

	// Definir el lenguaje tipo el SQL

	public void crearTabla(Tabla tabla) {
		switch (tabla) {
		case USUARIO:
			tablaUsuario = new HashMap<>();
			break;
		}
	}
	
	public int insertarRegistroUsuario(Usuario usuario){
		
		usuario.setId(valorDePkDeTablaUsuario++);
		
		tablaUsuario.put(usuario.getId(), usuario);
		
		return usuario.getId();
		
	}
	
	public void borrarRegistroUsuarioPorIdentificador(int id){
		tablaUsuario.remove(id);
	}
	
	public Collection<Usuario> seleccionDeTodosLosUsuarios(){
		return tablaUsuario.values();
	}
	
	public Usuario seleccionDeUsuariosPorId(int id){
		return tablaUsuario.get(id);
	}
}







