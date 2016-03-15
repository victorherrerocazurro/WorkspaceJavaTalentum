function handlerClickEnviarAjax(url){
	alert("Se ha clicado sobre el boton con url= " + url);
	
	YUI().use(
	  'aui-io-request',
	  function (Y) {
	    Y.io.request(
	      url,
	      {
	        on: {
	          success: function() {
	        	//Recojo la informacion
	            var data = this.get('responseData');
	            
	            console.info(data);
	            
	            //Convierto el String del objeto java en formato JSON a un
	            //objeto javascript
	            var dataObj = JSON.parse(data);
	            
	            //Y la muestra en un alert
	            alert(dataObj.isbn + ", " + dataObj.titulo 
	            		+ ", " + dataObj.autor + ", " + dataObj.numeroPaginas);
	          },
	          fail: function(){
	        	  
	          }
	        },
	        pepe: ""
	      }
	    );
	  }
	);
	
	
}