package com.ejemplo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lanzador {

	public static void main(String[] args) {
		
		//String fecha = req.getParameter("Fecha");
		String fecha = "01/02/1965";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date fechaParseada = null;

			try {
				//El que apartir de un String obtiene un Date
				fechaParseada = sdf.parse(fecha);

				java.sql.Date date = new java.sql.Date(fechaParseada.getTime());
				
				metodo("pepe");
				
				System.out.println("Si la fecha de error, esto no se ejecuta");
				
				System.out.println("Esto tampoco");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NombreMenorQueDiezException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		
		
		

	}
	
	
	private static void metodo(String nombre) throws NombreMenorQueDiezException{
		if(nombre.length() < 10){
			throw new NombreMenorQueDiezException();
		}
		
		System.out.println("Como el nombre es de tamaño mayor que 10 no pasa nada");
	}
	

}
