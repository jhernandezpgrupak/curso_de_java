package org.alberttcode.optional.ejemplo;

import org.alberttcode.optional.ejemplo.models.Computador;
import org.alberttcode.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.alberttcode.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {
        //Instancia del servicio del tipo computador de la clase ComputadorRepositorio...
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        //Si no se encuentra devuelve un objeto por defecto
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        //El optional soporta el filter y el map para modificar el valor
        String extension = Optional.of(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);
    }
}
