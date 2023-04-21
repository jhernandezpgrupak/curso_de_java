package org.alberttcode.poosobrecarga;
import static org.alberttcode.poosobrecarga.Calculadora.sumar;
public class EjemploSobrecarga {
    public static void main(String[] args) {
        System.out.println("Sumar enteros " + sumar(10,5,8,9,10,6));
        System.out.println("Sumar flotantes " + sumar(10.0f,5.5f ));
        System.out.println("Sumar int-float " + sumar(10,5.5f));
        System.out.println("Sumar float-int " + sumar(10.8f,5));
        System.out.println("Sumar long " + sumar(10L,5L));
        System.out.println("Sumar caracter " +sumar(10, 'a'));//Toma el unicode del caracter
    }
}
