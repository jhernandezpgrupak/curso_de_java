package org.alberttcode.pooherencia;

public class Persona {
    //Atributos protected se pueden leer desde las clases hijas heredando
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(){
        System.out.println("Persona: Inicializando constructor...");
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String Saludar(){
        return "Hola que tal, ";
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                "Saludo=" + this.Saludar();//Dependiendo de la instancia, ejecutara el metodo que corresponde
    }
}
