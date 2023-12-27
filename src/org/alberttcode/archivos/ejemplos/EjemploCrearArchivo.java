package org.alberttcode.archivos.ejemplos;

import org.alberttcode.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        //Java en windows
        String archivo = "C:\\Users\\jhernandezp\\Documents\\jhernandezp\\Curso2\\manejo_de_archivo\\file.txt";
        ArchivoServicio archivoServicio = new ArchivoServicio();
        archivoServicio.crearArchivo2(archivo);
    }
}
