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
public class GastoClass {
    
    
    private String numGasto;
    private String razon;
    private Date fechaGasto;
    private float totalGasto;
    private String idEmpleado;

    public GastoClass() {
        this.numGasto = null;
        this.razon = null;
        this.fechaGasto = null;
        this.totalGasto = 0 ;
        this.idEmpleado = null;
        
        
        
    }

    public GastoClass(String numGasto, String razon, Date fechaGasto, float totalGasto, String idEmpleado) {
        this.numGasto = numGasto;
        this.razon = razon;
        this.fechaGasto = fechaGasto;
        this.totalGasto = totalGasto;
        this.idEmpleado = idEmpleado;
    }

    public String getNumGasto() {
        return numGasto;
    }

    public void setNumGasto(String numGasto) {
        this.numGasto = numGasto;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float totalGasto) {
        this.totalGasto = totalGasto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
    
    
    
    
    
    
    
}
