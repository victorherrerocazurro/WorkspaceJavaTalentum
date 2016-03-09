<%@page import="com.busqueda.pareja.modelo.entidades.Usuario"%>
<%@page import="java.util.Collection"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<portlet:defineObjects />

<%
	Collection<Usuario> afines = (Collection) request.getAttribute("afines");
%>

<table>
	<thead>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Fecha Nacimiento</td>
			<td>Genero</td>
			<td>Altura</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="<%=afines %>" var="afin">
			<tr>
				<td>${afin.id}</td>
				<td>${afin.nombre}</td>
				<td>${afin.fechaNacimiento}</td>
				<td>${afin.genero}</td>
				<td>${afin.altura}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>