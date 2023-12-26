package org.alberttcode.recursividad.ejemplo;

import org.alberttcode.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente gabinete = new Componente("Gabinete PC");
        Componente fuentePoder = new Componente("Fuente de poder 700");
        Componente placa = new Componente("Gigabyt 78956");
        Componente cpu = new Componente("Intel core i7 6800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente gpu = new Componente("Nvidia RTX 3080 12GB");
        Componente tarjetaVideo = new Componente("Nvidia GPU RTX");
        Componente gpuRamRanura1 = new Componente("4GB Ram");
        Componente gpuRamRanura2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32 GB");
        Componente ssd = new Componente("Disco SDD 2T");

        cpu.add(ventilador)
                .add(disipador);

        tarjetaVideo.add(gpu)
                .add(gpuRamRanura1)
                .add(gpuRamRanura2)
                .add(gpuVentiladores);

        placa.add(cpu)
                .add(tarjetaVideo)
                .add(ram)
                .add(ssd);

        gabinete.add(fuentePoder)
                .add(placa)
                .add(new Componente("Teclado"))
                .add(new Componente("Mouse"));

        //metodoRecursivo(gabinete, 0);
        metodoRecursivoStreamJava8(gabinete, 0)
                .forEach(componente -> System.out.println(" - \t".repeat(componente.getNivel())
                +componente.getNombre()));
    }
    public static Stream<Componente> metodoRecursivoStreamJava8(Componente componente, int nivel){
        componente.setNivel(nivel);
        return Stream.concat(Stream.of(componente),
                componente.getHijos().stream()
                        .flatMap(hijo -> metodoRecursivoStreamJava8(hijo, nivel + 1 )));
    }
    public static void metodoRecursivo(Componente componente, int nivel){
        System.out.println("\t".repeat(nivel) + componente.getNombre());
        if(componente.tieneHijos()){
            //Declaras el tipo de variable que va almacenar hijo -> lo que resulte de componente que
            //pasamos como parametro componente y el metodo
            for (Componente hijo: componente.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}
