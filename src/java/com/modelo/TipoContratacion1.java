/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author Casa
 */
public class TipoContratacion1 {
    private int idTipoContratacion;
    private String tipoContratacion;

    public TipoContratacion1() {
    }

    public TipoContratacion1(int idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }
    
    
    
    public TipoContratacion1(int idTipoContratacion, String tipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
        this.tipoContratacion = tipoContratacion;
    }

    public int getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(int idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }
    
}
