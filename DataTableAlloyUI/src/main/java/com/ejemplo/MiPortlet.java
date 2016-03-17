package com.ejemplo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MiPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("John A. Smith", "San Francisco", "1236 Some Street", "CA"));
		personas.add(new Persona("Joan B. Jones", "New York", "3271 Another Ave", "NY"));
		personas.add(new Persona("Bob C. Uncle", "Los Angeles", "9996 Random Road", "CA"));
		personas.add(new Persona("John D. Smith", "San Francisco", "1623 Some Street", "CA"));
		personas.add(new Persona("Bob F. Uncle", "Los Angeles", "9899 Random Road", "CA"));

		String personasJSON = JSONFactoryUtil.serialize(personas);
		
		resourceResponse.getWriter().print(personasJSON);
		
	}
	
}
