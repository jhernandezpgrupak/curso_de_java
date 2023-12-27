package org.alberttcode.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo, true))){
            //El parametro true permite agregar contenido sin destruir el ya creado.
            bufferedWriter.append("Hola que tal amigos, ")
                    .append("Buenos dias,\n")
                    .append("faltan 7 dias para año nuevo 2024.");
            //Finalizar y cerrar el recurso
            //No es necesario, cuando se finaliza el try cierra el buffereader
            //bufferedWriter.close();
            System.out.println("El archivo se ha creado con exito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter bufferedWriter = new PrintWriter(new FileWriter(archivo, true))){
            bufferedWriter.println("Hola que tal amigos! ");
            bufferedWriter.println("Buenos dias!");
            bufferedWriter.println("Faltan 7 dias para año nuevo 2024!");
            System.out.println("El archivo se ha creado con exito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        //Crear la instancia de file para poder leer
        File file = new File(nombre);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String linea;
            //Si el contenido es distinto de null, seguimos con la iteración
            while ( (linea = bufferedReader.readLine()) != null){
               sb.append(linea).append("\n");
            }
            //bufferedReader.close();
        }catch(IOException e){//Input Output Exception
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        //Crear la instancia de file para poder leer
        File file = new File(nombre);
        try(Scanner scanner = new Scanner(file)){
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                sb.append(scanner.next()).append("\n");
            }
            //scanner.close();
        }catch(IOException e){//Input Output Exception
            e.printStackTrace();
        }
        return sb.toString();
    }
}
