package com.sc.appfacturas.model;

import java.util.Arrays;
import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura[] items;
    private static Integer folio = 0;
    private String descripcion;
    private Date fecha;

    public Factura(Cliente cliente, ItemFactura[] items, String descripcion, Date fecha) {
        this.cliente = cliente;
        this.items = items;
        this.folio = ++folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Float calcularTotal() {
        Float total = 0.0f;
        for (ItemFactura item : this.items) {
            total += item.calcularImporte();
        }
        return total;
    }


    public void verDetalle() {
        final StringBuffer sb = new StringBuffer("Factura{\n");
        sb.append("\ncliente=").append(cliente);
        for (ItemFactura item : items) {
            sb.append(", \nitems=").append(items == null ? "null" : item.toString());
        }
        sb.append(", \ndescripcion='").append(descripcion).append('\'');
        sb.append(", \nfecha=").append(fecha);
        sb.append(", \nTotal Factura=").append(this.calcularTotal());
        sb.append('}');
        System.out.println(sb.toString());
    }
}
