package com.chris.Isoft.Model;

public class Producto {

    private String nombre;

    private String seccion;

    private int stock;

    private int precio;

    private String ubicacion;

    public Producto(String nombre, String seccion, int stock, int precio, String ubicacion) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.stock = stock;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
