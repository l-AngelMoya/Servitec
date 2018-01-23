/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

/**
 *
 * @author Anii BC
 */
public class ArticuloClass {
    
    private String codigo;
    private String precioUnitario;
    private String descripcion;
    private String descuento;
    private String distribuidora;

    public ArticuloClass(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = "-";
        this.descuento = "-";
        this.distribuidora = "-";
    }

    
    public ArticuloClass() {
        this.codigo = null;
        this.precioUnitario = null;
        this.descripcion = null;
        this.descuento = null;
        this.distribuidora = null;
    
    }
    
    public ArticuloClass(String codigo, String precioUnitario, String descripcion, String descuento, String distribuidora) {
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.distribuidora = distribuidora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "ArticuloClass{" + "codigo=" + codigo + ", precioUnitario=" + precioUnitario + ", descripcion=" + descripcion + ", descuento=" + descuento + ", distribuidora=" + distribuidora + '}';
    }
   
    
    
    
    
    
}
