package com.ejemplo.contexto;

import java.util.HashMap;
import java.util.Map;

public abstract class ComponenteGenerico implements ComponenteManejado {

	private Map<String, String> parametrosDeInicio = new HashMap<>();
	
	@Override
	public void setParametroDeInicio(String key, String value) {
		parametrosDeInicio.put(key, value);
	}

	@Override
	public String getParametroDeInicio(String key) {
		return parametrosDeInicio.get(key);
	}

	

}
