package org.alberttcode.patrones.singleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton conexionBDSingleton;
    private ConexionBDSingleton(){
        System.out.println("Conectandose a SQL SERVER...");
    }

    public static ConexionBDSingleton getConexionBDSingleton(){
        if(conexionBDSingleton == null){
            conexionBDSingleton = new ConexionBDSingleton();
        }
        return conexionBDSingleton;
    }
}
