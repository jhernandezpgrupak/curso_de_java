package org.alberttcode.hilos.ejemplosync;

public class Panaderia{
    String pan;
    boolean disponible;
    public synchronized void hornear(String masa){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        while(!disponible){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume el pan " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }
}