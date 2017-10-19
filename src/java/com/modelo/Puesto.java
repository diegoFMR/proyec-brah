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
public class Puesto {
    private int idPuesto;
    private Cargo cargo;
    private Categoria categoria;

    public Puesto() {
    }

    public Puesto(int idPuesto, Cargo cargo, Categoria categoria) {
        this.idPuesto = idPuesto;
        this.cargo = cargo;
        this.categoria = categoria;
    }

    public Puesto(Cargo cargo, Categoria categoria) {
        this.cargo = cargo;
        this.categoria = categoria;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
