package org.alberttcode.poointerfaces;

import org.alberttcode.poointerfaces.modelo.Cliente;
import org.alberttcode.poointerfaces.repositorio.ClienteListRepositorio;
import org.alberttcode.poointerfaces.repositorio.CrudRepositorio;
import org.alberttcode.poointerfaces.repositorio.Direccion;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        //CrudRepositorio repo = new ClienteListRepositorio();//Implementacion como DAO (Data Access Object)
        ClienteListRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Alberto","Hernández"));
        repo.crear(new Cliente("Diego","González"));
        repo.crear(new Cliente("Beatriz","Parra"));
        repo.crear(new Cliente("Felipe","Quintana"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("##########");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(c -> System.out.println(c));
        System.out.println("########## Ordenar ASC");
        List<Cliente> clientesasc = repo.listar("nombre", Direccion.DESC);
        for(Cliente c: clientesasc){
            System.out.println(c);
        }
        System.out.println("########## Editar");
        Cliente update = new Cliente("Diego","Carrasco");
        update.setId(2);
        repo.editar(update);
        System.out.println(repo.porId(2));
        System.out.println("########## Eliminar");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("Total de registros : " + repo.total());
    }
}
