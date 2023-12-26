package org.alberttcode.patrones.ejemplo;

import org.alberttcode.patrones.decorator2.Cafe;
import org.alberttcode.patrones.decorator2.Configurable;
import org.alberttcode.patrones.decorator2.decorador.ConChocolateDecorador;
import org.alberttcode.patrones.decorator2.decorador.ConCremaDecorador;
import org.alberttcode.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecorador2 {
    public static void main(String[] args) {
        //Instancia de cafe del tipo configurable, del tipo de la interfaz mas generico
        Configurable cafe = new Cafe(65,"Cafe de Moka : ");
        ConCremaDecorador conCremaDecorador = new ConCremaDecorador(cafe);
        ConLecheDecorador conLecheDecorador = new ConLecheDecorador(conCremaDecorador);
        ConChocolateDecorador conChocolateDecorador = new ConChocolateDecorador(conLecheDecorador);
        System.out.println("El precio del cafe de moka es de: "  + conChocolateDecorador.getPrecioBase() + " pesos mexicanos");
        System.out.println("Sus ingredientes son: " + conChocolateDecorador.getIngredientes());

        Configurable expresso = new Cafe(46,"Cafe Espresso : ");

        System.out.println("Ingredientes : " + new ConCremaDecorador(expresso).getIngredientes());
    }
}
