/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.conexion.Conexion;
import com.modelo.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class CrudPais extends Conexion{
    
    public List<Pais> mostrarPais() throws Exception 
    {
        ResultSet res;
        List<Pais> lst = new ArrayList();
        try
        {
            this.conectar();
            String sql = "select * from Pais";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res=pre.executeQuery();
            while(res.next())
            {
               Pais pa = new Pais();
               pa.setIdPais(res.getInt("idPais"));
               pa.setPais(res.getString("pais"));
               pa.setCodArea(res.getInt("codArea"));
               lst.add(pa);
                
            }
        }catch(Exception e)
        {
            throw e;
        }
        
        return lst;
    }
}
