package org.alberttcode.pooherencia;

import javax.swing.*;

public class Profesor extends Persona{
    private String asignatura;
    public Profesor(){
        System.out.println("Profesor: Inicializando constructor...");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura = asignatura;
    }
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String Saludar(){
        return "buenos dias soy el profesor " + getNombre() + "he imparto la asignatura " + getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura;
    }
}
