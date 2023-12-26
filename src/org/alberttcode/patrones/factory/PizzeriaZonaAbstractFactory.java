package org.alberttcode.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {
    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizzaProducto = crearPizza(tipo);
        System.out.println("----------Fabricando la pizza" + pizzaProducto.getNombre()+ "----------");
        pizzaProducto.preparar();
        pizzaProducto.cocinar();
        pizzaProducto.cortar();
        pizzaProducto.empaquetar();
        return pizzaProducto;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
