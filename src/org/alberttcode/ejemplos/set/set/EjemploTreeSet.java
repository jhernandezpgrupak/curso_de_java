package org.alberttcode.ejemplos.set.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        //En el parentesis pueden ir funciones normales o funciones lambda
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("ts = " + ts);
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);
    }
}
