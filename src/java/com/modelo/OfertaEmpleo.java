package com.modelo;

/**
 *
 * @author JavierErnesto
 */
public class OfertaEmpleo {
private int idOfertaEmpleo;
private String nombreCargo;
//TIPO CLASES
private DetalleOfertaEmpleo detalleOfertaEmpleo;
private Puesto puesto;
private Pais pais;
private Departamento departamento;
private Municipio municipio;

    public OfertaEmpleo(Puesto puesto, Pais pais, Departamento departamento, Municipio municipio) {
        this.puesto = puesto;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
    }
    
    /*PRUEBAS*/

    public OfertaEmpleo(int idOfertaEmpleo, String nombreCargo, DetalleOfertaEmpleo detalleOfertaEmpleo, Puesto puesto) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.nombreCargo = nombreCargo;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
        this.puesto = puesto;
    }
    
    
    public OfertaEmpleo(int idOfertaEmpleo, DetalleOfertaEmpleo detalleOfertaEmpleo, Puesto puesto) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
        this.puesto = puesto;
    }
    

    public OfertaEmpleo(int idOfertaEmpleo, String nombreCargo, DetalleOfertaEmpleo detalleOfertaEmpleo) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.nombreCargo = nombreCargo;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
    }
    
    
    /*---------------------------*/
    public OfertaEmpleo(int idOfertaEmpleo, String nombreCargo) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.nombreCargo = nombreCargo;
    }
    
    
    
    

    public OfertaEmpleo() {
    }

    public OfertaEmpleo(String nombreCargo, Puesto puesto) {
        this.nombreCargo = nombreCargo;
        this.puesto = puesto;
    }

    public OfertaEmpleo(int idOfertaEmpleo, String nombreCargo, DetalleOfertaEmpleo detalleOfertaEmpleo, Puesto puesto, Pais pais, Departamento departamento, Municipio municipio) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.nombreCargo = nombreCargo;
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
        this.puesto = puesto;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
    }


    

    public int getIdOfertaEmpleo() {
        return idOfertaEmpleo;
    }

    public void setIdOfertaEmpleo(int idOfertaEmpleo) {
        this.idOfertaEmpleo = idOfertaEmpleo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public DetalleOfertaEmpleo getDetalleOfertaEmpleo() {
        return detalleOfertaEmpleo;
    }

    public void setDetalleOfertaEmpleo(DetalleOfertaEmpleo detalleOfertaEmpleo) {
        this.detalleOfertaEmpleo = detalleOfertaEmpleo;
    }
    
    

}
