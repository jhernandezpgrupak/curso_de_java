package org.alberttcode.patrones.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }
    //Pasar this por el metodo que recibe el observer
    public void notifyObserver(){
        for(Observer obs: this.observers){
            obs.update(this);
        }
    }
}
