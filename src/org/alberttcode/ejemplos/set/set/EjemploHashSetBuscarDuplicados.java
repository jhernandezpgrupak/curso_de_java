package org.alberttcode.ejemplos.set.set;
import java.util.Set;
import java.util.HashSet;

public class EjemploHashSetBuscarDuplicados {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Robalo", "Atún", "Lenguado"};
        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if(!unicos.add(pez)){
                //System.out.println("Elemento duplicado: " +pez);
            }
        }
        System.out.println(unicos.size()+ " elementos no duplicados: " + unicos);
    }
}
