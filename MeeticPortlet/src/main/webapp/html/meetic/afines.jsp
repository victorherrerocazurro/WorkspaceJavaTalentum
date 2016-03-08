<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL portletMode="view" var="urlFormularioAlta">
	<portlet:param name="vista_a_la_que_quiero_ir" value="alta"/>
</portlet:renderURL>

<portlet:renderURL portletMode="view" var="urlFormularioLogin">
	<portlet:param name="vista_a_la_que_quiero_ir" value="login"/>
</portlet:renderURL>

<a href="<%= urlFormularioAlta%>">Alta</a>
<a href="<%= urlFormularioLogin%>">Login</a>