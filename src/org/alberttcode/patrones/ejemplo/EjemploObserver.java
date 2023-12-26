package org.alberttcode.patrones.ejemplo;

import org.alberttcode.patrones.observer.Corporation;

public class EjemploObserver {
    public static void main(String[] args) {
        //Crear instancia de coorporacion del tipo observable
        Corporation google = new Corporation("Google Inc", 1000);
        //El observador es una implementacion del observador
        google.addObserver(observable -> {
            System.out.println("John: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Robert: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Ely: " + observable);
        });

        google.modificaPrecio(2000);
    }
}
