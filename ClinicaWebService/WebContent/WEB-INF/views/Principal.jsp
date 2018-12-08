<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Clinica Alemana</title>
	
	 <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800%7CShadows+Into+Light" rel="stylesheet" type="text/css" /><!--tipo de letra-->
    <!-- client_administration CSS -->
    <link href="<c:url value="/resources/client_components/fontawesome/css/font-awesome.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/client_components/css/owl.carousel.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/client_components/css/owl.theme.default.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/client_components/css/settings.css" />" rel="stylesheet">
    
    <link href="<c:url value="/resources/Scripts/plugin/css/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/Scripts/plugin/css/bootstrap.min.css" />" rel="stylesheet">
    
           <link href="<c:url value="/resources/Scripts/plugin/css/alertify.min.css" />" rel="stylesheet">
      <link href="<c:url value="/resources/css/theme-elements.css" />" rel="stylesheet">
    
 
      <link href="<c:url value="/resources/client_components/css/default.css" />" rel="stylesheet">
       <link href="<c:url value="/resources/client_components/css/theme.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/client_components/css/theme-blog.css" />" rel="stylesheet">
    
    <link href="<c:url value="/resources/Scripts/app/css/LineaText.css" />" rel="stylesheet">
 


 
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	
</head>
<body>


 <!-- Main Header -->
   
 <header id="header">


        <div class="navbar-collapse nav-main-collapse collapse">

            <a href="index.html">

               
 <img src="<c:url value="/resources/img/logo6.gif" />" class="" alt="Cinque Terre" style="padding-top:30px;" width="290" height="100" >
            </a>

            <div class="container" style="padding-top: -9990px">
                <ul class="social-icons">
                    <li class="facebook"><a href="http://www.facebook.com/" target="_blank" title="Facebook">Facebook</a></li>
                    <li class="twitter"><a href="http://www.twitter.com/" target="_blank" title="Twitter">Twitter</a></li>
                    <li class="youtube"><a href="https://www.youtube.com/" target="_blank" title="Youtube">Youtube</a></li>
                </ul>

                <nav class="nav-main mega-menu">

                    <ul class="nav nav-pills nav-main" id="mainMenu">


                        <li class="active">
                            <a class="dropdown-toggle" href="../Front/Index">
                                Inicio
                            </a>

                        </li>
                        <li>

                            <a href="~/Front/Services">Servicios</a>
                        </li>
                        <li>
                            <a href="../Front/Information">
                                Sobre Nosotros

                            </a>

                        </li>
                     
                        <li class="dropdown">
                            <a class="dropdown-toggle" href="#">
                                Ubicación

                            </a>

                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" href="#">
                                Contactanos

                            </a>

                        </li>

                    </ul>
                </nav>
            </div>
        </div>
    </header>
     
<div class="body">

<div role="main" class="main">

        <div class="slider-container">
            <div class="slider" id="revolutionSlider" >
                <ul>
                    <li data-transition="fade" data-slotamount="13" data-masterspeed="300">

                      
<img src="<c:url value="/resources/img/dental3.jpg" />" alt="" data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />

                        <div class="tp-caption top-label lfl stl"
                             data-x="685"
                             data-y="180"
                             data-speed="300"
                             data-start="500"
                             data-easing="easeOutExpo">Tus dientes son como perlas.</div>


                        <!--main-label-->
                        <div class="tp-caption top-label sft stb"
                             data-x="600"
                             data-y="210"
                             data-speed="300"
                             data-start="1500"
                             data-easing="easeOutExpo">¡Cuidalos! ¡Fortalécelos! Sonrie con el Mundo...</div>

                        <div class="tp-caption top-label sft stb"
                             data-x="600"
                             data-y="240"
                             data-speed="300"
                             data-start="2500"
                             data-easing="easeOutExpo">La tecnología natural permite el movimiento natural...</div>

                        <div class="tp-caption main-label sft stb"
                             data-x="650"
                             data-y="260"
                             data-speed="500"
                             data-start="3500"
                             data-easing="easeOutExpo">Poder en tu sonrisa.</div>

                        <div class="tp-caption bottom-label sft stb"
                             data-x="650"
                             data-y="350"
                             data-speed="500"
                             data-start="4500"
                             data-easing="easeOutExpo">"Nacidos para correr" (2009), Christopher McDougall</div>



                    </li>
                    <li data-transition="fade" data-slotamount="13" data-masterspeed="300">

                  
