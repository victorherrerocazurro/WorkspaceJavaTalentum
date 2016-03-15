<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<portlet:actionURL name="procesarAlta" var="urlAlta"/>
<portlet:resourceURL var="urlAltaLibroAjax" />

<aui:form action="<%=urlAlta %>" method="post">
	<aui:layout>
		<aui:column>
			<aui:input name="isbn" type="text" label="Isbn"/>
		</aui:column>
		<aui:column>
			<aui:input name="titulo" type="text" label="Titulo"/>
		</aui:column>
	</aui:layout>
	<aui:layout>
		<aui:column>
			<aui:input name="autor" type="text" label="Autor"/>
		</aui:column>
		<aui:column>
			<aui:input name="numero_paginas" type="text" label="Numero de Paginas" />
		</aui:column>
	</aui:layout>
	<aui:layout>
		<aui:column>
			<aui:button type="submit" value="Enviar"/>
		</aui:column>
		<aui:column>
			<input type="button" value="Enviar Ajax" class="btn btn-primary" 
					onclick="handlerClickEnviarAjax('<%= urlAltaLibroAjax%>')"/>
		</aui:column>
	</aui:layout>
</aui:form>

<script>


</script>