package org.alberttcode.java.jdbc;

import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.alberttcode.java.jdbc.repositorio.Repositorio;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

        try(Connection connection = ConexionBaseDeDatos.getInstance()) {
            //Generar la instancia del repositorio
            Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
            Producto producto = new Producto();
            producto.setId(3);
            producto.setNombre("Xbox Series X");
            producto.setPrecio(9000);
            producto.setFecha(new Date());

            System.out.println("::::::::::LISTAR");
            repositorio.listar().forEach(System.out::println);

            //System.out.println("::::::::::BUSCAR POR ID");
            //System.out.println(repositorio.porId(2L));

            System.out.println("::::::::::ACTUALIZAR PRODUCTO");
            repositorio.guardar(producto);

            System.out.println("::::::::::LISTANDO PRODUCTOS ACTUALIZADOS");
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
