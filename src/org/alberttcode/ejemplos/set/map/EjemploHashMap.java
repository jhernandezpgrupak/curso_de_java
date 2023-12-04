package org.alberttcode.ejemplos.set.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        //Las llaves no se pueden repetir
        Map<String, String> persona = new HashMap<>();
        persona.put(null,"1234");
        persona.put("nombre","Jesus");
        persona.put("apellido", "Doe");
        persona.put("email","jhernandezp@grupak.com.mx");
        persona.put("edad","29");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        persona.remove("edad","29");
        System.out.println("map" + persona);
        boolean c = persona.containsKey("edad");
        System.out.println("c = " + c);
        //Values retorna una coleccion del tipo string
        Collection<String> valores = persona.values();
        //Funcion lambda
        valores.forEach((n)->{
            System.out.println("el valor continuo = " + n);
        });

        System.out.println("Recorriendo con Map.Entry");
        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("Recorriendo con keySet");
        for(String llave: persona.keySet()){
            System.out.println("llave = " + llave);
            //Obtenemos el valor mediante la llave
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("Recorriendo con expresión lambda el poderosisimo JAVA 8");
        persona.forEach((llave, valor)->{
            System.out.println("llave = " + llave);
            System.out.println("valor = " + valor);
        });

    }
}

