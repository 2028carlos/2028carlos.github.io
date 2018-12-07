<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Medico</title>
		<link href="<c:url value="/resources/css/demo.css" />" rel="stylesheet">
	
	  <link type="text/css" rel="stylesheet" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"/>
	  <link href="<c:url value="/resources/Scripts/plugin/css/jquery-ui.css" />" rel="stylesheet">
	
        
            <link href="<c:url value="/resources/Scripts/app/css/LineaText.css" />" rel="stylesheet">
           <link href="<c:url value="/resources/Scripts/plugin/css/bootstrap.min.css" />" rel="stylesheet">
            <link href="<c:url value="/resources/administration_components/font-awesome/css/font-awesome.min.css" />" rel="stylesheet">
             <link href="<c:url value="/resources//administration_components/css/AdminLTE.min.css" />" rel="stylesheet">
              <link href="<c:url value="/resources/administration_components/css/ionicons.min.css" />" rel="stylesheet">
        
     <link href="<c:url value="/resources/administration_components/css/ionicons.min.css" />" rel="stylesheet">
       <link href="<c:url value="/resources/administration_components/css/skin-blue.min.css" />" rel="stylesheet">
	
  
    <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic"/>
      
	

	 
	 
           <script type="text/javascript" src="<c:url value="/resources/Scripts/plugin/js/jquery.min.js" />"></script>
            <script type="text/javascript" src="<c:url value="/resources/Scripts/plugin/js/jquery-ui.js" />"></script>
   <script type="text/javascript"  src="<c:url value="/resources/Scripts/plugin/js/bootstrap.min.js" />"></script>
   <script  src="<c:url value="/resources/administration_components/js/adminlte.min.js" />"></script>
             <script src=" //cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">



	 <!-- Main Header -->
    <header class="main-header">
        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>C</b>D</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Clinica </b>Dental</span>
        </a>
        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                  
                    <!-- /.messages-menu -->
                    <!-- Notifications Menu -->
                   
                  


                   
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                          <!--   <img src="~/dist/img/user2-160x160.jpg" class="user-image" alt="User Image"> -->
                            <!-- NOMBRE DE USUARIO -->
                           
                         <!--  <p:messages autoUpdate="false" showDetail="true" showSummary="true"/> --> 
                          	
                            
                        </a>
                          
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <!-- <img src="~/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"> -->

                                <p>
                                  
                                    <small>Administrador</small>
                                </p>


                            </li>
                         
                                <!-- Menu Body -->
                        
                                    <!-- Menu Footer-->
                                    <li class="user-footer">

                                        <div class="col-md-3">
                                            <a href="javascript:document.getElementById('logoutForm').submit()" class="btn btn-default btn-flat">Cerrar Sesión</a>
                                        </div>
                                    </li>
                          
                        </ul>
                    </li>
                    <!-- Control Sidebar Toggle Button -->
                  
                </ul>
            </div>
        </nav>
    </header>	
	





    <!-- MENU VERTICAL -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel (optional) -->
           
          <!--   Buscar form (Optional) -->
            
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                <!--    <input type="text" name="q" class="form-control" placeholder="Search..."/> -->
                    <span class="input-group-btn">
                           <!-- <button type="submit" name="search" id="search-btn" class="btn btn-flat">
                            <i class="fa fa-search"></i>
                        </button> -->
                      
                    </span>
                </div>
            </form>

            <!-- /.search form -->
            <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">Inicio</li>
                <!-- Optionally, you can add icons to the links -->

                <li class="active"> <a   href="./administracion"> <span>Inicio</span></a></li>
        
                
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Servicios</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                    
                        <li><a  href="./servicio">Servicio</a></li>
<!--                         <li><a  href="../UIClinicaAdministration/NewServicio.jsf">Agregar Servicio</a></li> -->
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Trabajadores</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                         <li><a  href="./trabajador">Trabajadores</a></li>
<!--                           <li><a  href="../UIClinicaAdministration/NewTrabajador.jsf">Agregar Trabajador</a></li> -->
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Citas</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a  href="./cita">Citas Actuales</a></li>
<!--                         <li><a   href="../UIClinicaAdministration/NewCita.jsf">Agregar Cita</a></li> -->
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Pacientes</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                       <li><a  href="./paciente">Paciente</a></li>
<!--                         <li><a   href="./paciente">Agregar Paciente</a></li> -->

                    </ul>
                </li>
                
                   <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Medicos</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                       <li><a  href="./medico">Medico</a></li>
<!--                         <li><a   href="../UIClinicaAdministration/newMedico.jsf">Agregar Medico</a></li> -->

                    </ul>
                </li>

              <li class="header">Control Administrativo</li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Roles</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a  href="./ListarRoles">Roles</a></li>
                       

                    </ul>
                </li>

                 <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Itinerario</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a  href="./ListarItinerario">Itinerario</a></li>
                       

                    </ul>
                </li>
  

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>Usuarios</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a  href="./ListarUsuario">Usuarios</a></li>
                       

                    </ul>
                </li>


            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>
 
  
  <!-- DESDE ACA CONTENT -->
  <div class="content-wrapper">
    <!-- Content Header (Hora y fecha) -->
    <section class="content-header">

        <h1 id="txtFecha" style="color:darkred; font-size: 20px; padding-top:10px;"></h1>



        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
            <li class="active">Carpeta</li>
        </ol>
    </section>



