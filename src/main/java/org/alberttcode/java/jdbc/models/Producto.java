package org.alberttcode.java.jdbc.models;

import java.util.Date;

public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private Date fecha;
    private Categoria categoria;
    public Producto() {
    }

    public Producto(int id, String nombre, int precio, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return
                id +
                "|" +
                nombre +
                "|" +
                categoria.getNombre() +
                "|" +
                precio +
                "|" +
                fecha;
    }
}
