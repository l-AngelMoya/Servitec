/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

import java.sql.Date;

/**
 *
 * @author Anii BC
 */
public class TrabajoClass {
    
    private String nTrabajo;
    private Date fechaTrabajo;
    private Date fechaEntrega;
    private float costoMano;
    private String factura;
    private String descripcion;

    public TrabajoClass() {
        this.nTrabajo = null;
        this.fechaTrabajo = null;
        this.costoMano = 0;
        this.factura = null;
        this.fechaEntrega=null;
        this.descripcion=null;
        
    }

    public TrabajoClass(String nTrabajo, Date fechaTrabajo, Date fechaEntrega, float costoMano, String factura, String descripcion) {
        this.nTrabajo = nTrabajo;
        this.fechaTrabajo = fechaTrabajo;
        this.fechaEntrega = fechaEntrega;
        this.costoMano = costoMano;
        this.factura = factura;
        this.descripcion = descripcion;
    }

   

    public String getnTrabajo() {
        return nTrabajo;
    }

    public void setnTrabajo(String nTrabajo) {
        this.nTrabajo = nTrabajo;
    }

    public Date getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setFechaTrabajo(Date fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }

    public float getCostoMano() {
        return costoMano;
    }

    public void setCostoMano(float costoMano) {
        this.costoMano = costoMano;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
