/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class CrudCategoriaCargo extends Conexion{
    ResultSet rs;
    
    public ArrayList<Categoria> mostrar(String sql){
       
        ArrayList<Categoria> lista = new ArrayList();
        try{
            this.conectar();
            
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                Categoria c = new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre")
                );//Constructor con parámetros
                
                lista.add(c);
            }//FINAL WHILE
        }catch(Exception e){
           Categoria c = new Categoria();
           c.setCategoria(e.toString());
           lista.add(c);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
    public ArrayList<Cargo> mostrarCargo(String sql){
       
        ArrayList<Cargo> lista = new ArrayList();
        try{
            this.conectar();
            
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                Categoria cat = new Categoria(
                        rs.getInt("idCat"),
                        rs.getString("nombreCat")
                );
                
                Cargo c = new Cargo(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        cat
                );//Constructor con parámetros
                
                lista.add(c);
            }//FINAL WHILE
        }catch(Exception e){
           Cargo c = new Cargo();
           c.setCargo(e.toString());
           lista.add(c);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
     public String insertar(String sql){
        
        String msj="";
        try{
            this.conectar();
           
            this.getCon().prepareStatement(sql).executeUpdate();
         
            
            msj="Datos insertados correctamente!";
        }catch(Exception e){
            msj= e.toString();
        }
        
        return msj;
    }//FINAL MODIFICAR
    
}
