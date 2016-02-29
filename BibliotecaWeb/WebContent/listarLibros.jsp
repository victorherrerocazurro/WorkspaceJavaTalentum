<%@page import="com.biblioteca.modelo.entidades.Libro"%>
<%@page import="java.util.Collection"%>
<%@page import="com.biblioteca.controlador.GestionLibrosControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Collection<Libro> libros = (Collection<Libro>) request
				.getAttribute(GestionLibrosControlador.ATR_KEY_LIBROS);
	%>
	<table>
		<thead>
			<tr>
				<td>ISBN</td>
				<td>AUTOR</td>
				<td>TITULO</td>
				<td>NUMERO PAGINAS</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (Libro tmp : libros) {
			%>
			<tr>
				<td><%=tmp.getIsbn()%></td>
				<td><%=tmp.getAutor()%></td>
				<td><%=tmp.getTitulo()%></td>
				<td><%=tmp.getNumeroPaginas()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	------------------------------------------
	<table>
		<thead>
			<tr>
				<td>ISBN</td>
				<td>AUTOR</td>
				<td>TITULO</td>
				<td>NUMERO PAGINAS</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${libros}" var="tmp">
				<tr>
					<td>${tmp.isbn}</td>
					<td>${tmp.autor}</td>
					<td>${tmp.titulo}</td>
					<td>${tmp.numeroPaginas}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>