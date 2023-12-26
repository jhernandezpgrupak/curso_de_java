package org.alberttcode.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());

        LocalTime doceMedioDia  = LocalTime.of(12,0);
        System.out.println(doceMedioDia);

        LocalTime diesMedia = LocalTime.of(10,30).plus(1, ChronoUnit.HOURS);
        System.out.println("Dies y media mas una hora: " + diesMedia);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String horaFormtateada = diesMedia.format(df);
        System.out.println(horaFormtateada);

        LocalTime max = LocalTime.MAX;
        System.out.println("max = " + max);
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);


    }
}
