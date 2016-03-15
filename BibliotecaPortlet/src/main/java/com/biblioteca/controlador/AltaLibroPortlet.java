package com.biblioteca.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.biblioteca.modelo.entidades.Libro;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AltaLibroPortlet
 */
public class AltaLibroPortlet extends MVCPortlet {
 
	public void procesarAlta(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		//ProcessAction
		
		
	}
	
	//La direfencia principal entre este metodo y el metodo de processAction, es que
	//este de ahora, si es responsable de imprimir el resultado en el stream del 
	//response, cosa que el processAction, no tenia que hacer, porque era mision del 
	//render (doView)
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		//super.serveResource(resourceRequest, resourceResponse);
		
		PrintWriter out = resourceResponse.getWriter();
		
		Libro libro = new Libro(12345, "El Quijote", "Cervantes", 1000);
		
		String jsonLibro = JSONFactoryUtil.serialize(libro);
		
		//En vez de retornar codigo HTML, lo que retornaremos mas 
		//habitualemnte es JSON
		out.print(jsonLibro);
		
		
	}
	
}
