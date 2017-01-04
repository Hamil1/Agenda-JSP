<%-- 
    Document   : index
    Created on : Jan 1, 2017, 1:52:39 PM
    Author     : hamil
--%>

<%@page import="model.Agenda"%>
<%@page import="persistencia.AgendaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->


        <script src="sweetalert-master/dist/sweetalert.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="Script.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="font-awesome-4.7.0\css\font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="sweetalert-master/dist/sweetalert.css">
        <link rel="stylesheet" type="text/css" href="Style.css">


                
                
                
        <title>Agenda - JSP</title>
        <style>
table, th, td {
    border: 1px solid black;
}
</style>
    </head>
    <body>
        
        <table class="table table-hover table-bordered table-striped">
        
            <!--Titulos-->
            <tr>
            <%
            AgendaDAO agendadao = new AgendaDAO();
            
            for(Agenda agenda: agendadao.getAll()){%>
            <th class="registroslightgrey"><%=agenda.getTitulo()%></th>
           <% }%>
        </tr>
        
        <!--Registros-->
        <%
            
            for(Agenda agenda: agendadao.getAll()){
                %>
                    
                <tr> 
                       <td ><strong><%=agenda.getId()%></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getNombre() %></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getApellido() %></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getTelefono1() %></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getTelefono2() %></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getDireccion() %></strong></td>
                       <td contenteditable='true'><strong><%=agenda.getCorreo() %></strong></td>
                       
                       
                   </tr>
                
                <%
            }
        %>
        
        </table>
        		<button class="btn btn-default" style="margin-left: 3px; width: 80px;" id="guardar">  <i data-toggle="tooltip" title="Guardar" class="fa fa-floppy-o fa-1x" aria-hidden="true"></i></button>

		<button type="button" class="btn btn-default" style="margin-left: 3px;  width: 88px;" data-toggle="modal" data-target="#myModal">	<i data-toggle="tooltip" title="Agregar" class="fa fa-plus fa-1x" aria-hidden="true"></i></button>
		
		
		
			<div id="myModal" class="modal fade" role="dialog">
  				<div class="modal-dialog">

    <!-- Modal content-->
    				<div class="modal-content">
      					<div class="modal-header" >
       						<button type="button" class="sr-only" data-dismiss="modal">&times;</button>
       						<h4 class="modal-title" style="color: rgb(95, 90, 90);">Agregar</h4>
      				    </div>
      					<div class="modal-body">
      					<div style="height: 43px;">
      						<div><input type="text" name="nombre" placeholder="Nombre" class="inputtext" style="float:left; width: 50%;" ></div>
      						<div><input type="text" name="apellido" placeholder="Apellido" class="inputtext" style="width: 50%;float: right;"></div>
      					</div>	
      					<div style="height: 43px;">
      						<div><input type="text" name="nombre" placeholder="Telefono 1" class="inputtext" style="float:left; width: 50%;" ></div>
      						<div><input type="text" name="apellido" placeholder="Telefono 2" class="inputtext" style="width: 50%;float: right;"></div>
      					</div>

      					<div style="height: 80px;">
      						<div><input type="text" name="nombre" placeholder="Dirección" class="inputtext" style="float:left; width: 50%;" ></div>
      						<div><input type="text" name="apellido" placeholder="Correo" class="inputtext" style="width: 50%;float: right;"></div>
      					</div>

      					</div>
      					<div class="modal-footer" style="border: 0;    margin-bottom: -8px; margin-right: -2px;">
      						<button type="button" class="btn btn-default" data-dismiss="modal" style="background-color:rgb(113, 188, 222);color:white;">Guardar</button>
        					<button type="button" class="btn btn-default" data-dismiss="modal" style="background-color:rgb(247, 81, 81);color:white;">Cerrar</button>
        					
      					</div>
    				</div>

 			   </div>
		   </div>
    </body>
</html>
