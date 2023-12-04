package org.alberttcode.java8.lambda;

import org.alberttcode.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        //Consumidores
        //Cuando solo es un argumento se pueden omitir los parentesis (fecha)
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> consumer1  = (nombre,edad) -> {
            System.out.println(nombre + ", tiene la edad de " + edad + " años");
        };
        //Utilizar con la expresion lambda
        consumer1.accept("Pedro", 23);
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo!");
        //
        List<String> nombres  = Arrays.asList("Andres","Eric", "Luz", "Francisco");
        nombres.forEach(consumer2);
        Usuario usuario = new Usuario();

        //Expresion lambda que asigna el nombre del usuario
        BiConsumer<Usuario, String>  asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario,"Alberto");
        System.out.println("Nombre del usuario " + usuario.getNombre());
        //Supplier
        //Cuando solo es una instruccion, podemos quitar las llaves y el return
        Supplier<String> proveedores = () -> "Hola mundo, supplier";
        System.out.println(proveedores.get());
    }
}
