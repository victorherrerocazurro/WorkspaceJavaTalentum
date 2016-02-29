<%@page import="com.biblioteca.controlador.GestionLibrosControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina de inicio</title>
</head>
<body>

<%
	String url = "gestionLibro?accion=consulta";

	String urlModificar = "gestionLibro?accion=modificar";
%>

	<a href="alta.jsp">Alta</a>
	<a href="<%=url%>">Consulta</a>
	<a href="<%=urlModificar%>">Modificar</a>
</body>
</html>