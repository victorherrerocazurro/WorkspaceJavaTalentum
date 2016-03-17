package com.meetic.controlador;

import java.io.IOException;
import java.util.Collection;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meetic.model.UsuarioMeetic;
import com.meetic.service.UsuarioMeeticLocalServiceUtil;

/**
 * Portlet implementation class AfinesPortlet
 */
public class AfinesPortlet extends MVCPortlet {
 
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {


		long userId = PortalUtil.getUserId(renderRequest);
		
		try {
			UsuarioMeetic usuarioMeetic = UsuarioMeeticLocalServiceUtil
													.getUsuarioMeetic(userId);
			
			//Comprobar si el usuario es de Meetic o no
			if(usuarioMeetic != null){
				//El usuario esta registrado y puede acceder a ver sus afines
				
				Collection<UsuarioMeetic> afines = UsuarioMeeticLocalServiceUtil
																.buscarAfines(userId);
				
				renderRequest.setAttribute("afines", afines);
				
				include("/html/afines/listado.jsp", renderRequest, renderResponse);
				
			} else {
				//El usuario no esta registrado y tiene que registrarse
				include("/html/afines/alta.jsp", renderRequest, renderResponse);
			}
			
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
