package org.alberttcode.api.stream.ejemplos.models;

public class Factura {
    private int id;
    private String descripcion;

    private Usuario usuario;
    public int getId() {
        return id;
    }

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
