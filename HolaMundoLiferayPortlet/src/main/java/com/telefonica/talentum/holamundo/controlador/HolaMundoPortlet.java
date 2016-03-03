package com.telefonica.talentum.holamundo.controlador;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class HolaMundoPortlet
 */
public class HolaMundoPortlet extends GenericPortlet {

	//Esto esta mal, ya que en el constructor todavia no se han
	//inicilizado las herrramientas de las que dispondrá el Portlet
	/*public HolaMundoPortlet() {
		viewTemplate = getInitParameter("view-template");
	}*/
	
	public HolaMundoPortlet() {
		// TODO Auto-generated constructor stub
	}
	
	//Esto está bien, porque en el init, ya estan inicializadas las
	//herramientas de las que dispone el Portlet, entre ellas, la 
	//capacidad de leer un elemento definido en el portlet.xml
	//como <init-param>
	@Override
    public void init() {
        viewTemplate = getInitParameter("view-template");
        viewTemplate = "/html/holamundo/view.jsp";
    }
	
	
	//RenderMode View
    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

    	// TODO me falta saber cuando decirle al include que view tiene que pintar
    	
        include(viewTemplate, renderRequest, renderResponse);
    }

    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
 
    }
 
    @Override
    public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
    	//super.processAction(request, response);
    	
    	//Recoger los prametros que me envia el cliente
    	
    	//Invocar el negocio
    	
    	//feedback
    	String mensaje = "Has llegado correctamente al Action!!!!!";
    	
    	//Hago accesible el feedback a la vista
    	request.setAttribute("mensaje", mensaje);
    	
    }
    
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(HolaMundoPortlet.class);

    
    
}
