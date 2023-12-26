package org.alberttcode.patrones.factory;

import org.alberttcode.patrones.factory.producto.PizzaCaliforniaVegetariana;
import org.alberttcode.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        if(tipo == "Vegetariana") {
            return new PizzaCaliforniaVegetariana();
        }
        return null;
    }
}
