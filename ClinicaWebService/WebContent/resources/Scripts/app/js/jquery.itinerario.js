
$('#tablaItenerario').DataTable({
	 "language": {
        "url": "./resources/administration_components/json/spanishDataTable.json"  	 
    }

});


	$('#Enviar2').click(function() {
		guardar();
	})
	
     
	
	
	
	
	
	
	
   
	
	function guardar() {
		
		 var Obj = {
				 servicioid:$('#cod').val(),
				 nombre: $('#name').val(),
				 descripcion: $('#des').val()
			    
			    };
		 
		 
		$.ajax({
			url:'registraServicio',
			type:'POST',
			data:Obj,
			success: function(response){
				
				$('#myModalServicio').modal('hide');
				
						
			}				
		});		
	}