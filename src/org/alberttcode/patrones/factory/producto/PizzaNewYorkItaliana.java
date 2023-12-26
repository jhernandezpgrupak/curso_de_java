package org.alberttcode.patrones.factory.producto;

import org.alberttcode.patrones.factory.PizzaProducto;
import org.alberttcode.patrones.factory.PizzeriaZonaAbstractFactory;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        nombre = "Pizza al estilo de Italia!";
        masa = "Masa hecha a base de trigo";
        salsa = "Salsa de tomate fresco";
        ingredientes.add("Tres quesos...");
        ingredientes.add("Carne");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a una temperatura secreta!");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza como  tradicionalmente se hace en Sicilia");
    }
}
