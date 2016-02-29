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
	String url = "gestionLibro?" 
			+ GestionLibrosControlador.ACCION 
			+ "=" 
			+ GestionLibrosControlador.COMANDO_CONSULTA;
%>

	<a href="alta.jsp">Alta</a>
	<a href="<%=url%>">Consulta</a>
</body>
</html>