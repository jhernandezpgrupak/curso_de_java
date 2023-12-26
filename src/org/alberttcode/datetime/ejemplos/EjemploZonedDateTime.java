package org.alberttcode.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaLocal = LocalDateTime.parse("2012-12-12T12:00:00");

        ZoneId London = ZoneId.of("Europe/London");
        //ZonedDateTime zonedDateTimeLondon = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonedDateTimeLondon = fechaLocal.atZone(London);
        System.out.println("Zona horaria de Londres: " + zonedDateTimeLondon);

        ZoneId New_York = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTimeNewYork = ZonedDateTime.of(fechaLocal,New_York);
        System.out.println("Zona horaria de Nueva York: " + zonedDateTimeNewYork);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HHmm,dd, MMM, yyyy");
        System.out.println("Fecha y tiempo: " + dateTimeFormatter);
        //Zonas disponibles
        //Set<String> zonas = ZoneId.getAvailableZoneIds();
        //zonas.forEach(System.out::println);
    }
}
