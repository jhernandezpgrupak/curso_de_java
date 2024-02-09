package org.alberttcode.java.jdbc.repositorio;

import org.alberttcode.java.jdbc.models.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositorioImplements implements Repositorio<Categoria> {
    private Connection connection;

    public CategoriaRepositorioImplements() {
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public CategoriaRepositorioImplements(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT *FROM categorias")){
            while(resultSet.next()){
                Categoria categoria = getCategoria(resultSet);
                categorias.add(categoria);
            }
        }
        return categorias;
    }

    @Override
    public Categoria porId(Long id) throws SQLException {
        Categoria categoria = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM categorias WHERE id = ? ")){
            preparedStatement.setLong(1,id);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    categoria = getCategoria(resultSet);
                }
            }
        }
        return categoria;
    }

    @Override
    public Categoria guardar(Categoria categoria) throws SQLException {
        String sql = "";
        if(categoria.getId()>0){
            sql = "UPDATE categorias SET nombre = ? WHERE id = ?";
        }else{
            sql = "INSERT INTO categorias (nombre) VALUES(?)";
        }
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1,categoria.getNombre());
            if(categoria.getId()>0){
                preparedStatement.setInt(2,categoria.getId());
            }
            preparedStatement.executeUpdate();
            if(categoria.getId()==0){
                try(ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                    if(resultSet.next()){
                        categoria.setId(resultSet.getInt(1));
                    }
                }
            }
        }
        return categoria;
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try(PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM categorias WHERE id = ?")){
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
        }
    }

    private static Categoria getCategoria(ResultSet resultSet) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getInt("id"));
        categoria.setNombre(resultSet.getString("nombre"));
        return categoria;
    }
}
