/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

/**
 *
 * @author Angel Moya
 */
public class DistribuidoraClass {
    private String idDistribuidora;
    private String nombre;
    private String  direccion;
    private String correo;
    private String telefono;
    /*
    no la considero importante ya que a nuestro cliente no le interesan las sucursales
    y podria llegar a ser tedioso ingresar muchas sucursales para solo una distribuidora.
    */
    //private String sucursales;

    public DistribuidoraClass(String idDistribuidora, String nombre, String direccion, String correo, String telefono) {
        this.idDistribuidora = idDistribuidora;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    
    
    public DistribuidoraClass() {
        this(null, null, null, null, null);
    }

    public String getIdDistribuidora() {
        return idDistribuidora;
    }

    public void setIdDistribuidora(String idDistribuidora) {
        this.idDistribuidora = idDistribuidora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
