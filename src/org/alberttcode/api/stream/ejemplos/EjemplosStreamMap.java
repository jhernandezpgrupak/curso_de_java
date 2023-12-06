package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                //.peek(System.out::println)
                .peek(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                });
        //Convertimos en lista
        List<Usuario> usuarioList = nombres.toList();
        usuarioList.forEach(System.out::println);
                //.peek(e -> System.out.println("e = " + e))
                //.map(String::toUpperCase);
        //List<String> lista = nombres.toList();
        //System.out.println("lista = " + lista);
        //nombres.forEach(System.out::println);
    }
}
