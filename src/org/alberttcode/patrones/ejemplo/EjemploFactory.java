package org.alberttcode.patrones.ejemplo;

import org.alberttcode.patrones.factory.PizzaProducto;
import org.alberttcode.patrones.factory.PizzeriaCaliforniaFactory;
import org.alberttcode.patrones.factory.PizzeriaNewYorkFactory;
import org.alberttcode.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        //Instanciar la clase mas abstracta
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();

        PizzaProducto pizzaProducto = ca.ordenarPizza("Vegetariana");
        System.out.println("Jorge ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("Italiana");
        System.out.println("Andres ordena una " + pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("Pepperoni");
        System.out.println("Carla ordeno una pizza muy famosa de " + pizzaProducto.getNombre()+" en la cidad de New York " );

    }
}
