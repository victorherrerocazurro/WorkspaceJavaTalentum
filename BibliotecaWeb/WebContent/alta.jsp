<%@ page import="com.biblioteca.controlador.GestionLibrosControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Alta de Libro</title>
<link type="style/css" href="css/main.css">
</head>
<body>

<%
	String url = "gestionLibro";

	Object mensaje = request.getAttribute(GestionLibrosControlador.ATR_KEY_MENSAJE);
%>

<c:if test="<%=mensaje != null %>">
	<div class="error"><%= mensaje%></div>
</c:if>

<form action="<%=url%>" method="get">
	<input type="hidden" name="<%=GestionLibrosControlador.ACCION%>" 
						value="<%=GestionLibrosControlador.COMANDO_ALTA%>">
	<div><input type="text" placeholder="isbn" name="<%=GestionLibrosControlador.ISBN%>"></div>
	<div><input type="text" placeholder="autor" name="<%=GestionLibrosControlador.AUTOR%>"></div>
	<div><input type="text" placeholder="titulo" name="<%=GestionLibrosControlador.TITULO%>"></div>
	<div><input type="text" placeholder="numero de paginas" name="<%=GestionLibrosControlador.NUM_PAGINAS%>"></div>
	<div><input type="submit" value="Alta Libro"></div>
</form>

</body>
</html>