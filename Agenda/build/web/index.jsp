<%-- 
    Document   : index
    Created on : Jan 1, 2017, 1:52:39 PM
    Author     : hamil
--%>

<%@page import="model.Agenda"%>
<%@page import="persistencia.AgendaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Edit.html" %>
<%@ include file="Agregar.html"%>
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

        <script>
            
            $(".hipervinculo").click(function(){
                alert('esta funcionando!');
            });
        </script>
                
                
                
        <title>Agenda - JSP</title>
        <style>
table, th, td {
    border: 1px solid black;
}
</style>
    </head>
    <body>
        
        <table class="table table-hover table-bordered">
        
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
                       <td ><%=agenda.getId()%></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getNombre() %></strong></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getApellido() %></strong></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getTelefono1() %></strong></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getTelefono2() %></strong></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getDireccion() %></strong></td>
                       <td id="<%out.print(agenda.getId());%>"><%=agenda.getCorreo() %></strong></td>
                       <td ><button data-toggle="tooltip" title="Editar" id="editbutton"><a class="fa fa-pencil hipervinculo" id="<%out.print(agenda.getId());%>" data-toggle="modal" href="Edit.html#myModal2"></a></button></td>
                       
                       
                   </tr>
                
                <%
            }
        %>
        
        </table>
        <button class="btn btn-default" id="guardar" data-toggle="tooltip" title="Guardar">  <i id="savebutton" class="fa fa-floppy-o fa-1x" aria-hidden="true"></i></button>

        <button id="agregar" type="button" class="btn btn-default" data-toggle="tooltip" title="Agregar"><a class="fa fa-plus fa-1x hipervinculo" aria-hidden="true"></a></button>
	  
    </body>
</html>
