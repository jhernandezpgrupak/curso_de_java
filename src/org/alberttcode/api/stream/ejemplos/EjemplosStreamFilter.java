package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("pepe"))
                .peek(System.out::println);
        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Jony","Bravo")).getNombre());
        //Expresion lambda
        //System.out.println(usuario.orElseGet(()->new Usuario("Beto","Hdz")).getNombre());
        //Lanzando excepcion
        //System.out.println(usuario.orElseThrow());
        if(usuario.isPresent()){
            System.out.println(usuario.get());
        }else{
            System.out.println("No se encontró el objeto");
        }



        //List<Usuario> usuarioList = nombres.toList();
        //usuarioList.forEach(System.out::println);

    }
}
