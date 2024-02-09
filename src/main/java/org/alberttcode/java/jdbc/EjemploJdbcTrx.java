package org.alberttcode.java.jdbc;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.Repositorio;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTrx {
    public static void main(String[] args) throws SQLException {

        try(Connection connection = ConexionBaseDeDatos.getInstance()) {
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try {
                System.out.println("::::::::::GUARDAR");
                Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
                Producto producto = new Producto();
                producto.setNombre("Play Station 5 pro");
                producto.setPrecio(14000);
                producto.setFecha(new Date());
                producto.setSku("7K4");
                Categoria categoria = new Categoria();
                categoria.setId(1);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("::::::::::EDITAR");
                producto.setId(3);
                producto.setNombre("Producto Actualizado");
                producto.setPrecio(12000);
                producto.setFecha(new Date());
                producto.setSku("EFGH12345");
                categoria.setId(2);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("::::::::::LISTAR");
                repositorio.listar().forEach(System.out::println);
                connection.commit();
            } catch (SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
}
