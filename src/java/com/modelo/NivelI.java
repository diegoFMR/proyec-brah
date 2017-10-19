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
public class NivelI {
    private int idNivelIdioma;
    private String nivelIdioma;

    public NivelI() {
    }

    public NivelI(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }
    

    public NivelI(int idNivelIdioma, String nivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
        this.nivelIdioma = nivelIdioma;
    }

    public NivelI(int idNivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
    }

    public int getIdNivelIdioma() {
        return idNivelIdioma;
    }

    public void setIdNivelIdioma(int idNivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
    }

    public String getNivelIdioma() {
        return nivelIdioma;
    }

    public void setNivelIdioma(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }
    
    
}
