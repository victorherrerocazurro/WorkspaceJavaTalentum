package com.ejemplo;

public class Controlador {
	private Negocio negocio;
	
	public Controlador(Negocio negocio) {
		super();
		this.negocio = negocio;
	}

	public String metodo() throws MiPropiaExcepcion{
		return negocio.metodo();
	}
	
	
}
