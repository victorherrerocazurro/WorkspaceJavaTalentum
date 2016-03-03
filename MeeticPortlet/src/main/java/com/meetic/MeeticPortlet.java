package com.meetic;

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
 * Portlet implementation class MeeticPortlet
 */
public class MeeticPortlet extends GenericPortlet {

    private String altaTemplate;
	private String loginTemplate;
	private String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(MeeticPortlet.class);

	public void init() {
        viewTemplate = getInitParameter("view-template");
        altaTemplate = getInitParameter("alta-template");
        loginTemplate = getInitParameter("login-template");
    }

    //Para acceder al Negocio
    public void processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {

        super.processAction(actionRequest, actionResponse);

    }

    //Para pintar vistas
    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

    	String vista = renderRequest.getParameter("vista");
    	
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
		default:
			break;
		}
    	
    	
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
}
