package com.chris.Isoft.Model;

public class Reponedor extends Usuario{

    private String seccion;


    public Reponedor(String nombre, String rut, String usuario, String contraseña) {
        super(nombre, rut, usuario, contraseña);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
