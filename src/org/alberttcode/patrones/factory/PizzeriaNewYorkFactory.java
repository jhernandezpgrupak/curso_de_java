package org.alberttcode.patrones.factory;

import org.alberttcode.patrones.factory.producto.PizzaNewYorkPeperoni;
import org.alberttcode.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "Vegetariana" -> new PizzaNewYorkVegetariana();
            case "Pepperoni" -> new PizzaNewYorkPeperoni();
            case "Italiana" -> new PizzaNewYorkPeperoni();
            default -> null;
        };
    }
}
