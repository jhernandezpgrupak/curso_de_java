package org.alberttcode.patrones.factory.producto;

import org.alberttcode.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
    //Para inicializar las pizzas
    public PizzaNewYorkVegetariana() {
        //Inicializar el constructor del padre para obtener la lista de los ingredientes.
        super();
        nombre = "Pizza vegetariana new york";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomato");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 140°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
