package org.alberttcode.java.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "java";
    private static String password = "java";
    private static BasicDataSource pool;
    //Crear un patron de diseño singleton
    public static BasicDataSource getInstance() throws SQLException {
        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(10);
        }
        return pool;
    }
    /*
        Cada que se ejecuta el metodo primero getInstance, configura el pool de conexiones
        y luego invoca el getConnection y devuelve la conexion
     */
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
