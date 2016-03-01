<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Object mensaje = request.getAttribute("mensaje");

	if(mensaje != null){
%>
	<div><%=mensaje%></div>
<%
	}
%>

<form action="login" method="post">
	<div><input type="text" placeholder="usuario" name="usuario"></div>
	<div><input type="password" placeholder="password" name="password"></div>
	<div><input type="submit" value="Alta Libro"></div>
</form>

</body>
</html>