package org.alberttcode.poointerfaces.imprenta;

import org.alberttcode.poointerfaces.imprenta.modelo.*;
import static org.alberttcode.poointerfaces.imprenta.modelo.Genero.PROGRAMACION;
import static org.alberttcode.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John","Doe"),"Ingeniero de sistemas","Resumen laboral...");
        cv.addExperiencias("Java")
                .addExperiencias("Spring Framework")
                .addExperiencias("Angular");


        Libro libro = new Libro(new Persona("Erich","Gama"),"Patron de diseños",PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Composite"));
        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James","Freyzer"),"Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);//No extiende de la clase hoja

        imprimir(new Imprimible() {//Clase anonima que implementa la interfaz imprimible

        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

    /*public static void imprimir(Imprimible imprimible){//Metodo para imprimir // control de tipo
        System.out.println(imprimible.imprimir());
    }*/
}
