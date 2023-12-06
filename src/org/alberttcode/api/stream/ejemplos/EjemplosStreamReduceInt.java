package org.alberttcode.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemplosStreamReduceInt {
    public static void main(String[] args) {
        Stream<Integer> nombres = Stream.of(10,20,30,40,50);
        int result = nombres.reduce(0,Integer::sum);
        System.out.println(result);
    }
}
