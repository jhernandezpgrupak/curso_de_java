package org.alberttcode.poointerfaces.repositorio;

import org.alberttcode.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
