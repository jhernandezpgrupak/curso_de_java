package org.alberttcode.patrones.decorator.decorador;

import org.alberttcode.patrones.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextoDecorador{
    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","*");
    }
}
