package com.br.studies.java.generics;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {

        BoxGeneric<String> thing = new BoxGeneric<>();
        thing.guardar("ted");

        BoxGeneric<String> thing2 = new BoxGeneric<>();
        thing2.guardar("barney");

        BoxGeneric<String> thing3 = new BoxGeneric<>();
        thing3.guardar("lily");

        BoxGeneric<String> thing4 = new BoxGeneric<>();
        thing4.guardar("marshall");

        BoxGeneric<String> thing5 = new BoxGeneric<>();
        thing5.guardar("robin");

        ArrayList<BoxGeneric<String>> characters = new ArrayList<>();
        characters.add(thing);
        characters.add(thing2);
        characters.add(thing3);
        characters.add(thing4);
        characters.add(thing5);

        for (BoxGeneric<String> things: characters) {
            System.out.println(things);
        }

    }
}
