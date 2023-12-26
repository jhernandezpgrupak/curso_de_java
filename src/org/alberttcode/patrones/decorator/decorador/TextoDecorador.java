package org.alberttcode.patrones.decorator.decorador;

import org.alberttcode.patrones.decorator.Formateable;


abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
