package org.alberttcode.datetime.ejemplos;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000,9,11);
        LocalDate fecha2 = LocalDate.now();
        //Modificar fechas...
        fecha2 = fecha2.withMonth(1);


        Period period = Period.between(fecha1,fecha2);
        System.out.println(period);
        System.out.printf("Periodo entre las fechas %s y %s hay %d años, %d meses y %d dias", fecha1, fecha2,
                period.getYears(),period.getMonths(),period.getDays());

    }
}
