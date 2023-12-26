package org.alberttcode.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
    //Lista de tipo componente que representa elementos fijos
    private List<Componente> list;
    public Directorio(String nombre) {
        super(nombre);
        this.list = new ArrayList<>();
    }
    //Agregar coomponente
    public Directorio addComponente(Componente componente){
        list.add(componente);
        return this;
    }
    //Eliminar componente
    public void removeComponente(Componente componente){
        list.remove(componente);
    }

    @Override
    public String mostrar(int nivel){
        StringBuilder sb = new StringBuilder("\t".repeat(nivel))
                .append(nombre)
                .append("/")
                .append("\n");
        for (Componente hijo: this.list){
            sb.append(hijo.mostrar(nivel + 1));
                if(hijo instanceof Archivo) {
                    sb.append("\n");
                }
        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        return list.stream().anyMatch(h -> h.buscar(nombre));
        /*
        for(Componente hijo: list){
            if(hijo.buscar(nombre)){
                return true;
            }
        }
        */
        //return false;
    }
}
