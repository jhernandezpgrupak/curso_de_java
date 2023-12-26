package org.alberttcode.anotaciones.ejemplo.models;

import org.alberttcode.anotaciones.ejemplo.Init;
import org.alberttcode.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {
    //Si existe y tiene valor el atributo nombre de la anotación
    @JsonAtributo(nombre = "descripcion")
    private String nombre;
    @JsonAtributo
    private Long precio;
    private LocalDate fecha;

    @Init
    private void init(){
        //Capitalizamos el nombre en un metodo con anotacion
        this.nombre = Arrays.stream(nombre.split(" "))
                .map(palabra -> palabra.substring(0,1).toUpperCase() +
                        palabra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
