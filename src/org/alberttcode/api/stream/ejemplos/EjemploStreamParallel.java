package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(new Usuario("Alberto", "Hernández"));
        usuarioList.add(new Usuario("Santiago", "Hernández"));
        usuarioList.add(new Usuario("Sergio", "Hernández"));
        usuarioList.add(new Usuario("Norberto", "Hernández"));
        usuarioList.add(new Usuario("Rigoberto", "Hernández"));
        long tiempo1 = System.currentTimeMillis();
        String resultado = usuarioList.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre del Thread: " + Thread.currentThread().getName() + " -> " +n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        if(nombre.contains("Rigoberto".toUpperCase())){
                            return Stream.of(nombre);
                        }else{
                            return Stream.empty();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                })
                .findAny().orElse("No se encontró");
        long tiempo2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (tiempo2 - tiempo1));
        System.out.println(resultado);
        //.forEach(System.out::println);
    }
}
