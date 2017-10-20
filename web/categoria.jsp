<%-- 
    Document   : categoria
    Created on : 10-19-2017, 03:07:50 PM
    Author     : Casa
--%>

<%@page import="com.modelo.Categoria"%>
<%@page import="com.modelo.CrudCategoriaCargo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%
          CrudCategoriaCargo ccc = new CrudCategoriaCargo(); 
          String sql="select idCategoria id, nombreCategoria nombre from categoria";
          
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <script type="text/javascript">
              
            function cargar(id,nombre){
                document.getElementsByName("txtId")[0].value = id;
                document.getElementsByName("txtCategoria")[0].value = nombre;
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
    </head>
    <body>
        <form action="ProcesarCategoria">
            <input type="hidden" name="txtId">
        Categoria <input type="text" name="txtCategoria"><input type="submit" required value="Insertar" name="btnInsertar">
        <input type="submit" value="Modificar" name="btnModificar">
        
        </form>
           <table border="1">
            
            <thead>
                <th>ID</th>
                <th>Categoria</th>
                <th>Seleccionar</th>
                <th>Eliminar</th>
            </thead>
            <%
               for(Categoria c:ccc.mostrar(sql)){
                
             %>
            <tbody>
                <tr>
                    <td><%= c.getIdCategoria() %></td>
                    <td><%= c.getCategoria() %></td>
                    <td><a href="javascript:cargar('<%= c.getIdCategoria() %>','<%= c.getCategoria() %>')"> Seleccionar</a></td>
                    <td><a href="ProcesarCategoria?eliminar=<%= c.getIdCategoria() %>">Eliminar</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
            
            
        </table>
    </body>
</html>
