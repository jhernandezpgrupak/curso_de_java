package org.alberttcode.hilos.ejemplostimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {
        //Clase abstracta que implementa el runnable
        //Sonido de alerta cada que se ejecuta una tarea
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //private int contador = 3;
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if (i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periódica en " + new Date().toString() + " nombre del thread " +
                            Thread.currentThread().getName());
                    //contador --;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        },0,10000);
        System.out.println("Agendamos una tarea inmediata que se repita cada 10 segundos...");
    }
}
