package org.alberttcode.optional.ejemplo.models.repositorio;

import org.alberttcode.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);
}
