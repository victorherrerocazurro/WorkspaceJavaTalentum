<%@page import="com.meetic.MeeticPortlet"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

Formulario Alta

<portlet:actionURL var="urlAlta" name="altaUsuario"/>

<form action="<%=urlAlta %>" method="post">
	<input type="text" name="<%=MeeticPortlet.NOMBRE%>" placeholder="Nombre"/>
	<input type="text" name="fecha" placeholder="dd/MM/yyyy"/>
	<input type="text" name="altura" placeholder="Altura"/>
	<input type="text" name="genero" placeholder="Genero"/>
	<input type="submit" value="Enviar"/>
</form>
