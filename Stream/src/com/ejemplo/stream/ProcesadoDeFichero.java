package com.ejemplo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcesadoDeFichero {

	public String leerFichero(String path) throws IOException {

		File file = new File(path);

		// Pondriamos Catch si alguna de estas comprobaciones se da:
		// 1-Podemos solventar el problema
		// 2-Podemos tomar un camino alternativo al que nos da el
		// problema para realizar la tarea
		// 3-Es nuestra responsabilidad avisar al usuario que nos pidio
		// que realizasemos la terea, que no hemos podido
		// InputStream is = new FileInputStream(file);

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String miCadenaLeida = null;
		
		StringBuilder sb = new StringBuilder();

		while ((miCadenaLeida = br.readLine()) != null) {
			sb.append(miCadenaLeida);
		}

		return sb.toString();
	}
	
	
	

}
