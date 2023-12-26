package org.alberttcode.patrones.decorator2.decorador;

import org.alberttcode.patrones.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {
    //Atributo para heredar tipo de clase Configurable
    protected Configurable cafe;
    //Constructor que inicializa cafe
    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}
