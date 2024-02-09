package org.alberttcode.java.jdbc;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.repositorio.CategoriaRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.Repositorio;
import org.alberttcode.java.jdbc.servicio.CatalogoServicio;
import org.alberttcode.java.jdbc.servicio.Servicio;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("::::::::::LISTAR");
        servicio.listar().forEach(System.out::println);

        Categoria categoria = new Categoria();
        categoria.setNombre("Infantil");

        Producto producto = new Producto();
        producto.setNombre("Triciclo mapache");
        producto.setPrecio(1800);
        producto.setFecha(new Date());
        producto.setSku("W3RT7-07");

        servicio.guardarProductoConCategoria(producto, categoria);

        System.out.println("::::::::::LISTAR");
        servicio.listar().forEach(System.out::println);
    }
}
