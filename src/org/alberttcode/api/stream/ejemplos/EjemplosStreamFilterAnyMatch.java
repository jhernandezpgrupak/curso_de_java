package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(9));
        System.out.println(existe);
    }
}