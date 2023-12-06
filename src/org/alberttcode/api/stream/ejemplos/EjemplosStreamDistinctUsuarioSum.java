package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuarioSum {
    public static void main(String[] args) {
        IntStream largoNombres = Stream.of("Pedro Aguilar",
                        "Pilar Bustamante",
                        "Paola Durango",
                        "Ponciano Carrillo",
                        "Pilar Bustamante")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .mapToInt(e -> e.getNombre().length())
                .peek(System.out::println);
        //Solo se puede tener un operador final, el flujo se cierra con el operador final el
        // IntSummaryStatistics operador final que engloba funcionalidades.
        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics summaryStatistics = largoNombres.summaryStatistics();
        System.out.println("Suma de longitudes: " +  summaryStatistics.getSum());
        System.out.println("Máximo de longitudes " + summaryStatistics.getMax());
        System.out.println("Mínimo de longitudes " + summaryStatistics.getMin());
        System.out.println("Promedio de las longitudes " + summaryStatistics.getAverage());
    }
}
