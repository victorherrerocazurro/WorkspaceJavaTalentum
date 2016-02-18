package com.busqueda.pareja.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import com.busqueda.pareja.utilidades.Genero;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id; //PK
	private String nombre;
	private Date fechaNacimiento;
	private Genero genero;
	//private Float altura;//Seria posible asignar un NULL
	private float altura;
	
	public Usuario() {
		super();
	}

	//Estamos indicando al no aceptar el Id como parametro del
	//constructor, que el Id es autogenerado
	public Usuario(String nombre, Date fechaNacimiento, Genero genero, float altura) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.altura = altura;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero="
				+ genero + ", altura=" + altura + "]";
	}
	
}
