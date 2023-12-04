package org.alberttcode.hilos.ejemplos.threads;

import org.alberttcode.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla mujeres")).start();
        new Thread(new ViajeTarea("Suecia")).start();
        new Thread(new ViajeTarea("Inglaterra")).start();
        new Thread(new ViajeTarea("Canada")).start();
    }
}
