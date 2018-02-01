/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

import java.sql.Date;

/**
 *
 * @author Angel Moya
 */
public class FacturaServitecClass {
    private int noFactura;
    private Date fechaEmision;
    private String cedula;
    private double subtotal;
    private double iva;
    private double total;

    public FacturaServitecClass(){
        this(0, null, null, 0, 0, 0);
    }
    
    public FacturaServitecClass(int noFactura, Date fechaEmision, String cedula, double subtotal, double iva, double total) {
        this.noFactura = noFactura;
        this.fechaEmision = fechaEmision;
        this.cedula = cedula;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
