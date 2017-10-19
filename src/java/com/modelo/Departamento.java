package com.modelo;

/**
 *Nombre de la clase: Departamento
 * Versión: 1.0
 * Fecha: 4/10/2017
 * Copyright: ITCA-FEPADE
 * @author Javier Contreras
 */
public class Departamento {
private int idDepartamento;
private String departamento;
private Pais pais;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String departamento, Pais pais) {
        this.idDepartamento = idDepartamento;
        this.departamento = departamento;
        this.pais = pais;
    }

    Departamento(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
