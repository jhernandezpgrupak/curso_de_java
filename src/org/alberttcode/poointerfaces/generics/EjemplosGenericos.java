package org.alberttcode.poointerfaces.generics;

import org.alberttcode.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres","Guzmán"));
        Cliente andres = clientes.get(0);
        Cliente[] clientesArreglo =
        {
            new Cliente("Alberto","Hernández"),
            new Cliente("Sofia","Carrillo")
        };

        Integer[] enterosArreglo = {1,2,3,4,5};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "John"}
        ,enterosArreglo);

        nombres.forEach(System.out::println);
    }
    //Metodos genericos, El proposito es hacer metodos mucho mas reutilizables... que se apliquen
    //a cualquier tipo de dato.
    public static <T> List<T> fromArrayToList(T[] c){//Metodo generico
        return Arrays.asList(c);
    }
    public static <T,G> List<T> fromArrayToList(T[] c, G[] g){//Metodo generico
        for (G elemento: g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
