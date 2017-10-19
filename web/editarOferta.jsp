<%-- REAL
    Document   : editarOferta
    Created on : 10-10-2017, 04:44:23 PM
    Author     : Diego
--%>

<%@page import="com.modelo.Selec"%>
<%@page import="com.modelo.OfertaEmpleo"%>
<%@page import="com.modelo.ControladorDetalleOfertaEmpleo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <% 
             ControladorDetalleOfertaEmpleo controlDetalle = new ControladorDetalleOfertaEmpleo();
             int idOferta = Integer.parseInt(request.getParameter("idOferta"));
             
             OfertaEmpleo ofer = controlDetalle.mostrarEditarOferta(idOferta).get(0);
         %>
        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/editarOfertaEmpleo.js"></script>
        <script>
            
             <%
            if(request.getSession().getAttribute("mensaje")!=null){
            %>
                        alert('<%= request.getSession().getAttribute("mensaje") %>');
            <%
                    session.removeAttribute("mensaje");//Destruir la sesion
                  
                }
             %>
            
            $( document ).ready(function() {
    
              setearValores(<%= ofer.getPuesto().getCategoria().getIdCategoria() %>,<%= ofer.getPuesto().getCargo().getIdCargo() %>,
                            <%= ofer.getPais().getIdPais() %>,<%= ofer.getDepartamento().getIdDepartamento() %>,
                            '<%= ofer.getDetalleOfertaEmpleo().getGenero() %>',<%= ofer.getDetalleOfertaEmpleo().getCandidatoVehiculo() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getTipoContratacion().getIdTipoContratacion() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getTipoPago().getIdTipoPago() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getIdiomaOferta().getIdiomaNivel().getIdioma().getIdIdioma() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getIdiomaOferta().getIdiomaNivel().getNivel().getIdNivelIdioma() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getIdiomaOferta().getRequerido() %>,<%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getNivelEstudioSuperior().getIdNivelEstudioSuperior() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getAreaEstudio().getIdAreaEstudio()%>,
                            <%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getRequerido() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getRequerido() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getEstudioSecundario().getRequerido() %>,
                            <%= ofer.getDetalleOfertaEmpleo().getExperiencia().getRequerido() %>);
    
            });
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/newcss.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <section class="main container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ADMINISTRADOR</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Inicio</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
    </ul>
  </div>
</nav>
    </head>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="img/1.jpeg">
    </div>

    <div class="item">
      <img src="img/2.jpg">
    </div>

    <div class="item">
      <img src="img/3.jpg">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Anterior</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Siguiente</span>
  </a>
