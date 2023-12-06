package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuario {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pedro Aguilar",
                        "Pilar Bustamante",
                        "Paola Durango",
                        "Ponciano Carrillo",
                        "Pilar Bustamante")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
        nombres.forEach(System.out::println);
    }
}
