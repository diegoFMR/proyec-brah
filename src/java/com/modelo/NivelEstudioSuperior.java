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
public class NivelEstudioSuperior {
    private int idNivelEstudioSuperior;
    private String nivelEstudioSuperior;

    public NivelEstudioSuperior() {
    }

    public NivelEstudioSuperior(int idNivelEstudioSuperior) {
        this.idNivelEstudioSuperior = idNivelEstudioSuperior;
    }
    
    
    
    public NivelEstudioSuperior(int idNivelEstudioSuperior, String nivelEstudioSuperior) {
        this.idNivelEstudioSuperior = idNivelEstudioSuperior;
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }

    public int getIdNivelEstudioSuperior() {
        return idNivelEstudioSuperior;
    }

    public void setIdNivelEstudioSuperior(int idNivelEstudioSuperior) {
        this.idNivelEstudioSuperior = idNivelEstudioSuperior;
    }

    public String getNivelEstudioSuperior() {
        return nivelEstudioSuperior;
    }

    public void setNivelEstudioSuperior(String nivelEstudioSuperior) {
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }
    
}
