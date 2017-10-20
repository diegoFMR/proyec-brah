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
public class Cargo {
    private int idCargo;
    private String cargo;
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Cargo(int idCargo, String cargo, Categoria categoria) {
        this.idCargo = idCargo;
        this.cargo = cargo;
        this.categoria = categoria;
    }
    
    

    public Cargo() {
    }

    public Cargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public Cargo(int idCargo, String cargo) {
        this.idCargo = idCargo;
        this.cargo = cargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
