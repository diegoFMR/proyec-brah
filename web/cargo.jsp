<%-- 
    Document   : cargo
    Created on : 10-19-2017, 03:07:59 PM
    Author     : Casa
--%>

<%@page import="com.modelo.ControladorDetalleOfertaEmpleo"%>
<%@page import="com.modelo.Selec"%>
<%@page import="com.modelo.Cargo"%>
<%@page import="com.modelo.Categoria"%>
<%@page import="com.modelo.CrudCategoriaCargo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
          ControladorDetalleOfertaEmpleo controlDetalle = new ControladorDetalleOfertaEmpleo();
          CrudCategoriaCargo ccc = new CrudCategoriaCargo(); 
          String sql="select idCargo id, nombreCargo nombre,"
                  + " categoria.idCategoria idCat, categoria.nombreCategoria nombreCat"
                  + " from cargo inner "
                  + "join categoria on cargo.idCategoria = categoria.idCategoria";
        %>
        <script type="text/javascript">
              
            function cargar(id,nombre,id2){
                
                document.getElementsByName("txtId")[0].value = id;
                document.getElementsByName("txtCargo")[0].value = nombre;
                document.getElementsByName("slcCategoria")[0].value = id2;
            } 
             
            <%
            if(request.getSession().getAttribute("mensaje")!=null){
            %>
                        alert('<%= request.getSession().getAttribute("mensaje") %>');
            <%
                    session.removeAttribute("mensaje");//Destruir la sesion
                  
                }
             %>
          </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ProcesarCategoria" method="post">
        <input type="text" name="txtId">
        Cargo <input type="text" name="txtCargo">
        <select name="slcCategoria"> <%-- onchange="call(this,'slcCargo')"--%> 
           <option value="" >Selecionar...</option>
           <% 
              for(Selec i:controlDetalle.llenarSelec("idCategoria", "nombreCategoria", "categoria")){
           %>
               <option value="<%= i.getId() %>" ><%= i.getRegistros() %></option>
           <% 
               }
           %>   
        </select>
        <input type="submit" value="Insertar" name="btnGuardar">
        <input type="submit" value="Modificar" name="btnModif">
        </form>
        <table border="1">
            <thead>
                <th>ID</th>
                <th>Cargo</th>
                <th>ID categoria</th>
                <th>Categoria</th>
                <th>Seleccionar</th>
                <th>Eliminar</th>
            </thead>
            <%
               for(Cargo c:ccc.mostrarCargo(sql) ){
                
             %>
            <tbody>
                <tr>
                    <td><%= c.getIdCargo() %></td>
                    <td><%= c.getCargo() %></td>
                    <td><%= c.getCategoria().getIdCategoria() %></td>
                    <td><%= c.getCategoria().getCategoria() %></td>
                    <td><a href="javascript:cargar('<%= c.getIdCargo() %>','<%= c.getCargo() %>','<%= c.getCategoria().getIdCategoria() %>')"> Seleccionar</a></td>
                    <td><a href="ProcesarCategoria?delete=<%= c.getIdCargo() %>">Eliminar</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
            
            
        </table>
    </body>
</html>
