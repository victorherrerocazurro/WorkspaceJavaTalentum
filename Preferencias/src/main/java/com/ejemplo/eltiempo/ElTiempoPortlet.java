package com.ejemplo.eltiempo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.portlet.ReadOnlyException;

/**
 * Portlet implementation class ElTiempoPortlet
 */
public class ElTiempoPortlet extends GenericPortlet {

    public void init() {
        editTemplate = getInitParameter("edit-template");
        viewTemplate = getInitParameter("view-template");
    }

    public void doEdit(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

    	//Obtener información necesaria para pintar la vista doEdit,
    	//ºdeberian obtenerse de un objeto negocio, pero como no es
    	//el objetivo del ejercicio, usamos la imaginacion y nos
    	//lo imaginamos
    	
    	List<String> ciudades = new ArrayList<String>();
    	
    	ciudades.add("Madrid");
    	ciudades.add("El Cairo");
    	
    	//Hacemos llegar a la vista la información obtenido del negocio.
    	renderRequest.setAttribute("ciudades", ciudades);
    	
    	//Invocamos la vista
        include(editTemplate, renderRequest, renderResponse);
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
 
    protected String editTemplate;
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(ElTiempoPortlet.class);

	@ProcessAction(name = "establecerPreferencias")
	public void establecerPreferencias(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String ciudadSeleccionada = actionRequest.getParameter("ciudadSeleccionada");
		
		PortletPreferences preferences = actionRequest.getPreferences();
		
		try {
			preferences.setValue("ciudadSeleccionada", ciudadSeleccionada);
			preferences.store();
		} catch (ReadOnlyException e) {
			// Esto no nos va a suceder, pero lo ponemos porque por codigo hay que hacerlo
			e.printStackTrace();
		} catch (ValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