<img src="<c:url value="/resources/img/dental2.png" />" data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />
                        <div class="tp-caption customin customout"
                             data-x="center" data-hoffset="0"
                             data-y="center" data-voffset="0"
                             data-customin="x:50;y:150;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.5;scaleY:0.5;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;"
                             data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                             data-speed="800"
                             data-start="700"
                             data-easing="Power4.easeOut"
                             data-endspeed="500"
                             data-endeasing="Power4.easeIn"
                             style="z-index: 3">

                          
                        </div>


                    </li>
                     <li data-transition="fade" data-slotamount="13" data-masterspeed="300">

          
<img src="<c:url value="/resources/img/dental1.png" />" data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />
                        <div class="tp-caption customin customout"
                             data-x="center" data-hoffset="0"
                             data-y="center" data-voffset="0"
                             data-customin="x:50;y:150;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.5;scaleY:0.5;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;"
                             data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                             data-speed="800"
                             data-start="700"
                             data-easing="Power4.easeOut"
                             data-endspeed="500"
                             data-endeasing="Power4.easeIn"
                             style="z-index: 3">

                          
                        </div>


                    </li>
                </ul>
            </div>
        </div>

    </div>
    
    
    
    
  <div class="home-intro light">
        <div class="container">

            <div class="row">
                <div class="col-md-8">
                    <p>

                        La manera más rápida de tratar tú problema con líder en <em>Tecnología</em>
                        <span> Vea nuestros servicios y productos incluidas.</span>
                    </p>
                </div>
                <div class="col-md-4">
                    <div class="get-started">
                        <button class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">Reserva tu Cita</button>

                      

                    </div>
                </div>
            </div>

        </div>
    </div>



    <!--DOS-->
    <div class="container">

        <div class="row featured-boxes">
            <div class="col-md-3">
                <div class="featured-box featured-box-primary">
                    <div class="box-content">
                        <i class="icon-featured fa fa-user"></i>
                        <h4>100% Calidad</h4>
                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus.<a href="/" class="learn-more">learn more <i class="fa fa-angle-right"></i></a></p>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="featured-box featured-box-secundary">
                    <div class="box-content">
                        <i class="icon-featured fa fa-book"></i>
                        <h4>Material esterializado</h4>
                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus.<i class="fa fa-angle-right"></i></p>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="featured-box featured-box-tertiary">
                    <div class="box-content">
                        <i class="icon-featured fa fa-trophy"></i>
                        <h4>No se que mas </h4>
                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus.<a href="/" class="learn-more">learn more <i class="fa fa-angle-right"></i></a></p>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="featured-box featured-box-quartenary">
                    <div class="box-content">
                        <i class="icon-featured fa fa-cogs"></i>
                        <h4>No se que mas </h4>
                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus. <a href="/" class="learn-more">learn more <i class="fa fa-angle-right"></i></a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!---->
    <div class="row push-top">
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-group"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">Customer Support</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-file"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">HTML5 / CSS3 / JS</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-google-plus"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">500+ Google Fonts</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-user"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">Icons</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-bars"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">Buttons</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <div class="feature-box-icon">
                    <i class="fa fa-desktop"></i>
                </div>
                <div class="feature-box-info">
                    <h4 class="shorter">Lightbox</h4>
                    <p class="tall">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur imperdiet hendrerit volutpat.</p>
                </div>
            </div>
        </div>
    </div>
    <!---->
</div>





