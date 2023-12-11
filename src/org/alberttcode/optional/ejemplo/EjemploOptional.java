package org.alberttcode.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Andres";
        Optional<String> optional = Optional.of(nombre);
        System.out.println("optional = " + optional);
        optional.ifPresent(v -> System.out.println( v.toUpperCase() ));

        nombre = null;
        optional = Optional.ofNullable(nombre);
        System.out.println("optional = " + optional);
        System.out.println(optional.isPresent());
        optional.ifPresentOrElse(v -> System.out.println( v.toUpperCase() ),
                () -> {
                    System.out.println("No esta presente");
        });

        Optional<String> opt = Optional.empty();
        System.out.println(opt.isPresent());
    }
}
