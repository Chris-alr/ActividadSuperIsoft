package com.chris.Isoft.Model;

public class Merma {

    private String nombre;
    private String motivo;
    private int cantidad;


    public Merma(String nombre, String motivo, int cantidad) {
        this.nombre = nombre;
        this.motivo = motivo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
