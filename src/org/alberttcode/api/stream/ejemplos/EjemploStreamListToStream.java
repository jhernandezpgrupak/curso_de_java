package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(new Usuario("Alberto", "Hernández"));
        usuarioList.add(new Usuario("Santiago", "Hernández"));
        usuarioList.add(new Usuario("Sergio", "Hernández"));
        usuarioList.add(new Usuario("Norberto", "Hernández"));
        usuarioList.add(new Usuario("Rigoberto", "Hernández"));

        Stream<String> nombres = usuarioList.stream().
                map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("Rigoberto".toUpperCase())){
                        return Stream.of(nombre);
                    }else{
                        return Stream.empty();
                    }
                })
                .peek(System.out::println);
        System.out.println(nombres.count());
                //.forEach(System.out::println);
    }
}
