<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL portletMode="VIEW" var="urlFormularioAlta"/>

<portlet:renderURL portletMode="VIEW" var="urlFormularioLogin"/>

<a href="<%= urlFormularioAlta%>">Alta</a>
<a href="<%= urlFormularioLogin%>">Login</a>
