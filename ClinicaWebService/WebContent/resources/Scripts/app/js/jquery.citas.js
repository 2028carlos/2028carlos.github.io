
$('#EnviarCita').click(function() {
	if (jQuery.fn.MasterMainPage("fn_IsFormValid", $("#formCitas"))) {
		guardar();
		jQuery.fn.MasterMainPage("messagealert", "save");
	}
	else {

	jQuery.fn.MasterMainPage("messagealert", "warning");
		
	}

	});


$( "#nac" ).datepicker({ dateFormat: 'yy-mm-dd'  });
$( "#cita" ).datepicker({ dateFormat: 'yy-mm-dd' });
//	 $('body').on('blur', '.numdoc', function (e) {
//         
//               var docu = $('#numdoc').val();
//                if (docu.trim() == "") {
//
//                } else {
//
//                   
//                    ListPersonbynumdoc(docu);
//                }
//            }),

	


	function guardar() {
	  var tdate = new Date();
	   var dd = tdate.getDate(); //yields day
	   var MM = tdate.getMonth(); //yields month
	   var yyyy = tdate.getFullYear(); //yields year
	   var currentDate=  yyyy + "-" +( MM+1)+"-" +  dd  ;
	
		
		
		 var empObj = {
				 tipo: $('#tipo').val(),
				 numdoc: $('#numdoc').val(),
				 nom: $('#nom').val(),
				 ape: $('#ape').val(),
				 dir: $('#dir').val(),
				 tel: $('#tel').val(),
				 fecita: $('#cita').val(),
				 nac: $('#nac').val(),
				 gen: $('#gen').val()
				
				  
			    
			    };

		
		$.ajax({
			url:'registraCita',
			type:'POST',
			data:empObj,
// 			 data:{ name: $('#name').val(), country: $('#country').val(),edad: $('#edad').val()},
			success: function(response){
				
				$('#exampleModalCenter').modal('hide');
					
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
				
	
	

	