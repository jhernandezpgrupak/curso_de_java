package org.alberttcode.poointerfaces.repositorio;

import org.alberttcode.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio{ //Implementar las diferentes interfaces
    //Implementar los metodos de la interfaz
    private List<Cliente> dataSource;//Atributo datasource el contenedor de los datos

    public ClienteListRepositorio() {//Constructor
        this.dataSource = new ArrayList<>();//Inicializar el array list
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSource){
            if(cli.getId()!=null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        //Crear, modificar y retornar la nueva lista
        List<Cliente> listaordenada = new ArrayList<>(this.dataSource);
        //El ordenamiento afecta por completo el datasource, (hacer datasource inmutable)
        listaordenada.sort((a, b) -> {
            int result = 0;
            if (dir == Direccion.ASC) {
                result = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                result = ordenar(campo, b, a);
            }
            return result;
        });
        return listaordenada;
    }
    @Override
    public List<Cliente> listar(int desde, int hasta) {
       return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int result  = 0;
        switch (campo){//Forma funcional
            case "id" ->
                    result = b.getId().compareTo(a.getId());
            case "nombre" ->
                    result = b.getNombre().compareTo(a.getNombre());
            case "apellido" ->
                    result = b.getApellido().compareTo(a.getApellido());
        }
        return result;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
