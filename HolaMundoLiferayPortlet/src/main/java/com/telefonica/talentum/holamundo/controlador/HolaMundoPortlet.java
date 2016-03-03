package com.telefonica.talentum.holamundo.controlador;

import java.io.IOException;

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
    }
	
	

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

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
 
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(HolaMundoPortlet.class);

}
