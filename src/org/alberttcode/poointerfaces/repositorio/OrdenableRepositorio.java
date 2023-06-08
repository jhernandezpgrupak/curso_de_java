package org.alberttcode.poointerfaces.repositorio;

import org.alberttcode.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
