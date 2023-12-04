package org.alberttcode.hilos.ejemplos;

import org.alberttcode.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) {
        NombreThread hilo = new NombreThread("Albertt Code");
        //Estado (NEW) ciclo de vida cuando se crea la instancia pero aun no se asignan recursos
        hilo.start();

        System.out.println(hilo.getState());
    }
}
