<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL var="urlBusquedaAfines" name="busquedaAfines"/>

<portlet:actionURL var="urlBusquedaIdeal" name="busquedaIdeal"/>

<form action="<%= urlBusquedaAfines%>" method="post">
	<input type="submit" value="Buscar Afines"/>
</form>

<form action="<%= urlBusquedaIdeal%>" method="post">
	<input type="submit" value="Buscar Ideal"/>
</form>