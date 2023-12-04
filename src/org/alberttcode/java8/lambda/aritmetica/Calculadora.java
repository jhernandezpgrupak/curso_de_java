package org.alberttcode.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);
    }
    //No soporta sobrecarga de metodos con expresiones lambda
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
}

