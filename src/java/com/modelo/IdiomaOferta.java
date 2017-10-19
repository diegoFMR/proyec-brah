package com.modelo;

/**
 *Nombre de la clase: IdiomaOferta
 * Versión: 1.0
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */
public class IdiomaOferta {
private int idIdiomaOferta;
private NivelIdioma idiomaNivel;
private DetalleOfertaEmpleo detalleOfertaEmpleo;
private int requerido;

    public IdiomaOferta(int idIdiomaOferta, NivelIdioma idiomaNivel, int requerido) {
        this.idIdiomaOferta = idIdiomaOferta;
        this.idiomaNivel = idiomaNivel;
        this.requerido = requerido;
    }

    public IdiomaOferta(NivelIdioma idiomaNivel, DetalleOfertaEmpleo detalleOfertaEmpleo) {
        this.idiomaNivel = idiomaNivel;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
    }

    public IdiomaOferta(int idIdiomaOferta) {
        this.idIdiomaOferta = idIdiomaOferta;
    }

    public IdiomaOferta(int idIdiomaOferta, NivelIdioma idiomaNivel) {
        this.idIdiomaOferta = idIdiomaOferta;
        this.idiomaNivel = idiomaNivel;
    }
    
    

    public IdiomaOferta() {
    }

    public IdiomaOferta(NivelIdioma idiomaNivel) {
        this.idiomaNivel = idiomaNivel;
    }
   
    public IdiomaOferta(int idIdiomaOferta, NivelIdioma idiomaNivel, DetalleOfertaEmpleo detalleOfertaEmpleo, int requerido) {
        this.idIdiomaOferta = idIdiomaOferta;
        this.idiomaNivel = idiomaNivel;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
        this.requerido = requerido;
    }

    public int getIdIdiomaOferta() {
        return idIdiomaOferta;
    }

    public void setIdIdiomaOferta(int idIdiomaOferta) {
        this.idIdiomaOferta = idIdiomaOferta;
    }

    public NivelIdioma getIdiomaNivel() {
        return idiomaNivel;
    }

    public void setIdiomaNivel(NivelIdioma idiomaNivel) {
        this.idiomaNivel = idiomaNivel;
    }

    public DetalleOfertaEmpleo getDetalleOfertaEmpleo() {
        return detalleOfertaEmpleo;
    }

    public void setDetalleOfertaEmpleo(DetalleOfertaEmpleo detalleOfertaEmpleo) {
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
    }

    public int getRequerido() {
        return requerido;
    }

    public void setRequerido(int requerido) {
        this.requerido = requerido;
    }

   
}
