package org.alberttcode.pooexcepciones.Ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String valor1 = JOptionPane.showInputDialog("Ingrese un numero 1");
        String valor2 = JOptionPane.showInputDialog("Ingrese un numero 2");
        try {
            cal.dividir(valor1, valor2);
        }
        catch (DivisionPorZeroException e){
            System.out.println("Capturar el mensaje en punto de ejecucion = " + e.getMessage());
            main(args);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto una excepción: Ingrese un número valido" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre...");
        }
        System.out.println("Continuamos con la ejecución del programa...");
    }
}
