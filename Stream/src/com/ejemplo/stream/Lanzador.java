package com.ejemplo.stream;

import java.io.IOException;
import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {

		System.out.println("Usuario dame el nombre del fichero: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String path = scanner.nextLine();
		
		ProcesadoDeFichero pdf = new ProcesadoDeFichero();
		
		try {
			String loLeido = pdf.leerFichero(path);
			
			System.out.println("Lo leido: " + loLeido);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
