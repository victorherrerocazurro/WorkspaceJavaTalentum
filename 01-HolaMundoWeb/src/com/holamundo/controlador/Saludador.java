package com.holamundo.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Saludador
 */
@WebServlet("/Hola.html")
public class Saludador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Saludador() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hemos ejecutado la logica del Servlet");

		
		
		//Recogemos los parametros 
		String nombre = request.getParameter("nombre");
		
		
		//Pasamos objetos del controlador (Servlet) a la Vista (JSP)
		request.setAttribute("resultado", nombre);
		
		//Eligiendo la vista que procesara la respuesta
		RequestDispatcher despachador = request
							.getRequestDispatcher("/saludo.jsp");
		
		//Dirigiendo la ejecución a la vista
		despachador.forward(request, response);
		
		//Obtenemos la referencia al Stream de Salida 
//		PrintWriter writer = response.getWriter();
		
		//Escribimos el el stream de salida el texto que quiero 
		//retornar
//		writer.append("<p>Hola ");
//		writer.append(nombre);
//		writer.append("!!!!!</p>");
	}

}






