package org.alberttcode.anotaciones.ejemplo;

import org.alberttcode.anotaciones.ejemplo.models.Producto;
import org.alberttcode.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setFecha(LocalDate.now());
        producto.setNombre("Sala comedor con un sillón extra");
        producto.setPrecio(16000L);
        //Api de reflexion de java
        //Obtener campos declarados, retorna el arreglo de fields

        //Estaba olvidando que el metodo estatico no se puede llamar con la inicializacion del objeto
        //se llama con el nombre de la clase completa
        System.out.println("Json = " + JsonSerializador.convertirJson(producto));
    }
}
