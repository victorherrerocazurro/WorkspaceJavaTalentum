package com.empresa.persistencia.memoria;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.modelo.entidades.Cliente;

public class BaseDeDatos {

	//Atributos para cada tabla
	private Map<Integer, Cliente> tablaClientes;
	
	private int valorDeLaClaveDeClientes = 1;
	
	//Creo el lenguaje para poder interaccionar con la tabla
	
	//1-Crear la tabla
	public void createTablaClientes(){
		tablaClientes = new HashMap<>();
	}
	
	//2-Insertar un registro en la tabla Clientes
	//Retornamos el Integer, que representa el Id autogenerado
	public Integer insertarRegistroEnTablaClientes(Cliente cliente){
		//Asociamos el nuevo ID al campo de la tabla
		cliente.setId(valorDeLaClaveDeClientes);
		//Asociamos en nuevo ID al indice de busqueda, a parte de
		//insertar el registro en la tabla
		tablaClientes.put(cliente.getId(), cliente);
		//Incrementamos el contador de la PK
		valorDeLaClaveDeClientes++;
		return cliente.getId();
	}
	
	//3-Borrar un registro de la tabla de Clientes
	public void borrarRegistroEnTablaClientes(Integer id){
		tablaClientes.remove(id);
	}
	
	
}






