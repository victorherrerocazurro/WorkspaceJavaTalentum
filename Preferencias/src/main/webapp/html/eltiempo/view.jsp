<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

Este es el tiempo en <%=portletPreferences.getValue("ciudadSeleccionada", "No hay ciudad seleccionada") %>
