<%@page import="com.busqueda.pareja.modelo.entidades.Usuario"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<% 

Usuario usuario = (Usuario) request.getAttribute("ideal");

if(usuario != null){
%>

	Tu usuario ideal es: <%= usuario.getNombre()%>

<%
} else { 
%>
	No tienes ideal!!!!
<%
}
%>