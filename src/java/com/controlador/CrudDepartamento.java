/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.conexion.Conexion;
import com.modelo.Departamento;
import com.modelo.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class CrudDepartamento extends Conexion{
     public List<Departamento> mostrarDepartamento(String pais) throws Exception
    {
        ResultSet res;
        List<Departamento> lst = new ArrayList();
        try
        {
           this.conectar();
           String sql = "select * from Departamento d "
                   + "inner join Pais p "
                   + "on d.idPais = p.idPais "
                   + "where d.idPais ="+pais;
           PreparedStatement pre = this.getCon().prepareCall(sql);
           res = pre.executeQuery();
           while(res.next())
           {
               Pais pa = new Pais();
               pa.setIdPais(res.getInt("idPais"));
               pa.setPais(res.getString("pais"));
               pa.setCodArea(res.getInt("codArea"));
               
               Departamento dep = new Departamento();
               dep.setIdDepartamento(res.getInt("idDepartamento"));
               dep.setDepartamento(res.getString("departamento"));
               dep.setPais(pa);
               lst.add(dep);
           }
        }catch(Exception e)
        {
         throw e;
        }finally
        {
            
        }
        return lst;
    }
    
    
}
