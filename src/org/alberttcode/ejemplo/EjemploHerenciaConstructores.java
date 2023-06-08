package org.alberttcode.ejemplo;

import org.alberttcode.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo metodos del tipo Persona");
        System.out.println("Nombre: " + persona.getNombre()
                                        + " Apellido: " + persona.getApellido()
                                        + "Edad: " + persona.getEdad());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo metodos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo metodos del tipo Alumno Internacional");
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
            }
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo metodos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============== IMPLEMENTANDO EL METODO SALUDAR ==============");
        System.out.println(persona.Saludar());
        System.out.println("============== - ==============");
    }
}
