package org.alberttcode.app.hogar;

public class Persona {
    public static  final String GENERO_MASCULINO = "Masculino";
    public static  final String GENERO_FEMENINO = "Femenino";
    private String nombre;
    private String apellido;
    private ColorPelo ColorPelo;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public org.alberttcode.app.hogar.ColorPelo getColorPelo() {
        return ColorPelo;
    }

    public void setColorPelo(org.alberttcode.app.hogar.ColorPelo colorPelo) {
        this.ColorPelo = colorPelo;
    }

    public String lanzarPelota(){//Para invocar en el jardin con el perro
        return "Vengo con mi perro, y le lanzo la pelota!";
    }

    public static String saludar(){
        return "Hola a todos";
    }
}
