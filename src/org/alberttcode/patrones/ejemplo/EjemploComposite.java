package org.alberttcode.patrones.ejemplo;

import org.alberttcode.patrones.composite.Archivo;
import org.alberttcode.patrones.composite.Directorio;

import java.security.spec.RSAOtherPrimeInfo;

public class EjemploComposite {
    public static void main(String[] args) {
        Directorio wordD = new Directorio("Documentos");
        Directorio javaD = new Directorio("Java");

        javaD.addComponente(new Archivo("patron-composite.docx"));
        Directorio streD = new Directorio("Api Stream");
        streD.addComponente(new Archivo("Stream-map-docx"));

        //Directorio oracD = new Directorio("Oracle");
        javaD.addComponente(streD);

        wordD.addComponente(javaD);
        wordD.addComponente(new Archivo("cv.docx"));
        wordD.addComponente(new Archivo("logo.jpeg"));

        System.out.println(wordD.mostrar(0));
    }
}
