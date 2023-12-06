package org.alberttcode.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamRange {
    public static void main(String[] args) {
        IntStream numeros = IntStream.range(5,20).peek(System.out::println);
        //int result = nombres.reduce(0,Integer::sum);
        //int result = numeros.sum();
        IntSummaryStatistics summaryStatistics = numeros.summaryStatistics();
        System.out.println("Valor maximo: " + summaryStatistics.getMax());
        System.out.println("Valor minimo: " + summaryStatistics.getMin());
        System.out.println("Suma: " + summaryStatistics.getSum());
        System.out.println("Promedio: " + summaryStatistics.getAverage());
        System.out.println("Total de valores: " + summaryStatistics.getCount());
    }
}