<section class="footer">
    <div class="container">
        <div class="row">

           

            <div class="col-md-12">
                <div class="recent-posts">
                    <h2>Latest <strong>Blog</strong> Posts</h2>
                    <div class="owl-carousel owl-carousel-spaced" data-plugin-options='{"items": 4}'>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">15</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">12</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">15</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">15</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">12</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                        <div>
                            <article>
                                <div class="date">
                                    <span class="day">15</span>
                                    <span class="month">Jan</span>
                                </div>
                                <h4><a href="blog-post.html">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec hendrerit vehicula est, in consequat libero. <a href="/" class="read-more">read more <i class="fa fa-angle-right"></i></a></p>
                            </article>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

   <footer id="footer" class="color">
        <div class="container">
            <div class="row">
                <div class="footer-ribbon">
                    <span>Clinica Dental Alemana</span>
                </div>
                <div class="col-md-3">
                    <div class="newsletter">
                        <h4>Ubicación</h4>

                        <ul class="contact">
                            <li><p><i class="fa fa-map-marker"></i> <strong>Dirección Principal:</strong> Av. 28 de julio Nº 122,Trujillo</p></li>
                            <li><p><i class="fa fa-map-marker"></i> <strong>Sede León XIII:</strong> Av. 28 de julio Nº 122,Trujillo</p></li>
                        </ul>

                        <div class="alert alert-success hidden" id="newsletterSuccess">
                            <strong>Success!</strong> You've been added to our email list.
                        </div>

                        <div class="alert alert-danger hidden" id="newsletterError"></div>
                    </div>
                </div>
                <div class="col-md-3">
                    <h4>Convenios</h4>
                    <h5>Cooperativa de Ahorro y Credito León XII</h5>
                    <p>acá va imagen de cooperativa</p>
                </div>
                <div class="col-md-4">
                    <div class="contact-details">
                        <h4>Contactanos</h4>
                        <ul class="contact">

                            <li><p><i class="fa fa-phone"></i> <strong>Teléfono:</strong> (123) 456-7890</p></li>
                            <li><p><i class="fa fa-envelope"></i> <strong>Email:</strong> <a href="mailto:mail@example.com">mail@example.com</a></p></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-2">
                    <h4>Redes Sociales</h4>
                    <div class="social-icons">
                        <ul class="social-icons">
                              <li class="facebook"><a href="http://www.facebook.com/" target="_blank" data-placement="bottom"  title="Facebook">Facebook</a></li>
                            <li class="twitter"><a href="http://www.twitter.com/" target="_blank" data-placement="bottom"  title="Twitter">Twitter</a></li>
                            <li class="linkedin"><a href="http://www.linkedin.com/" target="_blank" data-placement="bottom"  title="Linkedin">Linkedin</a></li>
                           
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                <div class="row">
                    <div class="col-md-1">
                       <a href="index.html" class="logo">
                         
                             <img src="<c:url value="/resources/img/logofondo.jpg" />" alt="Porto Website Template" class="img-responsive" >
                        </a>
                         
                    </div>
                    <div class="col-md-7">
                        <p>© Copyright 2018.Todos los derechos reservados.</p>
                    </div>
                    <div class="col-md-4">
                        <nav id="sub-menu">
                            <ul>

                                <li><a href="sitemap.html">Sitemap</a></li>
                                <li><a  href="./logeo">Iniciar Sesión</a></li>
                                 
                                
                                
                                

                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    
    
    
    

