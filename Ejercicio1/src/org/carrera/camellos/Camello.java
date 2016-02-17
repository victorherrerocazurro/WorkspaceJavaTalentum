package org.carrera.camellos;

public class Camello {

	public String jinete;
	public int dorsal;
	private int posicion = 0;
	
	public Camello(){
		
	}

	public Camello(String jinete, int dorsal){
		this.jinete = jinete;
		this.dorsal = dorsal;
	}

	/**
	 * Metodo que recibiendo un avance en %
	 * retorna la opsición del camello despues
	 * de contabilizar el avance
	 * @param avance
	 * @return posicion actualziada del camello
	 */
	
	public int avanzar(int avance) {
		posicion += avance;
		return posicion;
	}

}
