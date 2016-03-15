<%@ page import="com.biblioteca.controlador.GestionLibrosControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Alta de Libro</title>
<link type="style/css" href="css/main.css">

<script src="http://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="http://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css"
	rel="stylesheet"></link>

<script type="text/javascript">

	var alert = null;

	function handlerMostrar(){
		alert.show();
	}
	
	function handlerOcultar(){
		alert.hide();
	}

	function init(){
		YUI().use('aui-alert',
				function(Y) {
					alert = new Y.Alert(
						{
							animated : true, //Que anime el mensaje
							bodyContent : 'Thank You Mario! But Our Princess Is In That Castle!',// El contenido del mensaje
							boundingBox : '#myAlert', //El Id del componente HTML donde se visualiza el mensaje
							closeable : true, //Que se pueda cerrar
							cssClass : 'alert-warning', //Estilo de pintado (Color) 
							destroyOnHide : false,
							duration : 1,
							render : true,
							visible: false
						}
					);
				});
	}
	
	
</script>

</head>
<body onload="init()">

	<div id="myAlert"></div>
	
	<div id="botonOcultar" onclick="handlerOcultar()">Ocultar</div>
	<div id="botonMostrar" onclick="handlerMostrar()">Mostrar</div>



	<%
		String url = "gestionLibro";

		Object mensaje = request.getAttribute(GestionLibrosControlador.ATR_KEY_MENSAJE);
	%>

	<c:if test="<%=mensaje != null%>">
		<div class="error"><%=mensaje%></div>
	</c:if>

	<form action="<%=url%>" method="get">
		<input type="hidden" name="<%=GestionLibrosControlador.ACCION%>"
			value="<%=GestionLibrosControlador.COMANDO_ALTA%>">
		<div>
			<input type="text" placeholder="isbn"
				name="<%=GestionLibrosControlador.ISBN%>">
		</div>
		<div>
			<input type="text" placeholder="autor"
				name="<%=GestionLibrosControlador.AUTOR%>">
		</div>
		<div>
			<input type="text" placeholder="titulo"
				name="<%=GestionLibrosControlador.TITULO%>">
		</div>
		<div>
			<input type="text" placeholder="numero de paginas"
				name="<%=GestionLibrosControlador.NUM_PAGINAS%>">
		</div>
		<div>
			<input type="submit" value="Alta Libro">
		</div>
	</form>

</body>
</html>