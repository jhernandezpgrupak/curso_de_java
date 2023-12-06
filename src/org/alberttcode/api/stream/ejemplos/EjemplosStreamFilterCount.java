package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterCount {
    public static void main(String[] args) {
        long count = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .count();
        System.out.println(count);
    }
}