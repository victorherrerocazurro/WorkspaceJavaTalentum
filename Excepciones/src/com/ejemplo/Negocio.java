package com.ejemplo;

public class Negocio {

	private Persistencia persistencia;
	
	public Negocio(Persistencia persistencia) {
		super();
		this.persistencia = persistencia;
	}

	public String metodo() throws MiPropiaExcepcion {
		return persistencia.metodo();
	}

}
