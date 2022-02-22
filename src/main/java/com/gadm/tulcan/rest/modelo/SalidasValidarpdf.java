
package com.gadm.tulcan.rest.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public  class SalidasValidarpdf {
    private static String Cedula;
    private static String Nombre;
    private static String Institucion;
    private static String Cargo;
    private static String Valido_Desde;
    private static String Valido_Hasta;
    private static String Fecha_Firmado;
    public  SalidasValidarpdf(){
    
    }

  
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getValido_Desde() {
        return Valido_Desde;
    }

    public void setValido_Desde(String Valido_Desde) {
        this.Valido_Desde = Valido_Desde;
    }

    public String getValido_Hasta() {
        return Valido_Hasta;
    }

    public void setValido_Hasta(String Valido_Hasta) {
        this.Valido_Hasta = Valido_Hasta;
    }

    public String getFecha_Firmado() {
        return Fecha_Firmado;
    }

    public void setFecha_Firmado(String Fecha_Firmado) {
        this.Fecha_Firmado = Fecha_Firmado;
    }

    
    
}
