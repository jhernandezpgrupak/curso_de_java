package org.alberttcode.app.jardin;

import org.alberttcode.app.hogar.ColorPelo;
import org.alberttcode.app.hogar.Persona; // Solo se guarda en memoria cuando instanciamos
//import static org.alberttcode.app.hogar.ColorPelo.CAFE;
import java.sql.SQLOutput;

import static org.alberttcode.app.hogar.Persona.saludar;
import static org.alberttcode.app.hogar.Persona.GENERO_MASCULINO;
public class EjemplosPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Albertt");
        persona.setApellido("Hdz");
        System.out.println(saludar());
        System.out.println(persona.getNombre() + " "+ persona.getApellido());
        System.out.println(ColorPelo.CAFE);//Realizar el toString
        System.out.println(GENERO_MASCULINO);

        Perro perro = new Perro();
        perro.nombre="Toby";
        perro.raza="Buldog";
        //Interaccion con el objeto perro que no puede acceder al hogar a jugar, solo puedo ir al jardin y jugar con el.
        String jugando = perro.Jugar(persona);//Solo la persona puede ir a jugar con el perro al (paquete) jardin
        System.out.println(jugando);
    }
}
