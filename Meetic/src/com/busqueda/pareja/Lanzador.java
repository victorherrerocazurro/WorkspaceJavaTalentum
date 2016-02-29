package com.busqueda.pareja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.utilidades.Genero;

public class Lanzador {
	
	public static void main(String[] args) {
		
		String stGenero = "M"; //"F", "Masculino", "Femenino", "Masc", "Fem", "Hembra", "Macho"
		String stFecha = "01/02/2016";
		String stAltura = "1.23";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Genero genero = parsearStringAGenero(stGenero);
			
			Date fecha = sdf.parse(stFecha);
			
			float altura = Float.parseFloat(stAltura);
			
			new Usuario("", fecha , genero, altura);
			
		} catch (ParseGeneroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Usuario tiene que escribir el genero "
					+ "como M, o Masculino o Masc para MAsculino y F, "
					+ "Femenino o Fem para Femenino");
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("La fecha debe escribirse "
					+ "en formato dd/MM/yyyy");
		}
		
		
		
	}

	/**
	 * Metodo que recibiendo un String, que puede valer
	 * 	M, Masculino, Masc para el genero Masculino
	 * 	F, Femenino, Fem para el genero Femenino
	 * Retorna una constante del enumerado Genero	 * 
	 * 
	 * @param genero
	 * @return
	 * @throws ParseGeneroException
	 */
	private static Genero parsearStringAGenero(String genero) throws ParseGeneroException {
		if(genero.equals("M")
				|| genero.equals("Masculino") 
				|| genero.equals("Masc")){
			return  Genero.MASCULINO;
		} else if (genero.equals("F") 
				|| genero.equals("Femenino") 
				|| genero.equals("Fem")){
			return Genero.FEMENINO;
		} else {
			//El genero que me envian no es valido
			throw new ParseGeneroException();
		}
	}
	
}
