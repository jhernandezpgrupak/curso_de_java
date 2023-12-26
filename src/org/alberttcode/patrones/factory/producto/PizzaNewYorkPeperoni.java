package org.alberttcode.patrones.factory.producto;

import org.alberttcode.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {
    //Hereda de pizza producto
    //Implementar metodos abstractos
    //Genera el constructor implementando el metodo super() de la clase padre, ya que inicializa la lista de ingredientes

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa de harina de trigo sin gluten";
        salsa = "Salsa de tomate de la granja de homero";
        ingredientes.add("Pepperoni del mediterraneo");
        ingredientes.add("Tomate fresco de arizona");
        ingredientes.add("Queso premium español");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la pizza a temperatura 180°C por 20 minutos!");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en 8 partes equitativas");
    }

}
