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
public class NivelIdioma {
    private int idNivelIdioma;
    private Idioma idioma;
    private NivelI nivel;

    public NivelIdioma(int idNivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
    }

    
    
    public NivelIdioma() {
    }

    
    
    public NivelIdioma(int idNivelIdioma, Idioma idioma, NivelI nivel) {
        this.idNivelIdioma = idNivelIdioma;
        this.idioma = idioma;
        this.nivel = nivel;
    }

    

    public NivelIdioma(Idioma idioma, NivelI nivel) {
        this.idioma = idioma;
        this.nivel = nivel;
    }

    

    public int getIdNivelIdioma() {
        return idNivelIdioma;
    }

    public void setIdNivelIdioma(int idNivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public NivelI getNivel() {
        return nivel;
    }

    public void setNivel(NivelI nivel) {
        this.nivel = nivel;
    }
    
    
}
