package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterEmpty {
    public static void main(String[] args) {
        long count = Stream.of("","Pedro Aguilar","Pilar Bustamante","","Ponsiano Carrillo","Paola Durango")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);
    }
}
