package org.alberttcode.hilos.ejemplos.threads;

import org.alberttcode.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {
        //Expresiones lambda
        Runnable viaje = () ->{
            for (int i = 0; i<=10; i++){
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep( (long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente viajaré a " + Thread.currentThread().getName());
        };

        new Thread(viaje,"Isla mujeres").start();
        new Thread(viaje,"Suecia").start();
        new Thread(viaje,"Inglaterra").start();
        new Thread(viaje,"Canada").start();

        System.out.println("Continuando con la execucion del metodo main");

    }
}
