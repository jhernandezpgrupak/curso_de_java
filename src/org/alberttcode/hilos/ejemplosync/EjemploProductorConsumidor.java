package org.alberttcode.hilos.ejemplosync;

import org.alberttcode.hilos.ejemplos.runnable.Consumidor;
import org.alberttcode.hilos.ejemplos.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
