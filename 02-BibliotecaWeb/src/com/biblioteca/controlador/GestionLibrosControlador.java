package com.biblioteca.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp2.BasicDataSource;

import com.biblioteca.modelo.entidades.Libro;
import com.biblioteca.modelo.negocio.Negocio;
import com.biblioteca.modelo.negocio.NegocioImpl;
import com.biblioteca.persistencia.LibroDao;
import com.biblioteca.persistencia.MySqlLibroDao;

@WebServlet(value = {"/gestionLibro"})
public class GestionLibrosControlador extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Negocio negocio;
	
	public GestionLibrosControlador() {
		super();
		BasicDataSource ds= new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/libreria"); //cadena de conexion
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		
		
		LibroDao dao = new MySqlLibroDao(ds);
		negocio = new NegocioImpl(dao);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String accion = req.getParameter("accion");
		
		switch (accion) {
		case "alta":
			
			int isbn = Integer.parseInt(req.getParameter("isbn"));
			String titulo = req.getParameter("titulo");
			String autor = req.getParameter("autor");
			int numeroPaginas = Integer.parseInt(req.getParameter("numeroPaginas"));
			
			Libro libro = new Libro(isbn, titulo, autor, numeroPaginas);
			negocio.nuevoLibro(libro);
			break;
			
		case "consulta":
			break;

		default:
			break;
		}
		
		//el switch es igual que este if
	//	if(accion.equals("alta")){
			//Quiero hacer el alta del libro
			
		//}else if (accion.equals("consulta")){
			//Quiero hacer la consulta de todos los libros
		//}
		
		
		resp.getWriter().append("Esta es la respuesta del Servlet");
		
	}
}
