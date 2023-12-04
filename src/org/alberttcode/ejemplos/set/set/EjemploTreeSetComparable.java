package org.alberttcode.ejemplos.set.set;

import org.alberttcode.ejemplos.set.modelo.Alumno;
import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Reglas del treeSet, todos los elementos que se agreguen tienen que ser objetos
        //que implementen la interfaz comparable, tienen que ser ordenados,
        //la clase alumno no implemeta esta interfaz
        //Set<Alumno> sa = new TreeSet<>((a,b)-> a.getNota().compareTo(b.getNota()));
        //List<Alumno> sa = new ArrayList<>();
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato",10));
        sa.add(new Alumno("Cata",7));
        sa.add(new Alumno("Pato",10));
        sa.add(new Alumno("Lucia",8));
        sa.add(new Alumno("Andres",6));

        //System.out.println("Utilizando un for clasico");
        //for(int i = 0; i<sa.size(); i++){
        //    Alumno a = sa.get(i);
        //    System.out.println(a.getNombre());
        //}

        System.out.println("Iterando usando un foreach");
        for(Alumno a: sa){
            System.out.println(a);
        }
        System.out.println("Iterando usando un while");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }
        System.out.println("Iterando usando Strem forEach");
        //soutc
        sa.forEach(System.out::println);
    }
}
