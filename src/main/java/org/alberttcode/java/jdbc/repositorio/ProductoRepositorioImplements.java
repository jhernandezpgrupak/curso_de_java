package org.alberttcode.java.jdbc.repositorio;

import org.alberttcode.java.jdbc.models.Categoria;
import org.alberttcode.java.jdbc.models.Producto;
import org.alberttcode.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImplements implements Repositorio<Producto>{
    //Metodo privado para obtener la conexion de base de datos
    private Connection getConnection() throws SQLException {
        return ConexionBaseDeDatos.getInstance();
    }
    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try(Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT p.id,p.nombre,p.sku,c.nombre AS categoria,fk_categoria_id, precio,p.fecha_registro FROM productos AS p INNER JOIN categorias AS c ON p.fk_categoria_id = c.id")){
            //Por cada registro de la base de datos creamos un objeto de producto y lo guardamos a la lista productos
            while (resultSet.next()){
                Producto producto = extracted(resultSet);
                productos.add(producto);
            }

        }
        return productos;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        Producto producto = null;
        //Solo se pueden definir objetos del tipo recurso en el try (recursos)
        try(PreparedStatement preparedStatement = getConnection().prepareStatement("SELECT " +
                                                                                        "p.nombre," +
                                                                                        "p.sku"+
                                                                                        "c.nombre AS categoria," +
                                                                                        "precio," +
                                                                                        "p.fecha_registro" +
                                                                                            "FROM " +
                                                                                            "productos AS p" +
                                                                                        "INNER JOIN categorias AS c" +
                                                                                        "ON p.fk_categoria_id = c.id  WHERE id = ?")){
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    producto = extracted(resultSet);
                }
            }
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) throws SQLException {
        String sql = null;
        if (producto.getId()>0) {
            sql = "UPDATE productos SET nombre = ?, precio = ?, fk_categoria_id = ?, sku = ?  WHERE id = ?";
        }else{
            sql = "INSERT INTO productos(nombre, precio, fk_categoria_id ,fecha_registro, sku) VALUES (?, ?, ?, ?, ?)";
        }
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
            preparedStatement.setString(1,producto.getNombre());
            preparedStatement.setInt(2,producto.getPrecio());

            if (producto.getId()>0) {
                //Relaciones de objetos
                preparedStatement.setInt(3,producto.getCategoria().getId());
                preparedStatement.setString(4,producto.getSku());
                preparedStatement.setInt(5,producto.getId());
            }else{
                preparedStatement.setInt(3,producto.getCategoria().getId());
                preparedStatement.setDate(4,new Date(producto.getFecha().getTime())); //Castear la fecha a DATE SQL de DATE UTIL
                preparedStatement.setString(5,producto.getSku());
            }
            preparedStatement.execute();
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try(PreparedStatement preparedStatement = getConnection().prepareStatement("DELETE FROM productos WHERE id = ?")){
            preparedStatement.setLong(1,id);
            preparedStatement.execute();
        }
    }
    private Producto extracted(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getInt("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setSku(resultSet.getString("sku"));
        producto.setFecha(resultSet.getDate("fecha_registro"));
        //Relacion entre producto y categoria
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getInt("fk_categoria_id"));
        categoria.setNombre(resultSet.getString("categoria"));
        producto.setCategoria(categoria);
        return  producto;
    }
}
