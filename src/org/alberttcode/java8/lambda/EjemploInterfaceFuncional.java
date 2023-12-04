package org.alberttcode.java8.lambda;

import org.alberttcode.java8.lambda.aritmetica.Aritmetica;
import org.alberttcode.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.computar(10,5, suma));
        System.out.println("Por defecto " + calculadora.computarConBiFunction(10,9,(a,b)->a+b));
    }
}
