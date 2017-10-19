package com.modelo;

/**
 *
 * @author JavierErnesto
 */
public class Experiencias {
private int idExperiencias;
private String experiencia;
private String puestosExperiencia;
private String cargo;
private int requerido;

    public Experiencias() {
    }

    public Experiencias(String experiencia, String puestosExperiencia, String cargo) {
        this.experiencia = experiencia;
        this.puestosExperiencia = puestosExperiencia;
        this.cargo = cargo;
    }

    public Experiencias(int idExperiencias, String experiencia, String puestosExperiencia, String cargo, int requerido) {
        this.idExperiencias = idExperiencias;
        this.experiencia = experiencia;
        this.puestosExperiencia = puestosExperiencia;
        this.cargo = cargo;
        this.requerido = requerido;
    }

    

    public int getIdExperiencias() {
        return idExperiencias;
    }

    public void setIdExperiencias(int idExperiencias) {
        this.idExperiencias = idExperiencias;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getPuestosExperiencia() {
        return puestosExperiencia;
    }

    public void setPuestosExperiencia(String puestosExperiencia) {
        this.puestosExperiencia = puestosExperiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getRequerido() {
        return requerido;
    }

    public void setRequerido(int requerido) {
        this.requerido = requerido;
    }


}