<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">

        <div class="modal-content">

            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true"></span>
            </button>
            <div class="modal-header">
                <h5 style="text-align:center" class="modal-title" id="exampleModalLongTitle">RESERVA TU CITA</h5>

            </div>

            <h4 style="background-color:#91BBE5; color:white;text-align:center">Visitanos la consulta es totalmente gratis</h4><br />



            	<form id="formCitas" >

                <div class="container row">
                    <div class="col-md-5 col-md-offset-1">
                        <b id="">Tipo de Documento:</b>
                      	<select class="cbo" id="tipo" >
			    <option value= "1">Dni</option>
				<option value ="2">Carnet de Extranjeria</option>
			               </select>
                      
                    </div>
                    
                   <div class="col-md-5">
                        <b id="">Número de Documento:</b>
	                       <input placeholder="Ingrese Números de documento" data-rule-required="true"   class="textbox" id="numdoc" class="numdoc" />
                     
                   </div>

                </div><br />

                <div class="container row">
                  <div class="col-md-5 col-md-offset-1">

                        <b id="">Nombres:</b>
                      <input placeholder="Ingrese sus Nombres" data-rule-required="true" name="name" class="textbox" id="nom" />
                        
                    </div>

                    <div class="col-md-5">
                        <b id="label">Apellidos:</b>
	                       <input placeholder="Ingrese Apellidos" data-rule-required="true" name="ape" class="textbox" id="ape" />

                    </div>
                </div><br />


                <div class="container row">
                    <div class="col-md-5 col-md-offset-1">
                        <b id="">Dirección:</b>
                     <input placeholder="Ingrese Dirección" data-rule-required="true"  name="dir" class="textbox" id="dir" />
                        
                    </div>

                    <div class="col-md-5">
                        <b id="label">Teléfono:</b>
                          <input placeholder="Teléfono" data-rule-required="true" name="tel" class="textbox" id="tel" />
                     

                    </div>
                </div><br />


                <div class="container row">
                    <div class="col-md-5 col-md-offset-1">
                        <b id="">Fecha de Cita:</b>
                            <input placeholder="Ingrese Fecha de la Cita" data-rule-required="true" name="fec" class="textbox" id="cita" />
                         
                    </div>

                    <div class="col-md-5">
                        <b >Horarios Disponibles:</b>
                <select class="cbo" id ="hora">
			<option value="#">7:00 am</option>
			<option value ="#">8:00</option>
			</select>
                        

                    </div>
                </div><br />




                <div class="container row">
                 <div class="col-md-5 col-md-offset-1"  >
                              <b >Género</b><br />
            <select class="cbo" id ="gen"  data-rule-required="true" name="gen">
			<option value="M">Masculino</option>
			<option value ="F">Femenino</option>
			</select>
                     

                    </div>
                    <div class="col-md-5 ">
                        <b >Fecha de Nacimiento</b>

                         <input placeholder="Ingrese Fecha de Nacimiento" class="textbox" id="nac"  data-rule-required="true" name="nac" />

                    </div>

                   
                </div>


            <div class="modal-footer">

<!--                 <img src="../img/2.jpg" class="img-circle" style="float:left;height:80px;width:80px" /> -->
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  <button id="EnviarCita"  class="btn btn-info"  >Enviar</button>
             
                			
					
            </div>
	</form>

        </div>
    </div>
</div>


         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/jquery.min.js" />"></script>
      <script type="text/javascript"  src="<c:url value="/resources/client_components/js/jquery.js" />"></script>
       <script type="text/javascript"  src="<c:url value="/resources/client_components/js/common.js" />"></script>
        <script type="text/javascript"  src="<c:url value="/resources/client_components/js/owl.carousel.js" />"></script>
         <script type="text/javascript"  src="<c:url value="/resources/client_components/js/theme.js" />"></script>
         
       
           <script type="text/javascript"  src="<c:url value="/resources/client_components/js/jquery.themepunch.tools.min.js" />"></script>
            <script type="text/javascript"  src="<c:url value="/resources/client_components/js/jquery.themepunch.revolution.min.js" />"></script>
             <script type="text/javascript"  src="<c:url value="/resources/client_components/js/theme.init.js" />"></script>
              <script type="text/javascript"  src="<c:url value="/resources/client_components/js/modernizr.js" />"></script>
               <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/bootstrap.min.js" />"></script>
    
    
    
      <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/jquery-1.10.2.min.js" />"></script>
        <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/bootstrap.min.js" />"></script>
          <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/jquery-ui.js" />"></script>
           <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/bootstrap.min.js" />"></script>
          
          
          <!-- Validaciones -->
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/app/js/jquery.citas.js" />"></script>
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/jquery.validate.min.js" />"></script>
    <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/messages_es.js" />"></script>
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/blockui.min.js" />"></script>
   <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/alertify.min.js" />"></script>
     <script type="text/javascript"  src="<c:url value="/resources/Scripts/app/js/jquery.master.js" />"></script>
  <script type="text/javascript"  src="<c:url value="/resources/Scripts/app/js/jquery.citas.js" />"></script>


  


</body>
</html>
