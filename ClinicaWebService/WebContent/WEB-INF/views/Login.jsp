<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login Clinica Alemana</title>

	<link href="<c:url value="/resources/css/demo.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/animate-custom.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/Scripts/plugin/css/alertify.min.css" />" rel="stylesheet">

	<style type="text/css">
.error{
color: red;
}
</style>
   
	
</head>
<body>

    <img src="<c:url value="/resources/img/logo6.gif" />" width="290" height="100" >
 
  <hr  width="1400" />
   <div class="container">
      
      
        <header>
           

        </header>
     
            <section  >
                <div  id="container_demo" style="padding-top:80px;">

                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                             
                        <div style="width: 350px; " id="login" class="animate form">
<%--                         <form id="login-form"  role="form" style="display: block;"> --%>
							<form:form method="post" modelAttribute="usuario"  id="login-form"  role="form" style="display: block;"
		                               action="/ClinicaWebService/login">		
                           
                             <h1>Iniciar Sesión</h1>
                         <center><h4 style="color:red;" >${msj} </h4></center>
                              
                                <p>
                                    <label for="username" class="uname" >Usuario </label>
<!--                                     <input data-rule-required="true"   class="textbox1" name="username" id="username" tabindex="1" required="required" type="text" placeholder="Ingresa tu Usuario" /> -->
                                  <form:input path="usuario" data-rule-required="true"   class="textbox1" name="username" id="username" tabindex="1" required="required" type="text" placeholder="Ingresa tu Usuario"></form:input>
                                    
                                </p>
                                <p>
                                    <label for="password" class="youpasswd" >Contraseña</label>
                                 
<!--                                   <input data-rule-required="true"  class="textbox"  type="password" name="password" id="password" tabindex="2" placeholder="Password" /> -->
                                  <form:password id="password" data-rule-required="true" path="password" size="30" maxlength="30" showPassword = "true" tabindex="2" placeholder="Password" /> 
                                  
                                </p>
                                
                                
                                <p class="keeplogin">
                                    <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" />
                                    <label for="loginkeeping">Olvidaste tu contraseña?</label>

                                </p>
                                <p class="login button">
                                   
                                    <input type="submit"  value="Entrar" id="logearse"  class="form-control btn btn-register"   />
<!--                                   <input type="submit" class="blue-button" /> -->
                                   
                                </p>
                                <p style="width: 350px" class="change_link">
                                    Ingresa tu usuario y contraseña.
                                    Luego da clic en "Entrar" o presione "Enter".

                                </p>
                      </form:form>
                        </div>
                       
                    </div>
                </div>
            </section>
        
    </div>



<!-- Validaciones -->
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/jquery.validate.min.js" />"></script>
    <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/messages_es.js" />"></script>
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/blockui.min.js" />"></script>
   <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/alertify.min.js" />"></script>
     <script type="text/javascript"  src="<c:url value="/resources/Scripts/app/js/jquery.master.js" />"></script>

<script type="text/javascript">
// $('#logearse').click(function() {
	
	
// 	if (jQuery.fn.MasterMainPage("fn_IsFormValid", $("#login-form"))) {
		
// 		window.location='./citas'; 
		
// 	}
// 	else {
	
		
// 	jQuery.fn.MasterMainPage("messagealert", "warning");
	

// 	}

// });
</script>
</body>
</html>
