package org.alberttcode.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class EjemploFunction {
    public static void main(String[] args) {
        //Recibe argumentos, devuelve un valor
        Function<String, String> f1 = param -> "Hola que tal!" +param;
        String resultado = f1.apply("Roberto");
        System.out.println(resultado);

        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("José Alberto"));
        //Recibe dos parametros, y retorna un resultado
        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(" "+b.toUpperCase());
        String r = f3.apply("Hernández","Peña");
        System.out.println(r);

        BiFunction<String,String, Integer> f4 = String::compareTo;//(a,b) -> a.compareTo(b);
        System.out.println(f4.apply("beto","betos"));

        BiFunction<String,String, String> f5 = String::concat;//(a,b) -> a.compareTo(b);
        System.out.println(f5.apply("beto","b3tos"));

        
    }
}
