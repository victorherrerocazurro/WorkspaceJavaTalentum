<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
	Object mensaje = renderRequest.getAttribute("mensaje");

	//out.print(mensaje);

%>

<%=mensaje %>

<portlet:actionURL var="urlAccion" />

<form action="<%=urlAccion%>" method="post">
	<input type="submit" value="Enviar">
</form>









