package com.modelo;

/**
 *Nombre de la clase: EstudioSuperior
 * Versión: 1.2
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes y Javier Contreras
 */
public class EstudioSuperior {
private int idEstudioSuperior;
private String estudiosSuperior;
private int requerido;
private AreaEstudio1 areaEstudio;
private NivelEstudioSuperior nivelEstudioSuperior;

    public EstudioSuperior() {
    }

    public EstudioSuperior(AreaEstudio1 areaEstudio, NivelEstudioSuperior nivelEstudioSuperior) {
        this.areaEstudio = areaEstudio;
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }
    
    /*   */

    public EstudioSuperior(int idEstudioSuperior, String estudiosSuperior, AreaEstudio1 areaEstudio, NivelEstudioSuperior nivelEstudioSuperior) {
        this.idEstudioSuperior = idEstudioSuperior;
        this.estudiosSuperior = estudiosSuperior;
        this.areaEstudio = areaEstudio;
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }
    
    
    public EstudioSuperior(int idEstudioSuperior, String estudiosSuperior, int requerido, AreaEstudio1 areaEstudio) {
        this.idEstudioSuperior = idEstudioSuperior;
        this.estudiosSuperior = estudiosSuperior;
        this.requerido = requerido;
        this.areaEstudio = areaEstudio;
    }
    
    
    public EstudioSuperior(int idEstudioSuperior, String estudiosSuperior, int requerido) {
        this.idEstudioSuperior = idEstudioSuperior;
        this.estudiosSuperior = estudiosSuperior;
        this.requerido = requerido;
    }

    /*   */
    public EstudioSuperior(int idEstudioSuperior, String estudiosSuperior, int requerido, AreaEstudio1 areaEstudio, NivelEstudioSuperior nivelEstudioSuperior) {
        this.idEstudioSuperior = idEstudioSuperior;
        this.estudiosSuperior = estudiosSuperior;
        this.requerido = requerido;
        this.areaEstudio = areaEstudio;
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }

    public EstudioSuperior(String estudiosSuperior, AreaEstudio1 areaEstudio, NivelEstudioSuperior nivelEstudioSuperior) {
        this.estudiosSuperior = estudiosSuperior;
        this.areaEstudio = areaEstudio;
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }

    
    
    

    public AreaEstudio1 getAreaEstudio() {
        return areaEstudio;
    }

    public void setAreaEstudio(AreaEstudio1 areaEstudio) {
        this.areaEstudio = areaEstudio;
    }

    public NivelEstudioSuperior getNivelEstudioSuperior() {
        return nivelEstudioSuperior;
    }

    public void setNivelEstudioSuperior(NivelEstudioSuperior nivelEstudioSuperior) {
        this.nivelEstudioSuperior = nivelEstudioSuperior;
    }

    

    

    public int getIdEstudioSuperior() {
        return idEstudioSuperior;
    }

    public void setIdEstudioSuperior(int idEstudioSuperior) {
        this.idEstudioSuperior = idEstudioSuperior;
    }

    public String getEstudiosSuperior() {
        return estudiosSuperior;
    }

    public void setEstudiosSuperior(String estudiosSuperior) {
        this.estudiosSuperior = estudiosSuperior;
    }


    public int getRequerido() {
        return requerido;
    }

    public void setRequerido(int requerido) {
        this.requerido = requerido;
    }


}
