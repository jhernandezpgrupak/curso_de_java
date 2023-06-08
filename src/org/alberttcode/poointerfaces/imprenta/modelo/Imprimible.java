package org.alberttcode.poointerfaces.imprenta.modelo;

public interface Imprimible {
    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
    //String imprimir();

    default String imprimir(){ //Metodo default no es necesario implemenarlo en las clase hijas
                                //Pero si utilizar el metodo de la clase para sobreescribir el metodo de la interface
        return TEXTO_DEFECTO;
    }

    //Metodo estatico
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
