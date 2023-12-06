package org.alberttcode.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemplosStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pedro Aguilar","Pilar Bustamante","Ponsiano Carrillo","Paola Durango",
                        "Paola Durango","Pedro Aguilar")
                .distinct();
                String result = nombres.reduce("Resultado concatenación: ",(a,b) -> a + ", " + b);
        System.out.println(result);
    }
}
