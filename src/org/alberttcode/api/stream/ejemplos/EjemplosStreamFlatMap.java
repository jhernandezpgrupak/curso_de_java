package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(usuario -> {
                    //El map devuelve un objeto y el flatmap devuelve un string de un objeto
                    if(usuario.getNombre().equals("Pedro")){
                        return  Stream.of(usuario);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);
        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());
    }
}