<!-- *****************************************************************************************+ -->
    <!-- Main content -->
    <section class="content container-fluid">
       
        <div class="row">
            <div class="col-md-12">
                <div class="box">

                    <div class="box-header with-border">
                        <h3 class="box-title">Pacientes</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                <i class="fa fa-minus"></i>
                            </button>
                           
                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                        </div>
                    </div>

                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">


                   <div class="col-md-12">
                   <button class="btn btn-primary" style="float:right;" data-toggle="modal" data-target="#myModalServicio">Nuevo</button><br /><br />  
                        
   
	<c:if test="${!empty listOfmedico}">
		<table class="tg" id="tablamedico">
			 <thead>
			<tr>
				<th width="80">Id</th>
				<th width="150">FechaCreacion</th>
			
				<th width="150">Nombre</th>
				<th width="150">Apellido</th>
				
				
				
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			 </thead>
			  <tbody class="dataItenerario">
			<c:forEach items="${listOfmedico}" var="medico">
				<tr>
					<td>${medico.MEDICOID}</td>
					<td>${medico.FECHACREACION}</td>
				
					<td>${medico.nombre}</td>
					<td>${medico.apellido}</td>
				
					
					<td><a href="<c:url value='/updateItinerario/${medico.MEDICOID}' />">Edit</a></td>
					<td><a href="<c:url value='/deleteItinerario/${medico.MEDICOID}' />">Delete</a></td>
				</tr>
			</c:forEach>
			 </tbody>
		</table>
	</c:if>
   
   
   
   
   
   
   
   
   
   
      
                             
                                <div class="chart">
                                    <!-- Sales Chart Canvas -->
                                    <canvas id="salesChart" style="height: 180px;"></canvas>
                                </div>
                                <!-- /.chart-responsive -->
                            </div>


                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- ./box-body -->
                    <!-- /.box-footer -->
                </div>
                <!-- /.box -->
            </div>
            <!-- /.col -->
        </div>

        <!--HASTA ACA PAPRTE DINAMICA -->


    </section>
</div>
  





  <!-- Modal -->
  <div class="modal fade" id="myModalServicio" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Nuevo Paciente</h4>
        </div>
        <div class="modal-body">
         
   <form >	
		  <div class="row">
                    <div class="col-md-5">
                        <b id="">Tipo de Documento:</b><br/>
                        	<select class="cbo" id="tipo" >
			    <option value= "1">Dni</option>
				<option value ="2">Carnet de Extranjeria</option>
			               </select>
                    
                    </div>
                    
                     <div class="col-md-5">
                        <b id="">Número de Documento:</b><br/>
	                  <input  id="numdoc" class="numdoc textbox1" placeholder="Ingresa número de documento " />
                     
                    </div>

          </div><br/>
					
		<div class="row">
                  <div class="col-md-5">

                        <b id="">Nombres:</b><br/>
                     <input class="textbox1"  id="nom" placeholder ="Ingresa Nombres " />
                        
                    </div>

                    <div class="col-md-5">
                        <b id="label">Apellidos:</b><br/>
	                   
                       <input class="textbox1" id="ape" placeholder ="Ingresa Apellidos " />

                    </div>
          </div><br/>
		  <div class="row">
                    <div class="col-md-5">
                        <b id="">Dirección:</b><br/>
                
                        <input class="textbox1" id="dir" placeholder =" Ingresa Dirección " />
                    </div>

                    <div class="col-md-5">
                        <b id="label">Teléfono:</b><br/>
                         <input class="textbox1" id="tel" placeholder =" Ingresa Teléfono" />

                    </div>
           </div><br/>
					
			<div class="row">
                    <div class="col-md-5">
                        <b id="">Fecha de Nacimiento:</b><br/>
                 <input class="textbox1" id="nac"  placeholder ="Ingrea Fecha de Nacimiento"/>
					 
                 
                    </div>


                  <div class="col-md-5">
                        <b id="">Genero:</b><br/>
               <select class="cbo" id ="gen">
			<option value="M">Masculino</option>
			<option value ="F">Femenino</option>
			</select>
                 
                    </div>
                 

                   
                </div>	<br/>
                
                <div class="row">
                    <div class="col-md-5">
                        <b id="">Fecha crecion:</b><br/>
                  <input class="textbox1" id="fecreacion" placeholder ="Ingresa Fecha de la cita" />
					 
                 
                    </div>


                  
                 

                   
                </div>	<br/>
       				
			</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
               <input class="btn btn-info" type="submit" id="Enviar12"  value="enviar"/>
        </div>
      </div>
      
    </div>
  </div>
  

	  <script type="text/javascript" src="<c:url value="/resources/Scripts/app/js/jquery.medico.js" />"></script>
</body>
</html>
