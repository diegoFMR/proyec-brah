/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Casa
 */
public class Conexion {
    private Connection con;
    
    private final String url="jdbc:mysql://localhost/proyecto?user=root&password=";
    private final String driver="com.mysql.jdbc.Driver";
    
    
    public void conectar() throws Exception{
        String error="";
        
        try{
           Class.forName(this.getDriver());
           this.setCon(DriverManager.getConnection(this.getUrl()));
            
        }catch(Exception e){
            error=e.toString();
        }
        
     
    }//FINAL CONECTAR
    
    public String getDriver() {
        return driver;
    }
    
    
    public String getUrl() {
        return url;
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public Conexion() {
        
    }
    
    
    public void desconectar() throws Exception{
        if(this.getCon()!=null){
            this.getCon().close();
        }
    }//DESCONECTAR
}
