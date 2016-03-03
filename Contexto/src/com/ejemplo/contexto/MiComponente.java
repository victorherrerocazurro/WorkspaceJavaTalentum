package com.ejemplo.contexto;

public class MiComponente extends ComponenteGenerico {

	public MiComponente() {
		String template = getParametroDeInicio("view-template");
		
		System.out.println("Esto da null -> " + template);
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		String template = getParametroDeInicio("view-template");
		
		System.out.println("Debe imprimir: "
									+ "/html/holamundo/index.jsp -> " 
									+ template);
	}

	@Override
	public void procesar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
