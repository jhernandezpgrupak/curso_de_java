package org.alberttcode.ejemplos.set.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class EjemploHashMapAnidandoObjetos {
    public static void main(String[] args) {
        //Tipo de dato con el que se van a llenar los mapas
        Map<String, Object> persona = new HashMap<>();
        persona.put(null,"1234");
        persona.put("nombre","Jesus");
        persona.put("apellido", "Doe");
        persona.put("email","jhernandezp@grupak.com.mx");
        persona.put("edad","29");

        //Creamos un objeto Map con las direcciones
        Map<String, String> direcciones = new HashMap<>();
        direcciones.put("pais","Mexico");
        direcciones.put("estado", "Estado de Mexico");
        direcciones.put("ciudad","Toluca");
        //Anidado objetos como los objetos json de js
        persona.put("direccion",direcciones);

        System.out.println("Objeto anidado");
        System.out.println(persona);

        //Casteamos de la siguiente manera
        Map<String,String> direccionesPersona =  (Map<String,String>)persona.get("direccion");
        String pais = (String) direccionesPersona.get("pais");
        System.out.println("pais = " + pais);

        System.out.println("Recorriendo con keySet");
        for(String llave: persona.keySet()){
            //Declaramos la variable de tipo objeto iterando
            Object valor = persona.get(llave);
            //Si el valor es de instancia Map, (Cuando llegue a direcciones)
            if(valor instanceof Map){
                //Declaramos la variable casteando el  valor a map
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get("nombre")
                + " es " + direccionMap.get("pais"));
            }else {
                System.out.println(llave + " => " + valor);
            }
        }
        exit(0);
    }
}

