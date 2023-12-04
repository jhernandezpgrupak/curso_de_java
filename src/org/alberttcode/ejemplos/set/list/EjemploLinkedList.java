package org.alberttcode.ejemplos.set.list;

import org.alberttcode.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> al = new LinkedList<>();
        al.addFirst(new Alumno("Zeus",3));
        al.add(new Alumno("Pato",10));
        al.add(new Alumno("Cata",7));
        al.add(new Alumno("Pato",2));
        al.add(new Alumno("Lucia",8));
        //El set reemplaza
        al.add(new Alumno("Andres",6));
        al.remove(new Alumno("Pato",10));
        System.out.println(al.size());
        System.out.println("Lista");
        System.out.println(al);
        boolean b = al.contains(new Alumno("pato",2));
        System.out.println("Primer de la lista " +al.getFirst());
        System.out.println("Ultimo de la lista " +al.getLast());
        System.out.println("Indice 4 = "+ al.get(4));
        al.pollFirst();
        System.out.println(al);

        ListIterator<Alumno> li = al.listIterator();
        while (li.hasNext()){
            Alumno a = li.next();
            System.out.println(a);
        }
        System.out.println("============== Previus ===================");
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
