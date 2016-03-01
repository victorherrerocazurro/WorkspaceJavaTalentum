<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		Object usuario = session.getAttribute("usuario");
	
	%>
	
	<div>Bienvenido <%=usuario %></div>

	<div>Has accedido a tu espacio personal!!!!!!!!</div> 
	
	<div>Solo tu puedes acceder aqui!!!!!!</div>
	
	<form action="logout" method="get">
		<input type="submit" value="Logout">
	</form>
	
	<a href="logout">Logout</a> <!-- Siempre va por GET -->
	
</body>
</html>