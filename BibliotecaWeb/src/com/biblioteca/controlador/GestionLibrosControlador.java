package com.biblioteca.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.biblioteca.modelo.entidades.Libro;
import com.biblioteca.modelo.negocio.Negocio;
import com.biblioteca.modelo.negocio.NegocioImpl;
import com.biblioteca.persistencia.LibroDao;
import com.biblioteca.persistencia.MySqlLibroDao;

@WebServlet(value = { "/gestionLibro" })
public class GestionLibrosControlador extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Negocio negocio;

	public GestionLibrosControlador() {
		super();
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/biblioteca");// cadena de
															// conexion
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
			int numeroPaginas = Integer
							.parseInt(req.getParameter("numPaginas"));
			
			Libro libro = new Libro(isbn, titulo, autor, numeroPaginas);
			negocio.nuevoLibro(libro );
			break;

		case "consulta":

			break;

		default:
			break;
		}

		resp.getWriter().append("Esta es la respuesta del Servlet");

	}

}
