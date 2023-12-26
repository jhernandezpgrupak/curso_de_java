package org.alberttcode.patrones.ejemplo;

import org.alberttcode.patrones.decorator.Formateable;
import org.alberttcode.patrones.decorator.Texto;
import org.alberttcode.patrones.decorator.decorador.MayusculasDecorador;
import org.alberttcode.patrones.decorator.decorador.RemplazarEspacioDecorador;
import org.alberttcode.patrones.decorator.decorador.ReverseDecorador;
import org.alberttcode.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("¡albertt code!");

        MayusculasDecorador mayusculasDecorador = new MayusculasDecorador(texto);
        RemplazarEspacioDecorador remplazarEspacioDecorador = new RemplazarEspacioDecorador(mayusculasDecorador);
        ReverseDecorador reverseDecorador = new ReverseDecorador(remplazarEspacioDecorador);
        SubrayadoDecorador subrayadoDecorador = new SubrayadoDecorador(reverseDecorador);

        System.out.println(subrayadoDecorador.darFormato());
    }
}
