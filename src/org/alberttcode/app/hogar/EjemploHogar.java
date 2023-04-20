package org.alberttcode.app.hogar;

import org.alberttcode.app.jardin.Perro;
import static org.alberttcode.app.hogar.Persona.saludar;//Importar estaticamente

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
