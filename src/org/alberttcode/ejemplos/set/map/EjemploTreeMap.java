package org.alberttcode.ejemplos.set.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.exit;

public class EjemploTreeMap {
    public static void main(String[] args) {
        //Tipo de dato con el que se van a llenar los mapas
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        //No pueden existir elementos nulos
        persona.put("nombre","Jesus");
        persona.put("apellido", "Doe");
        persona.put("email","jhernandezp@grupak.com.mx");
        persona.put("edad","29");

        //Creamos un objeto Map con las direcciones
        Map<String, String> direcciones = new TreeMap<>();
        direcciones.put("pais","Mexico");
        direcciones.put("estado", "Estado de Mexico");
        direcciones.put("ciudad","Toluca");
        //Anidado objetos como los objetos json de js
        persona.put("direccion",direcciones);

        System.out.println("Objeto anidado");
        System.out.println(persona);


    }
}

