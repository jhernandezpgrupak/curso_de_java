package org.alberttcode.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        for(int i = 0 ; i<=10; i++){
            ConexionBDSingleton con = ConexionBDSingleton.getConexionBDSingleton();
            System.out.println("con = " + con);
        }
    }
}
