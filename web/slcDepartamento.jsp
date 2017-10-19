<%-- 
    Document   : slcDepartamento
    Created on : 10-12-2017, 08:06:24 PM
    Author     : Casa
--%>

<%@page import="java.util.List"%>
<%@page import="com.modelo.Departamento"%>
<%@page import="com.controlador.CrudDepartamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="bootstrap/jquery-3.2.1.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
            String Pais = request.getParameter("mar");
     %>
    <%
      CrudDepartamento crudD = new CrudDepartamento();  
    %>    
    <body>
        
             <tr>
                    
                   
             <select name="slcDepartamento" id="slcDepartamento" name="slcDepartamento">
                 <option value="0">Seleccionar</option>
                     <%
                    List<Departamento> lst1 = crudD.mostrarDepartamento(Pais);
                    
                    for(Departamento dep:lst1){
                    
                            %>
                            <option value="<%= dep.getIdDepartamento() %>"><%= dep.getDepartamento() %></option>
                    <%
                    }    
                    %>
             </select>
                        
                      
                </tr>
       
    </body>
</html>