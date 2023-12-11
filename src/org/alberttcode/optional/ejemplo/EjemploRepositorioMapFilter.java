package org.alberttcode.optional.ejemplo;

import org.alberttcode.optional.ejemplo.models.Computador;
import org.alberttcode.optional.ejemplo.models.Fabricante;
import org.alberttcode.optional.ejemplo.models.Procesador;
import org.alberttcode.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.alberttcode.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        //Instancia del servicio del tipo computador de la clase ComputadorRepositorio...
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        String f = repositorio.filtrar("rog")
                //Map si devuelve un objeto
                //Flat map si devuelve un optional
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                //Solo buscar el fabricante Intel
                .filter(fabricante -> "Intel".equalsIgnoreCase(fabricante.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("No se encontró");
        System.out.println(f);
    }
}
