package com.biblioteca.controlador;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
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

@WebServlet(value = { "/gestionLibro" })
public class GestionLibrosControlador extends HttpServlet {

	public static final String ATR_KEY_LIBROS = "listadoDeTodosLosLibros";
	public static final String ATR_KEY_MENSAJE = "mensaje";
	public static final String COMANDO_CONSULTA = "consulta";
	public static final String COMANDO_ALTA = "alta";
	public static final String ACCION = "accion";
	public static final String ISBN = "isbn";
	public static final String AUTOR = "autor";
	public static final String TITULO = "titulo";
	public static final String NUM_PAGINAS = "numPaginas";

	private static final long serialVersionUID = 1L;

	private Negocio negocio;

	public GestionLibrosControlador() {
		super();
		//Aunque aqui se podria inicializar Negocio, ya que no se 
		//necesita nada del Portlet para hacerlo, es mas correcto
		//hacerlo en el init()
	}

	@Override
	public void init() throws ServletException {
		super.init();
		// TODO La instanciación de el negocio y de todas
		// sus dependencias, no es responsabilidad del Controlador
		// pero en este momento, no hay nadie mas, que pueda
		// hacerse cargo de esta responsabilidad
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

		// 1-Recoger la información que le envia el Cliente,
		// la que hace referencia a la operacion
		String accion = req.getParameter(ACCION);

		// 2-Seleccionar la Logica Negocio que se ha de invocar
		// para cubrir la peticion del Cliente
		switch (accion) {
		case COMANDO_ALTA:
			// 1-Recoger la información que le envia el Cliente
			// la que hace referencia a los datos recibidos
			int isbn = Integer.parseInt(req.getParameter(ISBN));
			String titulo = req.getParameter(TITULO);
			String autor = req.getParameter(AUTOR);
			int numeroPaginas = Integer.parseInt(req.getParameter(NUM_PAGINAS));

			// 3-Adaptar lo que el cliente envia a lo que el
			// Negocio necesita
			Libro libro = new Libro(isbn, titulo, autor, numeroPaginas);

			try {
				// 4-Invocar el Negocio
				// 5-Recoger el feedback que retorna el Negocio
				// cuando las cosas van bien
				negocio.nuevoLibro(libro);
				// 6-Escoger que Vista se va a emplear para mostrar
				// el resultado de la operación al cliente.
				RequestDispatcher dispatcher = req.getRequestDispatcher("/alta.jsp");
				// 7-Enviar el feedback del Negocio a la Vista
				req.setAttribute(ATR_KEY_MENSAJE, "El libro se ha dado de alta correctamente");
				// 8-Invocar la vista
				dispatcher.forward(req, resp);

			} catch (Exception e) {
				// 5-Recoger el feedback que retorna el Negocio
				// cuando las cosas van mal
				e.printStackTrace();
				// 6-Escoger que Vista se va a emplear para mostrar
				// el resultado de la operación al cliente.
				RequestDispatcher dispatcher = req.getRequestDispatcher("/alta.jsp");
				// 7-Enviar el feedback del Negocio a la Vista
				req.setAttribute(ATR_KEY_MENSAJE, "El libro no ha podido darse de alta");
				// 8-Invocar la vista
				dispatcher.forward(req, resp);
			}
			break;

		case COMANDO_CONSULTA:
			// 1-Recoger la información que le envia el Cliente
			// la que hace referencia a los datos recibidos
			// 3-Adaptar lo que el cliente envia a lo que el
			// Negocio necesita
			try {
				// 4-Invocar el Negocio
				// 5-Recoger el feedback que retorna el Negocio
				// cuando las cosas van bien
				Collection<Libro> resultado = negocio.consultar();
				// 6-Escoger que Vista se va a emplear para mostrar
				// el resultado de la operación al cliente.
				RequestDispatcher dispatcher = req.getRequestDispatcher("/listarLibros.jsp");
				// 7-Enviar el feedback del Negocio a la Vista
				req.setAttribute(ATR_KEY_LIBROS, resultado);
				// 8-Invocar la vista
				dispatcher.forward(req, resp);

			} catch (Exception e) {
				// 5-Recoger el feedback que retorna el Negocio
				// cuando las cosas van mal
				e.printStackTrace();
				// 6-Escoger que Vista se va a emplear para mostrar
				// el resultado de la operación al cliente.
				RequestDispatcher dispatcher = req.getRequestDispatcher("/consultaError.jsp");
				// 7-Enviar el feedback del Negocio a la Vista
				req.setAttribute(ATR_KEY_MENSAJE, "La consulta no ha sido resuelta correctamente");
				// 8-Invocar la vista
				dispatcher.forward(req, resp);
			}

			break;

		default:
			RequestDispatcher dispatcher = req.getRequestDispatcher("/operacionErronea.jsp");
			req.setAttribute(ATR_KEY_MENSAJE, "La no es correcta solo se adminten alta y consulta");
			dispatcher.forward(req, resp);
			break;
		}
	}
}
