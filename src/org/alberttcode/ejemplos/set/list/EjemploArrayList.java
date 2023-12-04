package org.alberttcode.ejemplos.set.list;

import org.alberttcode.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        al.add(new Alumno("Pato",10));
        al.add(new Alumno("Cata",7));
        al.add(new Alumno("Pato",2));
        al.add(2, new Alumno("Lucia",8));
        //El set reemplaza
        al.add(new Alumno("Andres",6));
        al.remove(new Alumno("Pato",10));
        System.out.println(al.size());
        System.out.println("Lista");
        System.out.println(al);
        boolean b = al.contains(new Alumno("pato",2));
        System.out.println("La lista contiene a Pato =  " + b);
        //Convertir la lista ArrayList a un arreglo
        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
