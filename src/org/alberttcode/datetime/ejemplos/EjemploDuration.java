package org.alberttcode.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EjemploDuration {
    public static void main(String[] args) {
        LocalDateTime   fechaUno = LocalDateTime.now();
        LocalDateTime   fechaDos = LocalDateTime.now().plusHours(6).plusMinutes(20).plusDays(3);

        Duration lapsus = Duration.between(fechaUno,fechaDos);
        System.out.println("Hora transcurrida: "+lapsus);
        System.out.println(lapsus.toDays());
        System.out.println("lapsus.plusHours(6) = " + lapsus.plusHours(6));


    }
}
