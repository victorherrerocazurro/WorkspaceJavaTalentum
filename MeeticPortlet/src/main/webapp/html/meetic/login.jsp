<%@page import="com.meetic.MeeticPortlet"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

Formulario Login

<portlet:actionURL var="urlLogin" name="<%=MeeticPortlet.ACCION_LOGIN_USUARIO%>"/>

<form action="<%=urlLogin %>" method="post">
	<input type="text" name="id" placeholder="Id"/>
	<input type="submit" value="Enviar"/>
</form>
