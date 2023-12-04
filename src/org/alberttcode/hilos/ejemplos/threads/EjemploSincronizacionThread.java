package org.alberttcode.hilos.ejemplos.threads;

import org.alberttcode.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("Hola, ","Que tal!")).start();
        new Thread(new ImprimirFrases("Buenas tardes, ","Como estas?")).start();
        new Thread(new ImprimirFrases("Adios, ","¡Cuidate!")).start();
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
