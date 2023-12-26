package org.alberttcode.patrones.observer;

public class Corporation  extends Observable{
    private String nombre;
    private int precio;

    public Corporation(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    public void modificaPrecio(int precio){
        //Notificamos cada que se modifica el precio
        this.precio = precio;
        notifyObserver();
    }

    @Override
    public String toString() {
        return getNombre()
                + " Nuevo precio "+
                getPrecio();
    }
}
