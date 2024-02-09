package org.alberttcode.java.jdbc.repositorio;

import java.util.List;

public interface Repositorio<T> { //Generica
    List<T> listar();
    T porId(Long id);
    void guardar(T t);
    void eliminar(Long id);
}
