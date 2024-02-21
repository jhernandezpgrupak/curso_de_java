package org.alberttcode.apiservlet.webapp.form;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*
        System.out.printf("Hello and welcome!");
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        a = scanner.nextInt();
        System.out.println("La variable de entrada es " +a);
        */
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        LocalDate fechaActual = LocalDate.now();
        fechaActual = LocalDate.of(2023,12,13);
        System.out.println("Fecha actual : " + fechaActual);
    }
}