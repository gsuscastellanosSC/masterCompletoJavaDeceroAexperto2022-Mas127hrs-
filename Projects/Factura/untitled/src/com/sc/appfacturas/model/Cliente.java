package com.sc.appfacturas.model;

public class Cliente {

    String nombre;
    String nif;

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", nif='" + nif + '\'' +
            '}';
    }
}
