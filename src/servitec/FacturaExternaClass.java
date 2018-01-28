/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

import InterfazGrafica.Articulo;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class FacturaExternaClass {
    private int noRegistro;
    private String noFactura;
    private Date fechaEmision;
    private String idDistribuidora;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;
    //private ArrayList <Articulo> listaArticulo;

    public FacturaExternaClass(){
        this(0, null, null, null, 0, 0, 0, 0);
    }

    public FacturaExternaClass(int noRegistro, String noFactura, Date fechaEmision, String idDistribuidora, double subtotal, double descuento, double iva, double total) {
        this.noRegistro = noRegistro;
        this.noFactura = noFactura;
        this.fechaEmision = fechaEmision;
        this.idDistribuidora = idDistribuidora;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.total = total;
        //this.listaArticulo = listaArticulo;
    }

    public int getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(int noRegistro) {
        this.noRegistro = noRegistro;
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

    public String getIdDistribuidora() {
        return idDistribuidora;
    }

    public void setIdDistribuidora(String idDistribuidora) {
        this.idDistribuidora = idDistribuidora;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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
