package org.alberttcode.poointerfaces.repositorio;

import org.alberttcode.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    //Escribir los metodos de la interfaz
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);

}
