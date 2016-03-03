package com.ejemplo.contexto;

public class Contenedor {

	public void init(){
		
		//Logica que lee el fichero de configuracion portlet.xml,
		//y cada etiqueta <portlet> que se encuentre, buscara la
		//subetiqueta <portlet-class> e instanciara la clase que
		//alli se encuentre
		
		MiComponente componente1 = new MiComponente();
		
		//Y por cada subetiqueta <init-param> invocará el
		//metodo setParametroDeInicio()
		
		componente1
			.setParametroDeInicio("view-template", 
										"/html/holamundo/index.jsp");
		
		componente1.init();
		
		
		
	}
}
