<%@page import="java.util.List"%>
<%@page import="com.ejemplo.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:resourceURL var="urlListadoPersonas"/>

<div id="myDataTable"></div>

<script type="text/javascript">
	YUI().ready('aui-datatable','aui-io-request',
		  function(Y) {
		    var columns = ['nombre', 'direccion', 'ciudad', 'estado'];
		   
		    Y.io.request('<%= urlListadoPersonas%>',
		    	      {
		    	        on: {
		    	          success: function() {
		    	            var data = this.get('responseData');
		    	            
		    	            data = JSON.parse(data);
		    	            
		    	            new Y.DataTable.Base(
		    	      		      {
		    	      		        columnset: columns,
		    	      		        recordset: data.list
		    	      		      }
		    	      		).render('#myDataTable');
		    	          }
		    	        }
		    	      }
		    	    );
		  }
		);	
</script>