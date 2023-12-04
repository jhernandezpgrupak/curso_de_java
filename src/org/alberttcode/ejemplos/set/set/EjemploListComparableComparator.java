package org.alberttcode.ejemplos.set.set;

import org.alberttcode.ejemplos.set.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato",10));
        sa.add(new Alumno("Cata",7));
        sa.add(new Alumno("Pato",10));
        sa.add(new Alumno("Lucia",8));
        sa.add(new Alumno("Andres",6));
        //Collections.sort(sa,(a,b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a,b)-> a.getNota().compareTo(b.getNota()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        System.out.println("Iterando usando Strem forEach");
        sa.forEach(System.out::println);
    }
}
