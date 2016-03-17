var popover;

//Metodo de inicializacion
YUI().ready(
		'aui-popover',
		function(Y){
			
			//Crear el Popover
			
			inputNombre = Y.one('#inputNombre');
			
			popover = new Y.Popover(
				      {
				        align: {
				          node: inputNombre,
				          points:[Y.WidgetPositionAlign.BC, Y.WidgetPositionAlign.TC]
				        },
				        bodyContent: 'El campo Nombre debe tener al menos 5 caracteres',
				        position: 'top',
				        visible: false
				      }
				    ).render();
			
			//Asignar el evento de click al boton del formulario
			
			var botonEnviar = Y.one('#botonEnviarFormulario');
			
			botonEnviar.on('click',function(){
				if(inputNombre.get('value').length <= 5){
					//Inclumpiendo la validacion
					
					popover.show();
					
				} else {
					
					//Cumplimos la validacion
					popover.hide();
					
					var formulario = Y.one('#formulario');
					
					formulario.submit();
				}
			});
			
		}
);