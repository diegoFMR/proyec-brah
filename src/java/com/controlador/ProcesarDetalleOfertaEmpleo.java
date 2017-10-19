/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.modelo.DetalleOfertaEmpleo;
import com.modelo.EstudioSecundario;
import com.modelo.EstudioSuperior;
import com.modelo.Experiencias;
import com.modelo.NivelEstudioSuperior;
import com.modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Casa
 */
public class ProcesarDetalleOfertaEmpleo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        ControladorDetalleOfertaEmpleo cdoe = new ControladorDetalleOfertaEmpleo();
        
        if(request.getParameter("insertar")!=null){
            
            // NIVELIDIOMA
            Idioma idioma = new Idioma(
                Integer.parseInt(request.getParameter("slcIdioma"))
            );
            NivelI nivelI = new NivelI(
               Integer.parseInt(request.getParameter("slcNivelIdioma"))
            );
            
            NivelIdioma nivelIdioma = new NivelIdioma(
                    idioma,
                    nivelI
            );
            
                //OBTENIENDO ID DE NIVELIDIOMA DOONDE COINCIDAN IDIDIOMA Y IDNIVEL
            nivelIdioma.setIdNivelIdioma(cdoe.seleccionarNivelIdioma(nivelIdioma));
           
            //LLENANDO IDIOMAOFERTA
            IdiomaOferta idiomaOfer = new IdiomaOferta(
                    nivelIdioma,
                    new DetalleOfertaEmpleo()
            );
            
            if(request.getParameter("cbRequeridoIdioma")!=null){
                idiomaOfer.setRequerido(1);
            }else{
                idiomaOfer.setRequerido(0);
            }
            
            //LLENANDO OBJ EXPERIENCIAS
            Experiencias exp = new Experiencias(
                    request.getParameter("txtExperiencia"),
                    request.getParameter("txtPuestoExperiencia"),
                    request.getParameter("txtCargo")
            );
            
            if(request.getParameter("cbRequeridoExperiencia")!=null){
                exp.setRequerido(1);
            }else{
                exp.setRequerido(0);
            }
            //LLENANDO OBJ ESTUDIOSECUNDARIO
            EstudioSecundario estudioSecun = new EstudioSecundario(
                  request.getParameter("txtEstudioSecundario")
            );
            
            if(request.getParameter("cbRequeridoEstudioSecundario")!=null){
                estudioSecun.setRequerido(1);
            }else{
                estudioSecun.setRequerido(0);
            }
          
            //LLENANDO OBJ NIVELESTUDIOSUPERIOR, AREAESTUDIO Y ESTUDIOSUPERIOR
            NivelEstudioSuperior nivelEstudioSu = new NivelEstudioSuperior(
                    Integer.parseInt(request.getParameter("slcNivelEstudioSuperior"))
            );
            
            AreaEstudio1 areaEstudio = new AreaEstudio1(
                    Integer.parseInt(request.getParameter("slcAreaEstudio"))
            );
            
            
            EstudioSuperior estudioSup = new EstudioSuperior(
                   request.getParameter("txtEstudiosSuperiores"),
                   areaEstudio,
                   nivelEstudioSu
            );
            
           if(request.getParameter("cbRequeridoEstudioSuperior")!=null){
                estudioSup.setRequerido(1);
            }else{
                estudioSup.setRequerido(0);
            }
           
            //LLENANDO TIPOCONTRATACION
            TipoContratacion1 tipoContratacion = new TipoContratacion1(
                    Integer.parseInt(request.getParameter("slcTipoContratacion"))
            );
            
            //LLENANDO TIPOPAGO
            TipoPago1 tipoPago = new TipoPago1(
                    Integer.parseInt(request.getParameter("slcTipoPago"))
            );
            
            //++++++++++++++++ATENTION++++++++++++
            Empresa empresa = new Empresa(1);
   
            //----------------------------------------------------------------
            DetalleOfertaEmpleo detalleOfertaEmpleo = new DetalleOfertaEmpleo(                 
                    Integer.parseInt(request.getParameter("txtNumeroVacantes")),
                    Integer.parseInt(request.getParameter("txtEdad")),
                    Integer.parseInt(request.getParameter("txtAniosExperiencia")),
                    request.getParameter("txtDescripcionPuesto"),
                    Double.parseDouble(request.getParameter("txtSalarioMinimo")),
                    Double.parseDouble(request.getParameter("txtSalarioMaximo")),
                    new IdiomaOferta(),
                    estudioSup,
                    estudioSecun,
                    exp,
                    empresa,
                    tipoContratacion,
                    tipoPago               
            );
           
            if(request.getParameter("rbGenero")=="masculino"){
                detalleOfertaEmpleo.setGenero("masculino");
            }else{
                detalleOfertaEmpleo.setGenero("femenino");
            }
           
            if(request.getParameter("cbAuto")!=null){
                detalleOfertaEmpleo.setCandidatoVehiculo(1); ;
            }else{
                detalleOfertaEmpleo.setCandidatoVehiculo(0);
            }
            
            //----------------------------------------------------------------
            
            //PARA OFERTAEMPLEO
            
            //CATEGORIA, CARGO Y PUESTO
            Categoria categoria = new Categoria(
                    Integer.parseInt(request.getParameter("slcCategoria"))
            );
            
            Cargo cargo = new Cargo(
                    Integer.parseInt(request.getParameter("slcCargo"))
            );
            
            Puesto puesto = new Puesto(
                    cargo,
                    categoria
            );
            ////OBTENIENDO ID DE PUESTO DOONDE COINCIDAN IDCARGO Y IDCATEGORIA
            puesto.setIdPuesto(cdoe.seleccionarPuesto(puesto));
            
                OfertaEmpleo ofertaEmpleo = new OfertaEmpleo(
                      request.getParameter("txtNombreCargo"),
                        puesto
                );
            
             String msj="";
             String msj1="";
             try{
                msj  = cdoe.insertar(detalleOfertaEmpleo,ofertaEmpleo,idiomaOfer);
                msj1 = cdoe.insertarDetalleOfertaEmpleo(detalleOfertaEmpleo, ofertaEmpleo);
             //   msj  = cdoe.insertarOfertaEmpleo(ofertaEmpleo);
            }catch(Exception e){
                msj = e.toString();
            }
                
           
            request.getSession().setAttribute("mensaje", msj+msj1);
            response.sendRedirect("OfertaEmpleo.jsp");
            
        }//FINAL INSERTAR
        
        
        
        if(request.getParameter("modificar")!=null){
            
            // NIVELIDIOMA
            Idioma idioma = new Idioma(
                Integer.parseInt(request.getParameter("slcIdioma"))
            );
            NivelI nivelI = new NivelI(
               Integer.parseInt(request.getParameter("slcNivelIdioma"))
            );
            
            NivelIdioma nivelIdioma = new NivelIdioma(
                    idioma,
                    nivelI
            );
            
                //OBTENIENDO ID DE NIVELIDIOMA DOONDE COINCIDAN IDIDIOMA Y IDNIVEL
            nivelIdioma.setIdNivelIdioma(cdoe.seleccionarNivelIdioma(nivelIdioma));
           
            //LLENANDO IDIOMAOFERTA
            IdiomaOferta idiomaOfer = new IdiomaOferta(
                    nivelIdioma
            );
            
            idiomaOfer.setIdIdiomaOferta(Integer.parseInt(request.getParameter("txtIdIdiomaOferta")));
            if(request.getParameter("cbRequeridoIdioma")!=null){
                idiomaOfer.setRequerido(1);
            }else{
                idiomaOfer.setRequerido(0);
            }
            
            //LLENANDO OBJ EXPERIENCIAS
            Experiencias exp = new Experiencias(
                   
                    request.getParameter("txtExperiencia"),
                    request.getParameter("txtPuestoExperiencia"),
                    request.getParameter("txtCargo")
            );
            exp.setIdExperiencias(Integer.parseInt(request.getParameter("txtIdExperiencias")));
            
            if(request.getParameter("cbRequeridoExperiencia")!=null){
                exp.setRequerido(1);
            }else{
                exp.setRequerido(0);
            }
            //LLENANDO OBJ ESTUDIOSECUNDARIO
            EstudioSecundario estudioSecun = new EstudioSecundario(
                    Integer.parseInt(request.getParameter("txtIdEstudioSecundario"))
            );
            estudioSecun.setEstudioSecundario(request.getParameter("txtEstudioSecundario"));
            
            
            if(request.getParameter("cbRequeridoEstudioSecundario")!=null){
                estudioSecun.setRequerido(1);
            }else{
                estudioSecun.setRequerido(0);
            }
          
            //LLENANDO OBJ NIVELESTUDIOSUPERIOR, AREAESTUDIO Y ESTUDIOSUPERIOR
            NivelEstudioSuperior nivelEstudioSu = new NivelEstudioSuperior(
                    Integer.parseInt(request.getParameter("slcNivelEstudioSuperior"))
            );
            
            AreaEstudio1 areaEstudio = new AreaEstudio1(
                    Integer.parseInt(request.getParameter("slcAreaEstudio"))
            );
            
            
            EstudioSuperior estudioSup = new EstudioSuperior(
                   Integer.parseInt(request.getParameter("txtIdEstudioSuperior")),
                   request.getParameter("txtEstudiosSuperiores"),
                   areaEstudio,
                   nivelEstudioSu
            );
            
           if(request.getParameter("cbRequeridoEstudioSuperior")!=null){
                estudioSup.setRequerido(1);
            }else{
                estudioSup.setRequerido(0);
            }
           
            //LLENANDO TIPOCONTRATACION
            TipoContratacion1 tipoContratacion = new TipoContratacion1(
                    Integer.parseInt(request.getParameter("slcTipoContratacion"))
            );
            
            //LLENANDO TIPOPAGO
            TipoPago1 tipoPago = new TipoPago1(
                    Integer.parseInt(request.getParameter("slcTipoPago"))
            );
            
            //++++++++++++++++ATENTION++++++++++++
            Empresa empresa = new Empresa(1);
   
            //----------------------------------------------------------------
            DetalleOfertaEmpleo detalleOfertaEmpleo = new DetalleOfertaEmpleo(
                    Integer.parseInt(request.getParameter("txtIdDetalleOfertaEmpleo")),
                    Integer.parseInt(request.getParameter("txtNumeroVacantes")),
                    Integer.parseInt(request.getParameter("txtEdad")),
                    Integer.parseInt(request.getParameter("txtAniosExperiencia")),
                    request.getParameter("txtDescripcionPuesto"),
                    Double.parseDouble(request.getParameter("txtSalarioMinimo")),
                    Double.parseDouble(request.getParameter("txtSalarioMaximo")),
                    idiomaOfer,
                    estudioSup,
                    estudioSecun,
                    exp,
                    empresa,
                    tipoContratacion,
                    tipoPago               
            );
            
           if(request.getParameter("rbGenero")=="masculino"){
                detalleOfertaEmpleo.setGenero("masculino");
            }else{
                detalleOfertaEmpleo.setGenero("femenino");
            }
           
            if(request.getParameter("cbAuto")!=null){
                detalleOfertaEmpleo.setCandidatoVehiculo(1);
            }else{
                 detalleOfertaEmpleo.setCandidatoVehiculo(0);
            }
             
            //PARA OFERTAEMPLEO
            
            //CATEGORIA, CARGO Y PUESTO
            Categoria categoria = new Categoria(
                    Integer.parseInt(request.getParameter("slcCategoria"))
            );
            
            Cargo cargo = new Cargo(
                    Integer.parseInt(request.getParameter("slcCargo"))
            );
            
            Puesto puesto = new Puesto(
                    cargo,
                    categoria
            );
            
            ////OBTENIENDO ID DE PUESTO DOONDE COINCIDAN IDCARGO Y IDCATEGORIA
            puesto.setIdPuesto(cdoe.seleccionarPuesto(puesto));
            
                OfertaEmpleo ofertaEmpleo = new OfertaEmpleo(
                      request.getParameter("txtNombreCargo"),
                        puesto
                );
               
            //-------------------------------------------------
             //cdoe.insertar(detalleOfertaEmpleo, ofertaEmpleo, idiomaOfer);
             String msj="GOOD";
             String msj1=""; 
             try{
          
            }catch(Exception e){
                msj = e.toString();
            }
                
           
            request.getSession().setAttribute("mensaje", msj/*, msj+msj1*/);
            response.sendRedirect("OfertaEmpleo.jsp");
            
        }//FINAL INSERTAR------------
        
           if(request.getParameter("modificar")!=null){
            
            // NIVELIDIOMA
            Idioma idioma = new Idioma(
                Integer.parseInt(request.getParameter("slcIdioma"))
            );
            NivelI nivelI = new NivelI(
               Integer.parseInt(request.getParameter("slcNivelIdioma"))
            );
            
            NivelIdioma nivelIdioma = new NivelIdioma(
                    idioma,
                    nivelI
            );
            
            nivelIdioma.setIdNivelIdioma(0);
                //OBTENIENDO ID DE NIVELIDIOMA DOONDE COINCIDAN IDIDIOMA Y IDNIVEL
            nivelIdioma.setIdNivelIdioma(cdoe.seleccionarNivelIdioma(nivelIdioma));
           
            //LLENANDO IDIOMAOFERTA
            IdiomaOferta idiomaOfer = new IdiomaOferta(
                    nivelIdioma,
                    new DetalleOfertaEmpleo()
            );
            
            if(request.getParameter("cbRequeridoIdioma")!=null){
                idiomaOfer.setRequerido(1);
            }else{
                idiomaOfer.setRequerido(0);
            }
            
            idiomaOfer.setIdIdiomaOferta(Integer.parseInt(request.getParameter("txtIdIdiomaOferta")));
            
            //LLENANDO OBJ EXPERIENCIAS
            Experiencias exp = new Experiencias(
                    request.getParameter("txtExperiencia"),
                    request.getParameter("txtPuestoExperiencia"),
                    request.getParameter("txtCargo")
            );
            
            if(request.getParameter("cbRequeridoExperiencia")!=null){
                exp.setRequerido(1);
            }else{
                exp.setRequerido(0);
            }
            exp.setIdExperiencias(Integer.parseInt(request.getParameter("txtIdExperiencias")));
            
            //LLENANDO OBJ ESTUDIOSECUNDARIO
            EstudioSecundario estudioSecun = new EstudioSecundario(
                  request.getParameter("txtEstudioSecundario")
            );
            
            if(request.getParameter("cbRequeridoEstudioSecundario")!=null){
                estudioSecun.setRequerido(1);
            }else{
                estudioSecun.setRequerido(0);
            }
            
            estudioSecun.setIdEstudioSecundario(Integer.parseInt(request.getParameter("txtIdEstudioSecundario")));
            
            //LLENANDO OBJ NIVELESTUDIOSUPERIOR, AREAESTUDIO Y ESTUDIOSUPERIOR
            NivelEstudioSuperior nivelEstudioSu = new NivelEstudioSuperior(
                    Integer.parseInt(request.getParameter("slcNivelEstudioSuperior"))
            );
            
            AreaEstudio1 areaEstudio = new AreaEstudio1(
                    Integer.parseInt(request.getParameter("slcAreaEstudio"))
            );
            
            
            EstudioSuperior estudioSup = new EstudioSuperior(
                   request.getParameter("txtEstudiosSuperiores"),
                   areaEstudio,
                   nivelEstudioSu
            );
            
           if(request.getParameter("cbRequeridoEstudioSuperior")!=null){
                estudioSup.setRequerido(1);
            }else{
                estudioSup.setRequerido(0);
            }
           
            estudioSup.setIdEstudioSuperior(Integer.parseInt(request.getParameter("txtIdEstudioSuperior")));
            //LLENANDO TIPOCONTRATACION
            TipoContratacion1 tipoContratacion = new TipoContratacion1(
                    Integer.parseInt(request.getParameter("slcTipoContratacion"))
            );
            
            //LLENANDO TIPOPAGO
            TipoPago1 tipoPago = new TipoPago1(
                    Integer.parseInt(request.getParameter("slcTipoPago"))
            );
            
  
            
            //++++++++++++++++ATENTION++++++++++++
            Empresa empresa = new Empresa(1);
   
            //----------------------------------------------------------------
            
            
            
            DetalleOfertaEmpleo detalleOfertaEmpleo = new DetalleOfertaEmpleo(
                    
                    Integer.parseInt(request.getParameter("txtNumeroVacantes")),
                    Integer.parseInt(request.getParameter("txtEdad")),
                    Integer.parseInt(request.getParameter("txtAniosExperiencia")),
                    request.getParameter("txtDescripcionPuesto"),
                    Double.parseDouble(request.getParameter("txtSalarioMinimo")),
                    Double.parseDouble(request.getParameter("txtSalarioMaximo")),
                    idiomaOfer,
                    estudioSup,
                    estudioSecun,
                    exp,
                    empresa,
                    tipoContratacion,
                    tipoPago               
            );
            
            
            
           if(request.getParameter("rbGenero")=="masculino"){
                detalleOfertaEmpleo.setGenero("masculino");
            }else{
                detalleOfertaEmpleo.setGenero("femenino");
            }
           
            if(request.getParameter("cbAuto")!=null){
                detalleOfertaEmpleo.setCandidatoVehiculo(1);
            }else{
                detalleOfertaEmpleo.setCandidatoVehiculo(0);
            }
            
            detalleOfertaEmpleo.setIdDetalleOfertaEmpleo(Integer.parseInt(request.getParameter("txtIdDetalle")));
            //----------------------------------------------------------------
            
            //PARA OFERTAEMPLEO
            
            //CATEGORIA, CARGO Y PUESTO
            Categoria categoria = new Categoria(
                    Integer.parseInt(request.getParameter("slcCategoria"))
            );
            
            Cargo cargo = new Cargo(
                    Integer.parseInt(request.getParameter("slcCargo"))
            );
            
            Puesto puesto = new Puesto(
                    cargo,
                    categoria
            );
            ////OBTENIENDO ID DE PUESTO DOONDE COINCIDAN IDCARGO Y IDCATEGORIA
            puesto.setIdPuesto(cdoe.seleccionarPuesto(puesto));
            
                OfertaEmpleo ofertaEmpleo = new OfertaEmpleo(
                      request.getParameter("txtNombreCargo"),
                        puesto
                );
                
                ofertaEmpleo.setIdOfertaEmpleo(Integer.parseInt(request.getParameter("txtIdOferta")));
                
            
                String msj="";
             try{
                 
                msj  = cdoe.modificar(detalleOfertaEmpleo, ofertaEmpleo, idiomaOfer);
            
            }catch(Exception e){
                msj = e.toString();
            }
                
           
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("editarOferta.jsp?idOferta=3");
            
        }//FINAL MODIFICAR
           
        
        if(request.getParameter("deleteId")!=null){
            
            String msj = cdoe.eliminarOferta(Integer.parseInt(request.getParameter("deleteId")));
            
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("OfertaEmpleo.jsp");
        }//FINAL IF DELETE ID ELIMINAR
        
        
        if(request.getParameter("tablaIndependiente")!=null){
            
            String name=request.getParameter("name");
                                 String tablaIndependiente      = request.getParameter("tablaIndependiente");
                                 String idTablaIndependiente    = request.getParameter("idTablaIndependiente");
                                 String tablaDependiente        = request.getParameter("tablaDependiente");
                                 String idTablaDependiente      = request.getParameter("idTablaDependiente");
                                 String tablaLlaves             = request.getParameter("tablaLlaves");
                                 String idTablaLlaves           = request.getParameter("idTablaLlaves");
                                 String idRecibido              = request.getParameter("idRecibido");
            
            String sql="select "+tablaDependiente+"."+idTablaDependiente+" as id, "+name+" as registro  from "+tablaLlaves +
                        " inner join "+tablaIndependiente+" on "+tablaLlaves+"."+idTablaIndependiente+" = "+tablaIndependiente+"."+idTablaIndependiente+
                        " inner join "+tablaDependiente+" on "+tablaDependiente+"."+idTablaDependiente+" = "+tablaLlaves+"."+idTablaDependiente+
                        " where "+tablaLlaves+"."+idTablaIndependiente+" = "+idRecibido;
            
            request.getSession().setAttribute("sc", sql);
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