</div>
    <section class="jumbotron jumbotron-fm">
            <div class="container">
                <h1 class="titulo-blog">Job Search</h1>
                <p>Best page to find a job</p>
            </div>                      
        </section>
    <body></section>
    <center>
        <h1>EditarOFERTA EMPLEO</h1>
        <form action="procesareditarofertaempleo" name="CrudOfertaEmpleo" method="get">
            <table border="1" class="table table-striped">
                <input type="text" name="txtIdOferta" value="<%= idOferta %>" />
                <input type="text" name="txtIdDetalle" value="<%= ofer.getDetalleOfertaEmpleo().getIdDetalleOfertaEmpleo() %>" />
                <input type="text" name="txtIdIdiomaOferta" value="<%= ofer.getDetalleOfertaEmpleo().getIdiomaOferta().getIdIdiomaOferta() %>" />
                <input type="text" name="txtIdEstudioSuperior" value="<%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getIdEstudioSuperior() %>" />
                <input type="text" name="txtIdEstudioSecundario" value="<%= ofer.getDetalleOfertaEmpleo().getEstudioSecundario().getIdEstudioSecundario() %>" />
                <input type="text" name="txtIdExperiencias" value="<%= ofer.getDetalleOfertaEmpleo().getExperiencia().getIdExperiencias() %>" />
                
                <tr>
                    <td>Id Oferta Empleo</td>
                    <td><input type="hiddennumber" name="txtCodigoOfertaEmpleo" readonly></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td>
                        <select name="slcCategoria" t="cargo" ti="nombreCargo" kol="puesto" id="slcCategoria"> <%-- onchange="call(this,'slcCargo')"--%> 
                         <option value="" >Selecionar...</option>
                         <% 
                            for(Selec i:controlDetalle.llenarSelec("idCategoria", "nombreCategoria", "categoria")){
                         %>
                             <option value="<%= i.getId() %>" ><%= i.getRegistros() %></option>
                         <% 
                             }
                         %>   
                        </select>
                    </td>
                </tr>
                </tr>
                <tr>
                    <td>Cargo</td>
                    <td>
                        <select name="slcCargo" id="slcCargo"> 
                            <option value="1">FRONT END</option>
                            <option value="4">Jefe de depto</option>
                            <option value="3">Cocinero</option>
               <%--                 <%
                                    if(request.getSession().getAttribute("sc")!=null){
                                        
                                        for(Selec i:controlDetalle.llenarSelecDependiente(String.valueOf(request.getSession().getAttribute("sc")))){
                                %>
                                        <option value="<%= i.getId() %>"><%= i.getRegistros() %></option>
                                       
                                <%                                          
                                        }

                                    request.getSession().removeAttribute("sc");
                                    }
                                %> 
               --%>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Nombre Cargo</td>
                    <td><input type="text" name="txtNombreCargo" value="<%= ofer.getNombreCargo() %>"></td>
                </tr>
                <tr>
                    <td>Id Pais</td>
                    <td><input type="number" name="txtCodigoPais"</td>
                </tr>
                <tr>
                    <td>Nombre pais</td>
                    <td>
                        <select name="slcPais" id="slcCategoria"> 
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Id Departamento</td>
                    <td><input type="number" name="txtCodigoDepartamento" ></td>
                </tr>
                <tr>
                    <td>Departamento</td>
                    <td>
                        <select name="slcDepartamento" id="slcDepartamento">  
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Municipio</td>
                    <td>
                        <select name="slcMunicipio" id="slcMunicipio"> 
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="5 ">-----------------------------------------------------------------------------------</td>
                </tr>
                <tr>
                    <td>Numero de vacantes</td>
                    <td><input type="number" name="txtNumeroVacantes" value="<%= ofer.getDetalleOfertaEmpleo().getNumVacantes() %>"></td>
                </tr>
                <tr>
                    <td>Genero</td>
                    <td>Masculino<input type="radio" name="rbGenero" name="genero" value="masculino">Femenino<input type="radio" name="rbGenero" value="femenino"></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td><input type="number" name="txtEdad" value="<%= ofer.getDetalleOfertaEmpleo().getEdad() %>"></td>
                </tr>
                <tr>
                    <td>Años Experiencia</td>
                    <td><input type="number" name="txtAniosExperiencia" value="<%= ofer.getDetalleOfertaEmpleo().getAniosExperiencia() %>"></td>
                </tr>
                <tr>
                    <td>Requiere automovil</td>
                    <td>
                        <input type="checkbox" name="cbAuto" id="cbAuto">
                    </td>
                </tr>
                <tr>
                    <td>Descripcion Puesto</td>
                    <td>
                        <textarea name="txtDescripcionPuesto">
                            <%= ofer.getDetalleOfertaEmpleo().getDescripcionPuesto() %>
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td>Tipo Contratacion</td>
                    <td>
                        <select name="slcTipoContratacion" id="slcTipoContratacion"> 
                            <% 
                            for(Selec i:controlDetalle.llenarSelec("idTipoContratacion", "tipoContratacion", "tipocontratacion")){
                         %>
                             <option value="<%= i.getId() %>" ><%= i.getRegistros() %></option>
                         <% 
                             }
                         %> 
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Salario Minimo</td>
                    <td><input type="number" name="txtSalarioMinimo" value="<%= ofer.getDetalleOfertaEmpleo().getSalarioMin() %>"></td>
                </tr>
                <tr>
                    <td>Salario Maximo</td>
                    <td><input type="number" name="txtSalarioMaximo" value="<%= ofer.getDetalleOfertaEmpleo().getSalarioMax() %>"></td>
                </tr>
                <tr>
                    <td>Tipo de pago</td>
                    <td>
                        <select name="slcTipoPago" id="slcTipoPago"> 
                         <% 
                            for(Selec i:controlDetalle.llenarSelec("idTipoPago", "tipoPago", "tipoPago")){
                         %>
                             <option value="<%= i.getId() %>" ><%= i.getRegistros() %></option>
                         <% 
                             }
                         %>       
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Idioma</td>
                    <td>
                        <select name="slcIdioma" id="slcIdioma"> 
                            <option value="">Selecionar...</option>
                         <%
                    
                             
                                    for(Selec i:controlDetalle.llenarSelec("idIdioma", "idioma", "idioma")){
                                %>
                                    <option value="<%= i.getId() %>"><%= i.getRegistros() %></option>

                                    <% 
                                    }
                                    %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Nivel</td>
                    <td>
                        <select name="slcNivelIdioma" required id="slcNivelIdioma"> 
                            <option value="">Selecionar...</option>
                            <%
                             for(Selec i:controlDetalle.llenarSelec("idNivel", "nivel", "nivel")){
                            %>
                                <option value="<%= i.getId() %>"><%= i.getRegistros() %></option>
                            <% 
                              }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Requerido Idioma</td>
                    <td><input type="checkbox" name="cbRequeridoIdioma" id="cbRequeridoIdioma"></td>
                </tr>
                <tr>
                    <td>Estudios Superiores</td>
                    <td><input type="text" name="txtEstudiosSuperiores" value="<%= ofer.getDetalleOfertaEmpleo().getEstudioSuperior().getEstudiosSuperior() %>"></td>
                </tr>
                <tr>
                    <td>Nivel Estudio Superior</td>
                    <td>
                        <select name="slcNivelEstudioSuperior" required id="slcNivelEstudioSuperior"> 
                            <option value="">Selecionar...</option>
                            <%
                             for(Selec i:controlDetalle.llenarSelec("idNivelEstudioSuperior", "nivelEstudioSuperior", "nivelEstudioSuperior")){
                            %>
                                <option value="<%= i.getId() %>"><%= i.getRegistros() %></option>
                            <% 
                              }
                            %>
                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Area Estudio</td>
                    <td>
                        <select name="slcAreaEstudio" required id="slcAreaEstudio"> 
                           <%
                             for(Selec i:controlDetalle.llenarSelec("idAreaEstudio", "areaEstudio", "areaEstudio")){
                            %>
                                <option value="<%= i.getId() %>"><%= i.getRegistros() %></option>
                            <% 
                              }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Requerido Estudio Superior</td>
                    <td><input type="checkbox" name="cbRequeridoEstudioSuperior" id="cbRequeridoEstudioSuperior"></td>
                </tr>
                <tr>
                    <td>Estudio Secundario</td>
                    <td><input type="text" name="txtEstudioSecundario" value="<%= ofer.getDetalleOfertaEmpleo().getEstudioSecundario().getEstudioSecundario() %>"></td>
                </tr>
                <tr>
                    <td>Requerido Estudio Secundario</td>
                    <td><input type="checkbox" name="cbRequeridoEstudioSecundario" id="cbRequeridoEstudioSecundario"></td>
                </tr>
                <tr>
                    <td>Experiencia</td>
                    <td><input type="text" name="txtExperiencia" value="<%= ofer.getDetalleOfertaEmpleo().getExperiencia().getExperiencia() %>"></td>
                </tr>
                <tr>
                    <td>Puestos Experiencia</td>
                    <td><input type="text" name="txtPuestoExperiencia" value="<%= ofer.getDetalleOfertaEmpleo().getExperiencia().getPuestosExperiencia() %>"></td>
                </tr>
                <tr>
                    <td>Cargo</td>
                    <td><input type="text" name="txtCargo" value="<%= ofer.getDetalleOfertaEmpleo().getExperiencia().getCargo() %>"></td>
                </tr>
                <tr>
                    <td>Requerido Experiencia</td>
                    <td><input type="checkbox" name="cbRequeridoExperiencia" id="cbRequeridoExperiencia"></td>
                </tr>
                <tr>
                    <td>
                        <input type="text" value="PRUEBA WE">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                     
                        <input type="submit" name="modificar" class="btn btn-info" value="Modificar">
                        <input type="reset" name="limpiar" class="btn btn-info" value="Limpiar">   
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
