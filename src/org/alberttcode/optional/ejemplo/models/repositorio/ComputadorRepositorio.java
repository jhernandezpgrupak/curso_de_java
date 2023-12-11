package org.alberttcode.optional.ejemplo.models.repositorio;

import org.alberttcode.optional.ejemplo.models.Computador;
import org.alberttcode.optional.ejemplo.models.Fabricante;
import org.alberttcode.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{
    //Se declara y se inicializa la variable
    private List<Computador> datasource;

    public ComputadorRepositorio(){
        //Se puede inicializar en el constuctor
        datasource = new ArrayList<>();
        //Computador con procesador y fabricante
        Procesador procesador = new Procesador("Ryzen 7500", new Fabricante("AMD"));
        Computador asus = new Computador("Asus Rog ", "Strix G-512");
        asus.setProcesador(procesador);
        datasource.add(asus);
        //Computador sin procesador y fabricante
        //Se agrega el objeto tipo Computador a la lista
        datasource.add(new Computador("Asus Rog ", "Strix G-512"));
        datasource.add(new Computador("HP Invy ", "GMX13"));
    }
    //Se crea el metodo del computador declarado en la interfaz repositorio
    @Override
    public Optional<Computador> filtrar(String nombre) {
        //Java funcional (expresiones lambda)
        return datasource.stream()
                .filter(computador -> computador.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*for(Computador c: datasource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }*/
        //return Optional.empty();
    }
}
