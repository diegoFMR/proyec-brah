/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.modelo.CrudCategoriaCargo;
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
public class ProcesarCategoria extends HttpServlet {

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
         CrudCategoriaCargo ccc = new CrudCategoriaCargo(); 
        
         if(request.getParameter("btnGuardar")!=null){
            String cargo = request.getParameter("txtCargo");
            String categoria = request.getParameter("slcCategoria");
            String sql = "insert into cargo values(null,'"+cargo+"',"+categoria+")";
            
            String msj=ccc.insertar(sql);
            
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("cargo.jsp");
        }
         
        if(request.getParameter("btnModif")!=null){
            String cargo = request.getParameter("txtCargo");
            String categoria = request.getParameter("slcCategoria");
            String idCargo = request.getParameter("txtId");
             
            String sql = "update cargo set nombreCargo='"+cargo+"', idCategoria="+categoria+" where"
                    + " idCargo="+idCargo;
            
            String msj=ccc.insertar(sql);
            
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("cargo.jsp");
        } 
        
        if(request.getParameter("delete")!=null){
            String id = request.getParameter("delete");
            
            String sql="delete from cargo where idCargo="+id;
            String msj= ccc.insertar(sql);
            
             request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("cargo.jsp");
        }
         
        if(request.getParameter("btnInsertar")!=null){
            String categoria = request.getParameter("txtCategoria");
            
            String sql = "insert into categoria values(null,'"+categoria+"')";
            
            String msj=ccc.insertar(sql);
            
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("categoria.jsp");
        }
        
        if(request.getParameter("btnModificar")!=null){
             String categoria = request.getParameter("txtCategoria");
             String id= request.getParameter("txtId");
             
            String sql = "update categoria set nombreCategoria='"+categoria+"' where"
                    + " idCategoria="+id;
            
            String msj=ccc.insertar(sql);
            
            request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("categoria.jsp");
        }
        
        if(request.getParameter("eliminar")!=null){
            String id = request.getParameter("eliminar");
            
            String sql="delete from categoria where idCategoria="+id;
            String msj= ccc.insertar(sql);
            
             request.getSession().setAttribute("mensaje", msj);
            response.sendRedirect("categoria.jsp");
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
