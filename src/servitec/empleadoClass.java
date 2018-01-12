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
public class empleadoClass {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String telefono;
    private String cargo;
    private float salarioMensual;
    private String User;
    private String contraseña;
    private String idSupervisor;

    public empleadoClass(String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String cargo, float salarioMensual, String User, String contraseña, String idSupervisor) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.salarioMensual = salarioMensual;
        this.User = User;
        this.contraseña = contraseña;
        this.idSupervisor = idSupervisor;
        
    }
   
    public empleadoClass(){
        this.cedula = null;
        this.nombre = null;
        this.apellido = null;
        this.correo = null;
        this.direccion = null;
        this.telefono = null;
        this.cargo = null;
        this.salarioMensual = 0;
        this.User = null;
        this.contraseña = null;
        this.idSupervisor = null;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    @Override
    public String toString() {
        return "empleadoClas{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", salarioMensual=" + salarioMensual + ", User=" + User + ", contrase\u00f1a=" + contraseña + ", idSupervisor=" + idSupervisor + '}';
    }
    
    
    
 
}
