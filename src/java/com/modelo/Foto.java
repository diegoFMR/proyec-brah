/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *Nombre de la clase: Usuario
 * Versión: 1.0
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */
class Foto {
    private int idFoto;
    private String fotoUsuario;

    public Foto() {
    }

    public Foto(int idFoto, String fotoUsuario) {
        this.idFoto = idFoto;
        this.fotoUsuario = fotoUsuario;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(String fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }
    
}
