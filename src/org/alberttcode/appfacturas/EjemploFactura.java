package org.alberttcode.appfacturas;

import org.alberttcode.appfacturas.modelo.Cliente;
import org.alberttcode.appfacturas.modelo.Factura;
import org.alberttcode.appfacturas.modelo.ItemFactura;
import org.alberttcode.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("HEPA940319908");
        cliente.setNombre("Albertt Hdz");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        for (int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto n° " + producto.getCodigo() + " : ");
            nombre = s.nextLine();
            producto.setNombre(nombre);
            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);
            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();
            ItemFactura itemFactura = new ItemFactura(cantidad, producto);
            factura.addItemFactura(itemFactura);
            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);//Solo se imprime factura ya que realizamos un toString retornando el metodo verDetalle
    }
}
