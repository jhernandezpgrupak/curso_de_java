package org.alberttcode.app.jardin;

import org.alberttcode.app.hogar.Persona;

public class Perro {
    //Cuando los metodos son default, y la clase esta en el mismo paquete, podemos acceder sin problema.
    protected String nombre;
    protected String raza;
    String Jugar(Persona persona){//No puede ser publico ya que el perro no puede jugar dentro de la casa
        return persona.lanzarPelota();//El metodo debe de ser publico para que podamos ir con el Perro a jugar
    }
}
