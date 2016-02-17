package com.empresa.modelo.entidades;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private Integer id;
	private String nombre;
	private String apellido;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cliente(Integer id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//Como Obj puede apuntar a un objeto de cualquier tipologia
		//Y a mi me interesa en este caso una caracteristica de Cliente
		//que es el ID, necesito transformar (castear) la referencia
		//a una de tipo Cliente, pero antes tengo que comprobar que 
		//puedo realizar el casting
		
		//Validamos que obj apunta a un Cliente
		if(obj instanceof Cliente){
			//Abrimos la ventana para ver el metodo getId(), ya que con
			//una referencia de tipo Object, no veo getId()
			Cliente cliente = ((Cliente)obj);
			
			if(this.id.equals(cliente.id)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	//Debemos perseguir que objetos con el mismo hashcode sean iguales
	@Override
	public int hashCode() {
		if (this.id == null){
			return 0;
		} else {
			return this.id.hashCode();
		}
		
	}
	
}
