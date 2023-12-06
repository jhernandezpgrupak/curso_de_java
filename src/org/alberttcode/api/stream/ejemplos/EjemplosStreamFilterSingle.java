package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle {
    public static void main(String[] args) {
        Usuario usuario = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals("pepex"))
                .findFirst().get();
        System.out.println(usuario);
    }
}
