package org.alberttcode.optional.ejemplo;

import org.alberttcode.optional.ejemplo.models.Computador;
import org.alberttcode.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.alberttcode.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        //Instancia del servicio del tipo computador de la clase ComputadorRepositorio...
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("Inv").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));
        //Declaración de una variable de tipo Computador llamando el metodo filtrar
        //Optional<Computador> pc = repositorio.filtrar("Asus rog");
        /*if(pc.isPresent()){
            //Invocamos el metodo get del objeto y despues el metodo get del tipo computador
            System.out.println("Laptop :" + pc.get().getNombre());
        }else{
            System.out.println("No se encontró");
        }*/
    }
}
