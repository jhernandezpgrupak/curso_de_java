package org.alberttcode.app.hogar;

public enum ColorPelo {
    NEGRO("Negro"),
    CAFE("Cafe"),
    CASTANIO("Castanio"),
    RUBIO("Rubio"),
    COLORIN("Colorin");

    //Agregar el valor como parametro al constructor
    private final String color;//Declarar variable
    ColorPelo(String color) {//Inicializar variable
        this.color =  color;
    }

    @Override
    public String toString() {//Metodo para imprimir el valor de la variable ENUM
        return this.color;
    }
}
