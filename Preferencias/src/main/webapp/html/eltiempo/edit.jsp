<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />

<portlet:actionURL name="establecerPreferencias" 
					var="urlEstablecerPreferencias"
					portletMode="VIEW"/>

<%
	List<String> ciudades = (List)request.getAttribute("ciudades");

	String ciudadSeleccionada = portletPreferences.getValue("ciudadSeleccionada", "");
	
	//Esta linea incluye en el entorno de las expresiones EL una nueva variable
	//en este caso la variable se llama ciudadSeleccionada
	pageContext.setAttribute("ciudadSeleccionada", ciudadSeleccionada);

%>

<form action="<%=urlEstablecerPreferencias %>" method="post">
	Selecciona la ciudad de la cual quieres ver el tiempo
	<select name="ciudadSeleccionada">
		<c:forEach items="<%=ciudades %>" var="ciudad">
			<c:choose>
				<c:when test="${ciudadSeleccionada eq ciudad}">
					<option value="${ciudad}" selected="selected">${ciudad}</option>
				</c:when>
				<c:otherwise>
					<option value="${ciudad}">${ciudad}</option>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</select>
	<input type="submit" value="Enviar"/>
</form>
