package org.alberttcode.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("La fecha completa: " + fechaCompleta);

        fechaCompleta = LocalDateTime.of(2023, Month.DECEMBER,12,5,45,6);
        System.out.println(fechaCompleta);

        //fechaCompleta = LocalDateTime.parse("2023-12-13T12:10:35");
        System.out.println("Fecha completa con parse " + fechaCompleta);

        String mes = fechaCompleta.getMonth().getDisplayName(TextStyle.FULL,new Locale("es","MX"));
        System.out.println("Mes: " + mes);

        String formatoFecha = fechaCompleta.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println("Formato de fecha " +formatoFecha);

        String formatoFecha2 = fechaCompleta.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
        System.out.println("Formaro de fecha 2 : " +formatoFecha2);
    }
}
