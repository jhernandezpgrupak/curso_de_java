package org.alberttcode.ejemplo;

import org.alberttcode.pooherencia.Alumno;
import org.alberttcode.pooherencia.AlumnoInternacional;
import org.alberttcode.pooherencia.Persona;
import org.alberttcode.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("============== Creando la instancia de objeto Alumno");
        Alumno alumno = new Alumno("Andres", "Hernández",28,"Politectico");
        alumno.setEmail("al221210281@gmail.com");

        System.out.println("============== Creando la instancia de objeto Alumno Internacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Pedro","Paramo","Mexico");
        alumnoInternacional.setInstitucion("Harvard");

        System.out.println("============== Creando la instancia de objeto Profesor");
        Profesor profesor = new Profesor("Rigoberto","Palacios","Castellano");
        System.out.println("============== - ==============");

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);
    }
    public static void imprimir(Persona persona){
        System.out.println(persona);
        System.out.println("============== - ==============");
    }
}
