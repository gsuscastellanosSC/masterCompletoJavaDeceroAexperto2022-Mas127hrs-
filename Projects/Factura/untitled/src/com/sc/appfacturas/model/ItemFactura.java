package com.sc.appfacturas.model;

public class ItemFactura {

    Producto producto;
    Integer cantidad;


    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float calcularImporte() {

        return producto.getPrecio() * this.cantidad;
    }


    @Override
    public String toString() {
        return "ItemFactura{" +
            "producto=" + producto.toString() +
            ", cantidad=" + cantidad +
            '}';
    }
}
