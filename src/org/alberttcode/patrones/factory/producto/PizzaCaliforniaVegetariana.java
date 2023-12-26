package org.alberttcode.patrones.factory.producto;

import org.alberttcode.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza vegetariana de california";
        masa = "Masa hecha a base de soya";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso tres tipos a base de leche de coco");
        ingredientes.add("Champiñones");
        ingredientes.add("Pimientos");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la pizza para personas veganas...");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en las piezas correspondientes al numero de comenasales");
    }
}
