package org.alberttcode.anotaciones.ejemplo.procesador;

import org.alberttcode.anotaciones.ejemplo.Init;
import org.alberttcode.anotaciones.ejemplo.JsonAtributo;
import org.alberttcode.anotaciones.ejemplo.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {
    //Metodo que se encarga de inicializar el objeto antes de convertir a json
    public static void inicializarObjeto(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser nulo!");
        }
        //Obtencion de los metodos
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    //System.out.println(m);
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("Error al serializar, no se puede iniciar el objeto");
                    }
                });
    }
    public static String convertirJson(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser nulo!");
        }
        inicializarObjeto(object);
        Field[] fields = object.getClass().getDeclaredFields();
        return Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    //Si existe y tiene valor el atributo nombre de la anotación es vacio, pone descripcion
                    //f es el campo (field)
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try{
                        Object valor = f.get(object);
                        if(f.getAnnotation(JsonAtributo.class).capatilizar() && valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase() +
                                            palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));
                            //nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase() +
                            //nuevoValor.substring(1).toLowerCase();
                            //Setea el nuevo valor
                            f.set(object,nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                        //return nombre + ":" + ""+f.get(producto)+"";
                    } catch (IllegalAccessException e){
                        throw new JsonSerializadorException("Error al serializar a json : " +e);
                    }
                })
                .reduce("{",(a,b) -> {
                    //a pasa a formar parte como acomulador, se valida si la llave es igual a a en la primera iteración
                    if ("{".equals(a)){
                        return a + b;
                    }
                    //a pasa como el primer elemento del json
                    return a + ", " + b;
                }).concat("}");
    }
}
