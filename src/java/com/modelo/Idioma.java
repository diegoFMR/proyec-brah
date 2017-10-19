/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *Nombre de la clase: Idioma
 * Versión: 1.0
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */
public class Idioma {
    private int idIdioma;
    private String idioma;
   

    public Idioma() {
    }

    public Idioma(int idIdioma, String idioma) {
        this.idIdioma = idIdioma;
        this.idioma = idioma;
    }

    public Idioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    public Idioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
   
    
}
