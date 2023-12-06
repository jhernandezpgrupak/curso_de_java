package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinct {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango",
                        "Paola Durango","Pedro Aguilar")
                .distinct();
                nombres.forEach(System.out::println);
    }
}
