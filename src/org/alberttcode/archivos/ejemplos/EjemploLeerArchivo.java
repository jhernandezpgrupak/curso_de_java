package org.alberttcode.archivos.ejemplos;

import org.alberttcode.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        ArchivoServicio archivoServicio = new ArchivoServicio();
        System.out.println(archivoServicio.leerArchivo2("C:\\Users\\jhernandezp\\Documents\\jhernandezp\\Curso2\\manejo_de_archivo\\file.txt"));
    }
}
