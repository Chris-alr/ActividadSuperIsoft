package com.chris.Isoft.Model;

public class Cajero  extends Usuario{

    private  String ventas;

    public Cajero(String nombre, String rut, String usuario, String contraseña,String ventas) {
        super(nombre, rut, usuario, contraseña);
        this.ventas = ventas;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }
}
