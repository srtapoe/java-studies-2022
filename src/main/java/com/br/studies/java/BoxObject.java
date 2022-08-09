package com.br.studies.java;

public class BoxObject {

    private Object thing;

    public void guardar(Object thing){
        this.thing = thing;
    }

    public void abrir(){
        System.out.println(thing);
    }
}
