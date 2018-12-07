$('#tablaPac').DataTable({
	 "language": {
        "url": "./resources/administration_components/json/spanishDataTable.json"  	 
    }

});


function valida(){
	  
	var dep = $('#tipo').val();
var value=$('#numdoc').val();
	if (dep == "1") {

	    if ( value.length < 8 ) {
	        $('#sms').text("Por favor,no escribas menos de 8 caracteres.");
	       
	    }
	   else if (value.length > 8) {
		   $('#sms').text("Por favor,no escribas mas de 8 caracteres.");
	      
	    }

	}
	else if (dep == "2") {
	    if (value.length < 12 ) {
	    	$('#sms').text("Por favor,no escribas menos de 12 caracteres.");
	        
	    }
	    else if (value.length > 12) {
	    	$('#sms').text( "Por favor,no escribas mas de 12 caracteres.");
	       
	    }
	}
	
	
}
   
$( "#nac" ).datepicker({ dateFormat: 'yy-mm-dd'  });
$( "#cita" ).datepicker({ dateFormat: 'yy-mm-dd' });

$('#Enviar12').click(function() {
		
		
		if (jQuery.fn.MasterMainPage("fn_IsFormValid", $("#formRegistropac"))) {
			guardar();
			
			
		}
		else {
			valida();
			$('#sms').addClass('error');
		jQuery.fn.MasterMainPage("messagealert", "warning");
		
	
		}

	})
	
// 	 $('body').on('blur', '.numdoc', function (e) {
         
//                var docu = $('#numdoc').val();
//                 if (docu.trim() == "") {

//                 } else {

                   
//                     ListPersonbynumdoc(docu);
//                 }
//             }),

	
	function guardar() {
		 var empObj = {
				 tipodocumento: $('#tipo').val(),
				 numdocumento: $('#numdoc').val(),
				 nombre: $('#nom').val(),
				 apellido: $('#ape').val(),
				 telefono: $('#tel').val(),
				 direccion: $('#dir').val(),
				 fechanac: $('#nac').val(),
				 genero: $('#gen').val(),
				 fechacreacion: $('#fecreacion').val()
				  
			    
			    };

		
		$.ajax({
			url:'registraPaciente',
			type:'POST',
			data:empObj,
// 			 data:{ name: $('#name').val(), country: $('#country').val(),edad: $('#edad').val()},
			success: function(response){
			
				jQuery.fn.MasterMainPage("messagealert", "save");
				window.location='./paciente'; 
				$('#paciente').modal('hide');
			},
			 error: function (errormessage) {
                 jQuery.fn.MasterMainPage("messagealert", "error");
                 console.log("Error SM-006- " + "003");
             }
		});		
	}

	 function ListPersonbynumdoc (id) {
	        $.ajax({
	            url: "ListaPacienteXDni/" + id,
	            type: "GET",
	            contentType: "application/json;charset=UTF-8",
	            dataType: "json",
	            success: function (data) {
	               
	              

	                $.each(data, function (key, value) {

	                   $('#nom').val(value.nombre);
	                    $('#ape').val(value.apellido);
	                   
	                  

	                });
	              
	              
	              
	                   
	            },
	            error: function (errormessage) {
	              
	                alert("Error SM-006- " + "004");
	            }
	        });
	    } 
				
	 
	 
	
	

	

	