package org.alberttcode.optional.ejemplo;

import org.alberttcode.optional.ejemplo.models.Computador;
import org.alberttcode.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.alberttcode.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        //Instancia del servicio del tipo computador de la clase ComputadorRepositorio...
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        //Si no se encuentra devuelve un objeto por defecto
        //Computador defecto = new Computador("DELL XP ", "8900");
        //Computador pc = repositorio.filtrar("Inv").orElse(valorPorDefecto());
        //System.out.println(pc);
        //Se pasa una expresion lambda que retorna un objeto tipo supplier
        Computador pc  =repositorio.filtrar("Macbook").orElseGet(() -> valorPorDefecto());
    }

    public static Computador valorPorDefecto(){
        System.out.println("Obteniendo el valor por defecto");
        return new Computador("HP Omen", "LA000799");
    }
}
