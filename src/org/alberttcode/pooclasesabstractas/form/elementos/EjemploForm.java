package org.alberttcode.pooclasesabstractas.form.elementos;

import org.alberttcode.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        //Clase anonimo
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");

        TextareaForm experiencia = new TextareaForm("exp", 5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpciones(new Opcion("1","Java"))//Se pasa como opcion (java) para agregar
        .addOpciones(new Opcion("2","Python"))
        .addOpciones(new Opcion("3","Carbon").setSelected())//Para seleccionarlos automaticamente
        .addOpciones(new Opcion("4","JavaScript"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input type='"+this.nombre+"' value=\""+this.valor+"\" disabled>";
            }
        };
        saludar.setValor("7");
        username.setValor("john.doe");
        password.setValor("Alb3rt0*");
        email.setValor("a@gmail.com");
        experiencia.setValor("... mas de diez años de experiencia");


        List<ElementoForm> elementoForms = Arrays.asList(
        username,
        password,
        email,
        experiencia,
        lenguaje,
        saludar);
        elementoForms.forEach(e ->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
