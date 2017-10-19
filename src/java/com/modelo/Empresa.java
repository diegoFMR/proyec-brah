/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *Nombre de la clase: Empresa
 * Versión: 1.0
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */
public class Empresa {
    private int idEmpresa;
    private String nombreEmpresa;
    private String paginaWeb;
    private String descripcionEmpresa;
    private String correoEmpresa;
    private String actividadEmpresa;
    private String telefono;
    private Pais pais;
    private Usuario usuario;
    private Foto foto;

    public Empresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(int idEmpresa, String nombreEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
    public Empresa() {
    }

    public Empresa(Pais pais, Usuario usuario, Foto foto) {
        this.pais = pais;
        this.usuario = usuario;
        this.foto = foto;
    }

    
    
    public Empresa(int idEmpresa, String nombreEmpresa, String paginaWeb, String descripcionEmpresa, String correoEmpresa, String actividadEmpresa, String telefono, Pais pais, Usuario usuario, Foto foto) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.paginaWeb = paginaWeb;
        this.descripcionEmpresa = descripcionEmpresa;
        this.correoEmpresa = correoEmpresa;
        this.actividadEmpresa = actividadEmpresa;
        this.telefono = telefono;
        this.pais = pais;
        this.usuario = usuario;
        this.foto = foto;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getDescripcionEmpresa() {
        return descripcionEmpresa;
    }

    public void setDescripcionEmpresa(String descripcionEmpresa) {
        this.descripcionEmpresa = descripcionEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getActividadEmpresa() {
        return actividadEmpresa;
    }

    public void setActividadEmpresa(String actividadEmpresa) {
        this.actividadEmpresa = actividadEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    
    
    
    
}
