package org.alberttcode.java.jdbc.servicio;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;

import java.sql.SQLException;
import java.util.List;

public interface Servicio {
    List<Producto> listar() throws SQLException;
    Producto porId(Long id) throws SQLException;
    Producto guardar(Producto producto) throws SQLException;
    void eliminar(Long id) throws SQLException;

    //Categoría

    List<Categoria> listarCategoria() throws SQLException;
    Categoria porIdCategoria(Long id) throws SQLException;
    Categoria guardar(Categoria categoria) throws SQLException;
    void EliminarCategoria(Long id) throws SQLException;
    void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;
}
