package com.sc.appfacturas.model;

public class Producto {

    Integer codigo;
    String nombre;
    Float precio;

    public Producto(Integer codigo, String nombre, Float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
            "codigo=" + codigo +
            ", nombre='" + nombre + '\'' +
            ", precio=" + precio +
            '}';
    }
}
