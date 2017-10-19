package com.modelo;

/**
 * Nombre de la clase: DetalleOfertaEmpleo
 * Versión: 1.2
 * Fecha: 7/10/2017
 * Copyright: ITCA-FEPADE
 * @author Diego Fernando Mejia Reyes
 */



public class DetalleOfertaEmpleo {
    private int idDetalleOfertaEmpleo;
    private int numVacantes;
    private String genero;
    private int edad;
    private int aniosExperiencia;
    private int candidatoVehiculo;
    private String descripcionPuesto;
    private double salarioMin;
    private double salarioMax;
    // Tipo CLASE 
    private IdiomaOferta idiomaOferta;  
    private EstudioSuperior estudioSuperior; 
    private EstudioSecundario estudioSecundario;
    private Experiencias experiencia;
    private Empresa empresa;
    private TipoContratacion1 tipoContratacion;
    private TipoPago1 tipoPago;
    
    //--------------------PRUEBAS----------------

    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, int edad, int aniosExperiencia, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa, TipoContratacion1 tipoContratacion, TipoPago1 tipoPago) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.tipoContratacion = tipoContratacion;
        this.tipoPago = tipoPago;
    }
    
    
    
    
    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa, TipoContratacion1 tipoContratacion) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.tipoContratacion = tipoContratacion;
    }

    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
    }

    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
    }
    
    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
    }
    
    
    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
    }
    
    
    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
    }

    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
    }
    
    
    
    public DetalleOfertaEmpleo(IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa, TipoContratacion1 tipoContratacion, TipoPago1 tipoPago) {
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.tipoContratacion = tipoContratacion;
        this.tipoPago = tipoPago;
    }

    public DetalleOfertaEmpleo(int idDetalleOfertaEmpleo, int numVacantes, String genero, int edad, int aniosExperiencia, int candidatoVehiculo, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa, TipoContratacion1 tipoContratacion, TipoPago1 tipoPago) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
        this.numVacantes = numVacantes;
        this.genero = genero;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.candidatoVehiculo = candidatoVehiculo;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.tipoContratacion = tipoContratacion;
        this.tipoPago = tipoPago;
    }
    
    
    
    public DetalleOfertaEmpleo(EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia) {
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
    }

    
    
    public DetalleOfertaEmpleo(Experiencias experiencia) {
        this.experiencia = experiencia;
    }

    public DetalleOfertaEmpleo(EstudioSecundario estudioSecundario, Experiencias experiencia) {
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
    }

    public DetalleOfertaEmpleo(int numVacantes, int edad, int aniosExperiencia, String descripcionPuesto, double salarioMin, double salarioMax, IdiomaOferta idiomaOferta, EstudioSuperior estudioSuperior, EstudioSecundario estudioSecundario, Experiencias experiencia, Empresa empresa, TipoContratacion1 tipoContratacion, TipoPago1 tipoPago) {
        this.numVacantes = numVacantes;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.descripcionPuesto = descripcionPuesto;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.idiomaOferta = idiomaOferta;
        this.estudioSuperior = estudioSuperior;
        this.estudioSecundario = estudioSecundario;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.tipoContratacion = tipoContratacion;
        this.tipoPago = tipoPago;
    }

    
/*
    Integer.parseInt(request.getParameter("txtNumeroVacantes")),
                    Integer.parseInt(request.getParameter("txtEdad")),
                    Integer.parseInt(request.getParameter("txtAniosExperiencia")),
                    request.getParameter("txtDescripcionPuesto"),
                    Double.parseDouble(request.getParameter("txtSalarioMinimo")),
                    Double.parseDouble(request.getParameter("txtSalarioMaximo")),
                    new IdiomaOferta(),
                    estudioSup,
                    estudioSecun,
                    exp,
                    empresa,
                    tipoContratacion,
                    tipoPago   */
    
    //--------------------------------------------
    public DetalleOfertaEmpleo() {
    }

    @Override
    public String toString() {
        return "DetalleOfertaEmpleo{" + "idDetalleOfertaEmpleo=" + idDetalleOfertaEmpleo + ", numVacantes=" + numVacantes + ", genero=" + genero + ", edad=" + edad + ", aniosExperiencia=" + aniosExperiencia + ", candidatoVehiculo=" + candidatoVehiculo + ", descripcionPuesto=" + descripcionPuesto + ", salarioMin=" + salarioMin + ", salarioMax=" + salarioMax + ", idiomaOferta=" + idiomaOferta + ", estudioSuperior=" + estudioSuperior + ", estudioSecundario=" + estudioSecundario + ", experiencia=" + experiencia + ", empresa=" + empresa + ", tipoContratacion=" + tipoContratacion + ", tipoPago=" + tipoPago + '}';
    }

    
    
   
    
    public int getIdDetalleOfertaEmpleo() {
        return idDetalleOfertaEmpleo;
    }

    public void setIdDetalleOfertaEmpleo(int idDetalleOfertaEmpleo) {
        this.idDetalleOfertaEmpleo = idDetalleOfertaEmpleo;
    }

    public int getNumVacantes() {
        return numVacantes;
    }

    public void setNumVacantes(int numVacantes) {
        this.numVacantes = numVacantes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getCandidatoVehiculo() {
        return candidatoVehiculo;
    }

    public void setCandidatoVehiculo(int candidatoVehiculo) {
        this.candidatoVehiculo = candidatoVehiculo;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(double salarioMax) {
        this.salarioMax = salarioMax;
    }

    public IdiomaOferta getIdiomaOferta() {
        return idiomaOferta;
    }

    public void setIdiomaOferta(IdiomaOferta idiomaOferta) {
        this.idiomaOferta = idiomaOferta;
    }

  
    
    
    

    public EstudioSuperior getEstudioSuperior() {
        return estudioSuperior;
    }

    public void setEstudioSuperior(EstudioSuperior estudioSuperior) {
        this.estudioSuperior = estudioSuperior;
    }

    public EstudioSecundario getEstudioSecundario() {
        return estudioSecundario;
    }

    public void setEstudioSecundario(EstudioSecundario estudioSecundario) {
        this.estudioSecundario = estudioSecundario;
    }

    public Experiencias getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencias experiencia) {
        this.experiencia = experiencia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public TipoContratacion1 getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(TipoContratacion1 tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public TipoPago1 getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago1 tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    


}
