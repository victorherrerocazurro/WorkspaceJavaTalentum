package com.consumidor;

import java.io.IOException;
import java.io.Serializable;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ConsumidorPortlet
 */
public class ConsumidorPortlet extends GenericPortlet {

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
 
    @ProcessEvent(qname="{http://ejemplo.eventos.com}mensaje")
    public void procesarMiEvento(EventRequest arg0, EventResponse arg1) throws PortletException, IOException {
    	Event evento = arg0.getEvent();
    	
    	Serializable mensaje = evento.getValue();
    	
    	//Esto es asi, porque aunque el valor del Evento, en este caso es un String
    	//de forma generica es un Serializable, y la unica forma de psar un serializable
    	//es con atributos
    	arg0.setAttribute("mensaje", mensaje);
    }
    
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(ConsumidorPortlet.class);

}
