package com.ejemplo.contexto;

public interface ComponenteManejado {

	//Metodos de Set de Caracteristicas Genericas
	
	void setParametroDeInicio(String key, String value);
	
	String getParametroDeInicio(String key);
	
	//Metodos del ciclo de vida
	
	void init();
	
	void procesar();
	
	void destroy();
	
}
