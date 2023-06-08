package org.alberttcode.pooherencia;

public class Alumno extends Persona{
    private String matricula;
    private String email;
    private String institucion;
    public Alumno(){
        super();//Invocar el constructor del padre
        System.out.println("Alumno: Inicializando constructor...");
    }
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);//Mediante el constructor lo puedo asignar con super
    }
    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    public Alumno(String nombre, String apellido, int edad,String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Override
    public String Saludar(){
        String holis = super.Saludar();
        return holis + "soy el alumno " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmatricula='" + matricula + '\'' +
                ", email='" + email + '\'' +
                ", institucion='" + institucion;
    }
}
