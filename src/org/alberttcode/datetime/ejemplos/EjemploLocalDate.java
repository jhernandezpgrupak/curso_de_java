package org.alberttcode.datetime.ejemplos;

import javax.crypto.spec.PSource;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.SortedMap;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual : " + fechaActual);

        fechaActual = LocalDate.of(2023,12,13);
        System.out.println("Fecha actual : " + fechaActual);

        //Obtener el dia de la semana
        System.out.println("Dia de la semana " + fechaActual.getDayOfWeek());

        fechaActual = LocalDate.of(2023, Month.DECEMBER,11);
        System.out.println("Fecha actual : " + fechaActual);

        fechaActual = LocalDate.parse("2023-12-11");
        System.out.println("Fecha actual : " + fechaActual);

        LocalDate mananaPasado = LocalDate.now().plusDays(2);
        System.out.println("Pasado mañana: " + mananaPasado);

        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println("Día de ayer: " + ayer);

        LocalDate mesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("El mes pasado: " + mesAnterior);

        Month mes = fechaActual.getMonth();
        System.out.println("Mes en español: " + mes.getDisplayName(TextStyle.FULL,new Locale("es","MX")));

        DayOfWeek diaSemana = LocalDate.parse("2023-12-11").getDayOfWeek();
        System.out.println("diaSemana = " + diaSemana);

        //Saber si es un año biciesto
        boolean esBiciesto = LocalDate.now().isLeapYear();
        System.out.println(esBiciesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2023-12-12"));
        System.out.println("esAntes = " + esAntes);
    }
}
