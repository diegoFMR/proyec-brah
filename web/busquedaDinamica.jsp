<%-- 
    Document   : busquedaDinamica
    Created on : 10-19-2017, 11:55:41 AM
    Author     : Casa
--%>

<%@page import="com.modelo.ControladorDetalleOfertaEmpleo"%>
<%@page import="com.modelo.OfertaEmpleo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <% 
             ControladorDetalleOfertaEmpleo controlDetalle = new ControladorDetalleOfertaEmpleo();
             String tabla= request.getParameter("tbl");
             String atributo = request.getParameter("attr");
             String valor = request.getParameter("nmms");
             
         %>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Yo nigga whatssap</h1>
        <table border="1">
                <thead>
                    <tr>
                       
                        <th>Categoria</th>
                        <th>Cargo</th>
                        <th>Nombre Cargo</th>                       
                        <th>Nombre pais</th>
                        <th>Nombre Departamento</th>
                        <th>Numero de vacantes</th>
                        <th>Genero</th>
                        <th>Edad</th>
                        <th>Años Experiencia</th>
                        <th>Cuenta con vehículo</th>
                        <th>Descripcion Puesto</th>
                        <th>Tipo Contratacion</th>
                        <th>Salario Minimo</th>
                        <th>Salario Maximo</th>
                        <th>Tipo de pago</th>
                        <th>Idioma</th>
                        <th>Nivel</th>
                        <th>Requerido Idioma</th>
                        <th>Estudios Superiores</th>
                        <th>Nivel Estudio Superior</th>
                        <th>Area Estudio</th>
                        <th>Requerido Estudio Superior</th>
                        <th>Estudio Secundario</th>
                        <th>Requerido Estudio Secundario</th>
                        <th>Experiencia</th>
                        <th>Puestos Experiencia</th>
                        <th>Cargo</th>
                        <th>Requerido Experiencia</th>
                        <th>Empresa</th>
                        
                    </tr><%--  34 --%>
                </thead>
                <thbody>
               <%
          
                  for(OfertaEmpleo of:controlDetalle.mostrarOfertaDinamica(tabla, atributo, valor)){ 
                %>
                <tr>
                    <td><%= of.getPuesto().getCategoria().getCategoria() %></td>
                    <td><%= of.getPuesto().getCargo().getCargo() %></td>
                    <td><%= of.getNombreCargo() %></td>
                    <td><%= of.getPais().getPais() %></td>
                    <td><%= of.getDepartamento().getDepartamento() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getNumVacantes() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getGenero() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEdad() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getAniosExperiencia() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getCandidatoVehiculo() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getDescripcionPuesto() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getTipoContratacion().getTipoContratacion() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getSalarioMin() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getSalarioMax() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getTipoPago().getTipoPago() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getIdiomaOferta().getIdiomaNivel().getIdioma().getIdioma() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getIdiomaOferta().getIdiomaNivel().getNivel().getNivelIdioma() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getIdiomaOferta().getRequerido() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSuperior().getEstudiosSuperior() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSuperior().getNivelEstudioSuperior().getNivelEstudioSuperior() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSuperior().getAreaEstudio().getAreaEstudio() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSuperior().getRequerido() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSecundario().getEstudioSecundario() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEstudioSecundario().getRequerido() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getExperiencia().getExperiencia() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getExperiencia().getPuestosExperiencia() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getExperiencia().getCargo() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getExperiencia().getRequerido() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getEmpresa().getNombreEmpresa() %></td>
                    <%
                        }
                    %>
                    
                        
                  
                </thbody>
                
            </table>
                    
            <table border="1">
             
                <table>
                <thbody>
                    <tr>
                        <th>MINIATURA</th>
                    </tr>
                    <tr>
                        <th>Empresa</th>
                        <th>Nombre</th>
                        <th>Cargo</th>
                        <th>Descripción</th>
                        <th>Ver detalle</th>
                    </tr>
               <%
          
                  for(OfertaEmpleo of:controlDetalle.mostrarOfertaDinamica(tabla, atributo, valor)){ 
                %>
                <tr>
                    <td><%= of.getDetalleOfertaEmpleo().getEmpresa().getNombreEmpresa() %></td>
                    <td><%= of.getNombreCargo() %></td>
                    <td><%= of.getPuesto().getCargo().getCargo() %></td>
                    <td><%= of.getDetalleOfertaEmpleo().getDescripcionPuesto() %></td>
                    <td>Link</td>
                    
                    <%
                        }
                    %>
                    
                        
                  
                </thbody>
                
            </table>
        
    </body>
</html>
