package org.alberttcode.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;
    public AlumnoInternacional(){
        System.out.println("Alumno Internacional: Inicializando constructor...");
    }
    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);//de la clase Alumno despues se pasa a la clase padre Persona
    }
    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String Saludar(){
        String holis = super.Saludar();
        return holis + "mi nombre es " + getNombre() + " alumno de intercambio, del pais "+getPais();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
