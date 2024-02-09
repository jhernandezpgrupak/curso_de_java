package org.alberttcode.java.jdbc;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.Repositorio;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        try(Connection connection = ConexionBaseDeDatos.getInstance()) {
            //Generar la instancia del repositorio
            Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
            Producto producto = new Producto();
            producto.setNombre("Play Station 5 pro");
            producto.setPrecio(14000);
            producto.setFecha(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(1);
            producto.setCategoria(categoria);

            System.out.println("::::::::::LISTAR");
            repositorio.listar().forEach(System.out::println);

            //System.out.println("::::::::::BUSCAR POR ID");
            //System.out.println(repositorio.porId(2L));

            //System.out.println("::::::::::GUARDAR PRODUCTO");
            //repositorio.guardar(producto);

            System.out.println("::::::::::ACTUALIZACION DEL ID 6");
            producto.setId(6);
            producto.setNombre("Refrigerador Mabe");
            producto.setPrecio(18000);
            producto.setFecha(new Date());
            repositorio.guardar(producto);
            categoria.setId(1);
            System.out.println("::::::::::LISTANDO NUEVOS PRODUCTOS");
            repositorio.listar().forEach(System.out::println);

            //System.out.println("::::::::::ELIMINAR PRODUCTO");
            //repositorio.eliminar(1L);

            //System.out.println("::::::::::LISTANDO NUEVOS PRODUCTOS");
            //repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
