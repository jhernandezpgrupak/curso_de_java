package org.alberttcode.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "java";
    private static String password = "java";
    private static Connection connection;
    //Crear un patron de diseño singleton
    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
