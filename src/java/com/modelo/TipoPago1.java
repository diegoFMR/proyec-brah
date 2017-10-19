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
public class TipoPago1 {
    private int idTipoPago;
    private String tipoPago;

    public TipoPago1() {
    }

    public TipoPago1(int idTipoPago, String tipoPago) {
        this.idTipoPago = idTipoPago;
        this.tipoPago = tipoPago;
    }

    public TipoPago1(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }
    
    
    
    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
