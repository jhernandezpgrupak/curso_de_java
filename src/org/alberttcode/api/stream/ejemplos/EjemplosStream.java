package org.alberttcode.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemplosStream {
    public static void main(String[] args) {
        //Stream<String> nombres = Stream.of("Pedro","Pilar","Ponsiano","Paola");
        //Usando metodos de referecia
        //nombres.forEach(System.out::println);
        //String[] arr = {"Pedro","Pilar","Ponciano","Paola"};
        //Stream<String> nombres = Arrays.stream(arr);
        //nombres.forEach(System.out::println);
        //Construyendo el stream
        /*Stream<String> nombres = Stream.<String>builder().add("Pedro")
                .add("Pilar")
                .add("Ponciano")
                .add("Paola")
                .build();*/
        //nombres.forEach(System.out::println);
        //nombres.forEach(v -> {
        //    System.out.println(v);
        //});
        List<String> lista = new ArrayList<>();
        lista.add("Paola");
        lista.add("Ponciano");
        lista.add("Pedro");
        lista.add("Pilar");
        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
