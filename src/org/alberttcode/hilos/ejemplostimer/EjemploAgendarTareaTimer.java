package org.alberttcode.hilos.ejemplostimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {
        //Clase abstracta que implementa el runnable
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en " + new Date().toString() + " nombre del thread " +
                Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                timer.cancel();
            }
        },5000);
        System.out.println("Agendamos una tarea parta 5 segundos mas...");
    }
}
