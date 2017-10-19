package com.modelo;

/**
 *Nombre de la clase: Pais
 * Versión: 1.0
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */
public class Pais {
private int idPais;
private String pais;
private int codArea;

    public Pais() {
    }

    public Pais(int idPais, String pais, int codArea) {
        this.idPais = idPais;
        this.pais = pais;
        this.codArea = codArea;
    }

    Pais(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }
}
