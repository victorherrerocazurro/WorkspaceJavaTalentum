package com.meetic;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.busqueda.pareja.modelo.entidades.Usuario;
import com.busqueda.pareja.modelo.negocio.ServicioGestionParejasImpl;
import com.busqueda.pareja.modelo.persistencia.MySqlUsuarioDao;
import com.busqueda.pareja.modelo.persistencia.UsuarioDao;
import com.busqueda.pareja.utilidades.Genero;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class MeeticPortlet
 */
public class MeeticPortlet extends GenericPortlet {

	public static final String ACCION_LOGIN_USUARIO = "loginUsuario";
	public static final String ACCION_ALTA_USUARIO = "altaUsuario";
	public static final String PATRON_FECHA = "dd/MM/yyyy";
	public static final String VISTA_ALTA = "alta";
	public static final String VISTA_MENU = "menu";
	public static final String VISTA_DESTINO = "vista_a_la_que_quiero_ir";
	public static final String NOMBRE = "nombre";

	private String altaTemplate;
	private String loginTemplate;
	private String viewTemplate;
	private String menuTemplate;
	private String afinesTemplate;
	private String idealTemplate;

	private ServicioGestionParejasImpl negocio;
	// El formato que defino como patron, se ha de adaptar a como me llegue
	// la fecha
	private SimpleDateFormat sdf = new SimpleDateFormat(PATRON_FECHA);

	private static Log _log = LogFactoryUtil.getLog(MeeticPortlet.class);

	// Inicialización del Portlet
	public void init() {
		viewTemplate = getInitParameter("view-template");
		altaTemplate = getInitParameter("alta-template");
		loginTemplate = getInitParameter("login-template");
		menuTemplate = getInitParameter("menu-template");
		afinesTemplate = getInitParameter("afines-template");
		idealTemplate = getInitParameter("ideal-template");

		BasicDataSource ds = new BasicDataSource();

		ds.setUrl("jdbc:mysql://localhost:3306/meetic");// cadena de
		// conexion
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");

		UsuarioDao usuarioDao = new MySqlUsuarioDao(ds);
		negocio = new ServicioGestionParejasImpl(usuarioDao);
	}

	// Controlador: Permite acceder al Negocio
	@ProcessAction(name = ACCION_ALTA_USUARIO)
	public void altaUsuario(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		// 1-Recoger los parametros que me envian desde el formulario
		String nombre = actionRequest.getParameter(NOMBRE);
		String fecha = actionRequest.getParameter("fecha");
		String altura = actionRequest.getParameter("altura");
		String genero = actionRequest.getParameter("genero");

		try {
			// 2-Adaptar los datos recogidos del formulario, porque son String,
			// a lo que nos pida el Negocio
			Usuario usuario = new Usuario(nombre, sdf.parse(fecha), Genero.valueOf(genero), Float.parseFloat(altura));

			// 3-Invocar el negocio
			negocio.registroDeUsuarioEnLaAplicacion(usuario);

			// 4-Recoger el feedback
			Integer id = usuario.getId();

			// 5-Como al buscar afines o ideal, vamos a necesitar tener este id,
			// lo almacenamos en la session y lo recuperaremos de alli, cuando
			// en los porcessAction de buscarAfines y buscarIdeal lo necesitemos
			actionRequest.getPortletSession().setAttribute("idUsuario", id);

			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("nombreUsuario", usuario.getNombre());

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, VISTA_MENU);

		} catch (NumberFormatException | ParseException | SQLException e) {

			e.printStackTrace();

			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("mensaje", "Revisa los datos enviados");

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, VISTA_ALTA);
		}
	}

	@ProcessAction(name = ACCION_LOGIN_USUARIO)
	public void loginUsuario(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException {
		// 1-Recoger los parametros que me envian desde el formulario
		String stId = actionRequest.getParameter("id");
		// 2-Adaptar los datos recogidos del formulario, porque son String,
		// a lo que nos pida el Negocio
		int id = Integer.parseInt(stId);

		try {
			// 3-Invocar el negocio
			// 4-Recoger el feedback
			Usuario usuario = negocio.login(id);

			// 5-Como al buscar afines o ideal, vamos a necesitar tener este id,
			// lo almacenamos en la session y lo recuperaremos de alli, cuando
			// en los porcessAction de buscarAfines y buscarIdeal lo necesitemos
			actionRequest.getPortletSession().setAttribute("idUsuario", id);

			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("nombreUsuario", usuario.getNombre());

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, VISTA_MENU);

		} catch (Exception e) {
			e.printStackTrace();

			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("mensaje", "Revisa los datos enviados");

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, "login");
		}
	}

	@ProcessAction(name = "busquedaAfines")
	public void busquedaAfines(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException {
		// 1-Recoger los parametros que me envian desde el formulario
		int id = (int) actionRequest.getPortletSession().getAttribute("idUsuario");

		try {
			// 3-Invocar el negocio
			// 4-Recoger el feedback
			Collection<Usuario> afines = negocio.buscarAfines(id);
			// 5-Hacer accesible a la vista el feedback
			actionRequest.setAttribute("afines", afines);
			// 6-Elegir la vista
			actionResponse.setRenderParameter(VISTA_DESTINO, "afines");
		} catch (SQLException e) {
			e.printStackTrace();
			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("mensaje", "Algo ha ido mal, no se el que");

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, "menu");
		}
	}

	@ProcessAction(name = "busquedaIdeal")
	public void busquedaIdeal(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException {
		// 1-Recoger los parametros que me envian desde el formulario
		int id = (int) actionRequest.getPortletSession().getAttribute("idUsuario");

		try {
			// 3-Invocar el negocio
			// 4-Recoger el feedback
			Usuario ideal = negocio.buscarIdeal(id);
			// 5-Hacer accesible a la vista el feedback
			actionRequest.setAttribute("ideal", ideal);
			// 6-Elegir la vista
			actionResponse.setRenderParameter(VISTA_DESTINO, "ideal");
		} catch (SQLException e) {
			e.printStackTrace();
			// 5-Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			actionRequest.setAttribute("mensaje", "Algo ha ido mal, no se el que");

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			actionResponse.setRenderParameter(VISTA_DESTINO, "menu");
		}
	}

	// Permite definir que vista se ha de pintar en la fase de Render
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String vista = renderRequest.getParameter(VISTA_DESTINO);

		_log.info("La vista a la que queremos acceder es: " + vista);

		if (vista != null) {

			switch (vista) {
			case "index":
				include(viewTemplate, renderRequest, renderResponse);
				break;
			case VISTA_ALTA:
				include(altaTemplate, renderRequest, renderResponse);
				break;
			case "login":
				include(loginTemplate, renderRequest, renderResponse);
				break;
			case VISTA_MENU:
				include(menuTemplate, renderRequest, renderResponse);
				break;
			case "afines":
				include(afinesTemplate, renderRequest, renderResponse);
				break;
			case "ideal":
				include(idealTemplate, renderRequest, renderResponse);
				break;
			default:
				include(viewTemplate, renderRequest, renderResponse);
				break;
			}
		} else {
			include(viewTemplate, renderRequest, renderResponse);
		}
	}

	// Metodo de apoyo para abstraer la complejidad de hacer que una
	// vista forme parte de la fase de Render
	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}
}