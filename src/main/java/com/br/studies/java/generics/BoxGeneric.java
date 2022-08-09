package com.br.studies.java.generics;

public class BoxGeneric<G> {
    private G thing;

    public void guardar(G thing){
        this.thing = thing;
    }

    public void abrir(){
        System.out.println(thing);
    }

    @Override
    public String toString() {
        return "Thing: " +  thing ;
    }
}
