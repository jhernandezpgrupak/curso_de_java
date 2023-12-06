package org.alberttcode.api.stream.ejemplos;

import org.alberttcode.api.stream.ejemplos.models.Factura;
import org.alberttcode.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alberto","Hernández");
        Usuario usuario2 = new Usuario("Adalberto","Hernández");

        usuario1.addFactura(new Factura("Compras navideñas"));
        usuario1.addFactura(new Factura("Muebles"));

        usuario2.addFactura(new Factura("Compras consumibles"));
        usuario2.addFactura(new Factura("Compras Abarrotes"));

        List<Usuario> usuarioList = Arrays.asList(usuario1,usuario2);
        //Convertir el flujo del usuario a una lista de factura => map()
        usuarioList.stream()
                        //Convertir el string de usuarios a un stream del tipo lista de factura
                        .map(Usuario::getFacturas)
                                //Convertimos esta lista de factura a un stream de fatura
                                .flatMap(List::stream)
                                        .forEach(f -> System.out.println(f.getDescripcion()));

        System.exit(1);
        //Utilizando flatmap
        usuarioList.stream().flatMap(
                u -> u.getFacturas().stream())
                .forEach(factura ->
                        System.out.println(factura.getUsuario().toString().concat(" => ").concat(
                        factura.getDescripcion())));

        /*
        usuarioList.stream().map(u ->
                    u.getFacturas()).forEach(u -> u.forEach(factura -> System.out.println(factura.getUsuario()
                + "=>" + factura.getDescripcion())));
        */


        //System.out.println(usuarioList);
        //Recorrer el objeto de usuario
        //Recorrer el objeto de factura
        //Obtener la descripción
        /*for (Usuario u: usuarioList){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
