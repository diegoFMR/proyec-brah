package com.modelo;

/**
 *
 * @author JavierErnesto
 */
public class EstudioSecundario {
private int idEstudioSecundario;
private String estudioSecundario;
private int requerido;

    public EstudioSecundario() {
    }

    public EstudioSecundario(String estudioSecundario) {
        this.estudioSecundario = estudioSecundario;
    }

    public EstudioSecundario(int idEstudioSecundario, String estudioSecundario, int requerido) {
        this.idEstudioSecundario = idEstudioSecundario;
        this.estudioSecundario = estudioSecundario;
        this.requerido = requerido;
    }

    public EstudioSecundario(int idEstudioSecundario) {
        this.idEstudioSecundario = idEstudioSecundario;
    }

    
    

    public int getIdEstudioSecundario() {
        return idEstudioSecundario;
    }

    public void setIdEstudioSecundario(int idEstudioSecundario) {
        this.idEstudioSecundario = idEstudioSecundario;
    }

    public String getEstudioSecundario() {
        return estudioSecundario;
    }

    public void setEstudioSecundario(String estudioSecundario) {
        this.estudioSecundario = estudioSecundario;
    }

    public int getRequerido() {
        return requerido;
    }

    public void setRequerido(int requerido) {
        this.requerido = requerido;
    }


}
