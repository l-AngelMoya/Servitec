/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class FacturaExternaClass {
     private String noFactura;
    private Date fechaEmision;
    private String cedula;
    private int descuento;
    private double subtotal;
    private double iva;
    private double total;

    public FacturaExternaClass() {
        this(null,null,null,0,0,0,0);
        
    }

    public FacturaExternaClass(String noFactura, Date fechaEmision, String cedula, int descuento, double subtotal, double iva, double total) {
        this.noFactura = noFactura;
        this.fechaEmision = fechaEmision;
        this.cedula = cedula;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    
    public String getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(String noFactura) {
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
}
