package org.alberttcode.ejemplo;

import org.alberttcode.pooherencia.*;

import javax.sound.midi.Soundbank;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("============== Creando la instancia de objeto Alumno");
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setMatricula("34TOPL");
        System.out.println("============== Creando la instancia de objeto Alumno Internacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Pedro");
        alumnoInternacional.setApellido("Paramo");
        alumnoInternacional.setMatricula("8923DEAA");
        alumnoInternacional.setPais("Mexico");
        alumnoInternacional.setInstitucion("Harvard");
        System.out.println("============== Creando la instancia de objeto Profesor");
        Profesor profesor = new Profesor();
        profesor.setNombre("Rigoberto");
        profesor.setApellido("Palacios");
        profesor.setAsignatura("Castellano");
        System.out.println("============== - ==============");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(alumnoInternacional.getNombre() + " " + alumnoInternacional.getApellido()+" " + alumnoInternacional.getMatricula());
        System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());
        //Tipo de dato que muestra toda la gerarquia de clases
        Class claseAlumnoInt = alumnoInternacional.getClass();

        while (claseAlumnoInt.getSuperclass()!=null){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre "+padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }
    }
}
