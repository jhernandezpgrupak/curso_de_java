package org.alberttcode.java.jdbc.servicio;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.repositorio.CategoriaRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.Repositorio;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Servicio{
    private Repositorio<Producto> productoRepositorio;
    private Repositorio<Categoria> categoriaRepositorio;

    public CatalogoServicio() {
        this.productoRepositorio = new ProductoRepositorioImplements();
        this.categoriaRepositorio = new CategoriaRepositorioImplements();
    }

    @Override
    public List<Producto> listar() throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
           productoRepositorio.setConnection(connection);
           return productoRepositorio.listar();
        }
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            productoRepositorio.setConnection(connection);
            return productoRepositorio.porId(id);
        }
    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            productoRepositorio.setConnection(connection);
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            Producto newProducto = null;
            try{
                newProducto = productoRepositorio.guardar(producto);
                connection.commit();
            }catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
            return newProducto;
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            productoRepositorio.setConnection(connection);
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try{
                productoRepositorio.eliminar(id);
                connection.commit();
            }catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            categoriaRepositorio.setConnection(connection);
            return categoriaRepositorio.listar();
        }
    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            categoriaRepositorio.setConnection(connection);
            return categoriaRepositorio.porId(id);
        }
    }

    @Override
    public Categoria guardar(Categoria categoria) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            categoriaRepositorio.setConnection(connection);
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            Categoria newCategoria = null;
            try{
                newCategoria = categoriaRepositorio.guardar(categoria);
                connection.commit();
            }catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
            return newCategoria;
        }
    }
    @Override
    public void EliminarCategoria(Long id) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            categoriaRepositorio.setConnection(connection);
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try{
                categoriaRepositorio.eliminar(id);
                connection.commit();
            }catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
        try(Connection connection = ConexionBaseDeDatos.getConnection()){
            productoRepositorio.setConnection(connection);
            categoriaRepositorio.setConnection(connection);
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try{
                Categoria newCategoria = categoriaRepositorio.guardar(categoria);
                producto.setCategoria(newCategoria);
                productoRepositorio.guardar(producto);
                connection.commit();
            }catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
}
