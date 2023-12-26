package org.alberttcode.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDurationDos {
    public static void main(String[] args) throws InterruptedException {
        Instant instant1 = Instant.now();
        TimeUnit.SECONDS.sleep(3);

        Instant instant2  = Instant.now();
        Duration tiempoTranscurrido = Duration.between(instant1, instant2);
        System.out.println("Tiempo: " + tiempoTranscurrido);
    }
}
