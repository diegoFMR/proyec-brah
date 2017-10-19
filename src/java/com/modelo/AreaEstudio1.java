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
public class AreaEstudio1 {
    private int idAreaEstudio;
    private String areaEstudio;

    public AreaEstudio1() {
    }

    public AreaEstudio1(int idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }
    
    
    
    public AreaEstudio1(int idAreaEstudio, String areaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
        this.areaEstudio = areaEstudio;
    }

    public int getIdAreaEstudio() {
        return idAreaEstudio;
    }

    public void setIdAreaEstudio(int idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }

    public String getAreaEstudio() {
        return areaEstudio;
    }

    public void setAreaEstudio(String areaEstudio) {
        this.areaEstudio = areaEstudio;
    }
}
