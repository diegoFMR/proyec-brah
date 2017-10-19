<%-- 
    Document   : OfertaEmpleo
    Created on : 10-05-2017, 06:49:09 PM
    Author     : JavierErnesto
--%>
<%@page import="com.controlador.CrudPais"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
         <% 
             ControladorDetalleOfertaEmpleo controlDetalle = new ControladorDetalleOfertaEmpleo();
             Pais p = new Pais();
             Departamento d = new Departamento();
             EstudioSecundario es = new EstudioSecundario();
             EstudioSuperior esp = new EstudioSuperior();
             CrudPais crudP = new CrudPais();
             
         %>
         <script type="text/javascript">
             
            <%
            if(request.getSession().getAttribute("mensaje")!=null){
            %>
                        alert('<%= request.getSession().getAttribute("mensaje") %>');
            <%
                    session.removeAttribute("mensaje");//Destruir la sesion
                  
                }
             %>
            
             
             function add(selecOtro){
             
             var selec = 'select[name='+selecOtro+']';
             
                <%
                if(request.getSession().getAttribute("sc")!=null){

                   for(Selec i:controlDetalle.llenarSelecDependiente(String.valueOf(request.getSession().getAttribute("sc")))){
                %>
                     $(selec).append($('<option>', {
                        value: <%= i.getId() %>,
                        text: '<%= i.getRegistros() %>'
                    }));                                                  
                 <%                                          
                   }

                request.getSession().removeAttribute("sc");
                }
                %>  
         
             }
             
             
             <%
              if(request.getSession().getAttribute("sc")!=null){
             %>
                alert('<%= request.getSession().getAttribute("sc")%>');  
             <%
          
              }
             
             %>
         </script>
        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/javascriptDetalleOfertaEmpleo.js"></script>
        <script>
             $(document).ready(function (){
                 
                $("#slcPais").change(function () {
                    var mar = document.getElementById('slcPais').value;
                    request = $.ajax({
                        url: "slcDepartamento.jsp",
                        type: "POST",
                        data: {mar: mar
                        }
                    });
                    request.done(function (response) {
                        $("#slcDepartamento").empty();
                        $("#slcDepartamento").append(response);
                    });
                });

            });
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/newcss.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head> <section class="main container">
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
        <h1>CRUD OFERTA EMPLEO</h1>
        <form action="procesardetalleofertaEmpleo" name="CrudOfertaEmpleo" method="POST">
            <table border="1" class="table table-striped">
                <tr>
                    <td>Id Oferta Empleo</td>
                    <td><input type="hiddennumber" name="txtCodigoOfertaEmpleo" readonly></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td>
                        <select name="slcCategoria" t="cargo" ti="nombreCargo" kol="puesto"> <%-- onchange="call(this,'slcCargo')"--%> 
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
                        <select name="slcCargo"> 
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
                    <td><input type="text" name="txtNombreCargo"></td>
                </tr>
                <tr>
                    <td>Id Pais</td>
                    <td><input type="number" name="txtCodigoPais"</td>
                </tr>
                <tr>
                    <td>Nombre pais</td>
                    <td>
                        <select name="slcPais" id="slcPais"> 
                    <%
                    List<Pais> lst = crudP.mostrarPais();
                    for(Pais pa:lst){
                    %>
                    <option value="<%= pa.getIdPais() %>"><%= pa.getPais() %></option>
                    <% 
                    }    
                    %>
                 </select> 
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Id Departamento</td>
                    <td><input type="number" name="txtCodigoDepartamento"></td>
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
                        <select name="slcMunicipio"> 
                            
                        </select>
                    </td>
                </tr>
              
                <tr>
                    <td>Numero de vacantes</td>
                    <td><input type="number" name="txtNumeroVacantes"></td>
                </tr>
                <tr>
                    <td>Genero</td>
                    <td>Masculino<input type="radio" name="rbGenero" value="masculino" checked>Femenino<input type="radio" name="rbGenero" value="femenino"></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td><input type="number" name="txtEdad"></td>
                </tr>
                <tr>
                    <td>Años Experiencia</td>
                    <td><input type="number" name="txtAniosExperiencia"></td>
                </tr>
                <tr>
                    <td>Requiere automovil</td>
                    <td>
                        <input type="checkbox" name="cbAuto">
                    </td>
                </tr>
                <tr>
                    <td>Descripcion Puesto</td>
                    <td>
                        <textarea name="txtDescripcionPuesto">
                        
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td>Tipo Contratacion</td>
                    <td>
                        <select name="slcTipoContratacion"> 
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
                    <td><input type="number" name="txtSalarioMinimo"></td>
                </tr>
                <tr>
                    <td>Salario Maximo</td>
                    <td><input type="number" name="txtSalarioMaximo"></td>
                </tr>
                <tr>
                    <td>Tipo de pago</td>
                    <td>
                        <select name="slcTipoPago"> 
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
                        <select name="slcIdioma"> 
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
                        <select name="slcNivelIdioma" required> 
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
                    <td><input type="checkbox" name="cbRequeridoIdioma"</td>
                </tr>
                <tr>
                    <td>Estudios Superiores</td>
                    <td><input type="text" name="txtEstudiosSuperiores"></td>
                </tr>
                <tr>
                    <td>Nivel Estudio Superior</td>
                    <td>
                        <select name="slcNivelEstudioSuperior" required> 
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
                        <select name="slcAreaEstudio" required> 
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
                    <td><input type="checkbox" name="cbRequeridoEstudioSuperior"></td>
                </tr>
                <tr>
                    <td>Estudio Secundario</td>
                    <td><input type="text" name="txtEstudioSecundario"></td>
                </tr>
                <tr>
                    <td>Requerido Estudio Secundario</td>
                    <td><input type="checkbox" name="cbRequeridoEstudioSecundario"></td>
                </tr>
                <tr>
                    <td>Experiencia</td>
                    <td><input type="text" name="txtExperiencia"></td>
                </tr>
                <tr>
                    <td>Puestos Experiencia</td>
                    <td><input type="text" name="txtPuestoExperiencia"></td>
                </tr>
                <tr>
                    <td>Cargo</td>
                    <td><input type="text" name="txtCargo"></td>
                </tr>
                <tr>
                    <td>Requerido Experiencia</td>
                    <td><input type="checkbox" name="cbRequeridoExperiencia"></td>
                </tr>
                <tr>
                    <td colspan="2">
                <center> <input type="submit" name="insertar" class="btn btn-info" value="Insertar">
                       
                        <input type="reset" name="limpiar" class="btn btn-info" value="Limpiar">   
                    </center></td>
                </tr>
            </table>
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
                        <th>Eliminar</th>
                        <th>Editar</th>
                    </tr><%--  34 --%>
                </thead>
                <thbody>
               <%
          
                  for(OfertaEmpleo of:controlDetalle.mostrarOferta()){ 
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
                    <td><a href="procesardetalleofertaEmpleo?deleteId=<%= of.getIdOfertaEmpleo()%>">Nigga whut</a></td>
                    <td><a href="procesardetalleofertaEmpleo?deleteId=<%= of.getIdOfertaEmpleo()%>">Nigga whut</a></td>
                    <%
                        }
                    %>
                    
                        
                  
                </thbody>
                
            </table>
        </form>
    </center>
    </body>
</html>
