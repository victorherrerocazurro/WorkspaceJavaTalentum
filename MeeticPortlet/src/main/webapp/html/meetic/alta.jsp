<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

Formulario Alta

<portlet:actionURL var="urlAlta">
	<portlet:param name="accion_que_quiero_ejecutar" value="alta"/>
	<portlet:param name="vista_a_la_que_quiero_ir" value="menu"/>
</portlet:actionURL>

<form action="<%=urlAlta %>" method="post">
	<input type="submit" value="Enviar"/>
</form>
