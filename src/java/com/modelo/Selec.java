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
public class Selec {
    private int id;
    private String registros;
    private String extra;
    
    public Selec() {
    }
    
    
    public Selec(int id, String registros) {
        this.id = id;
        this.registros = registros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistros() {
        return registros;
    }

    public void setRegistros(String registros) {
        this.registros = registros;
    }
    
    
}
