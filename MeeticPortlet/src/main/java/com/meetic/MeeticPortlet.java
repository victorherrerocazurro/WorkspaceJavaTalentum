package com.meetic;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.busqueda.pareja.modelo.negocio.ServicioGestionParejasImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class MeeticPortlet
 */
public class MeeticPortlet extends GenericPortlet {

	private String altaTemplate;
	private String loginTemplate;
	private String viewTemplate;
	
	private ServicioGestionParejasImpl negocio;

	private static Log _log = LogFactoryUtil.getLog(MeeticPortlet.class);

	//Inicialización del Portlet
	public void init() {
		viewTemplate = getInitParameter("view-template");
		altaTemplate = getInitParameter("alta-template");
		loginTemplate = getInitParameter("login-template");
		
		negocio = new ServicioGestionParejasImpl(null);
	}

	// Controlador: Permite acceder al Negocio
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		// 1-Recoger los parametros que me envian desde el formulario
		String accion = actionRequest.getParameter("accion_que_quiero_ejecutar");
		
		//Pongo el parametro de ActionRequest en RenderRequest
		String vista = actionRequest.getParameter("vista_a_la_que_quiero_ir");
		actionResponse.setRenderParameter("vista_a_la_que_quiero_ir", vista);

		switch (accion) {
		case "alta":
			// 1-Recoger los parametros que me envian desde el formulario
			String nombre= actionRequest.getParameter("nombre");
			//...........
			
			//negocio.registroDeUsuarioEnLaAplicacion(null);
			
			//6-Quiero que se pinte la vista menu
			
			
			
			break;
		case "login":

			break;
		case "afines":

			break;
		case "ideal":
			
			break;
		default:
			break;
		}

	}

	// Permite definir que vista se ha de pintar en la fase de Render
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String vista = renderRequest.getParameter("vista_a_la_que_quiero_ir");

		_log.info("La vista a la que queremos acceder es: " + vista);
		
		if (vista != null) {

			switch (vista) {
			case "index":
				include(viewTemplate, renderRequest, renderResponse);
				break;
			case "alta":
				include(altaTemplate, renderRequest, renderResponse);
				break;
			case "login":
				include(loginTemplate, renderRequest, renderResponse);
				break;
			case "menu":
				include("/html/meetic/menu.jsp", renderRequest, renderResponse);
				break;
			default:
				include(viewTemplate, renderRequest, renderResponse);
				break;
			}
		} else {
			include(viewTemplate, renderRequest, renderResponse);
		}
	}

	//Metodo de apoyo para abstraer la complejidad de hacer que una
	//vista forme parte de la fase de Render
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
