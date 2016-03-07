<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL name="enviarEvento" var="urlEnviarEvento"/>

<form action="<%=urlEnviarEvento %>" method="post">
	<input type="text" name="nombre" />
	<input type="submit"/>
</form>

