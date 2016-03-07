package com.productor;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ProductorPortlet
 */
public class ProductorPortlet extends GenericPortlet {

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
 
    @ProcessAction(name="enviarEvento")
    public void enviarEvento(ActionRequest arg0, ActionResponse arg1) throws PortletException, IOException {
    	
    	//La logica propia de este process action y ademas, en este caso
    	//enviamos el evento
    	
    	String nombre = arg0.getParameter("nombre");
    	
    	QName qname = new QName("http://ejemplo.eventos.com", "mensaje", "x");
		arg1.setEvent(qname, "Hola " + nombre + " desde el Productor!!!");
		//Alternativa, que es pasarlo como String
		//arg1.setEvent("{http://ejemplo.eventos.com}mensaje", "Hola desde el Productor!!!");
		
    }
    
    @ProcessAction(name="alta")
    public void alta(ActionRequest arg0, ActionResponse arg1) throws PortletException, IOException {
    	
    }
    
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(ProductorPortlet.class);

}
