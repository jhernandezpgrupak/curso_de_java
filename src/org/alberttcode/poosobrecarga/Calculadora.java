package org.alberttcode.poosobrecarga;

public class Calculadora {
    private Calculadora() {
    }

    //Para la sobrecarga de los argumentos deben de ser de diferente tipo (implementados de forma diferente)
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int sumar(int... argumentos){//N cantidad de parametros del tipo entero
        int total = 0;

        for(int i: argumentos){
            total+=i;
        }
        return total;
    }
    public static float sumar(float x, float y){
        return x + y;
    }
    public static float sumar(int i, float j){
        return i + j;
    }
    public static float sumar(float j, int i){
        return j + i;
    }
}
