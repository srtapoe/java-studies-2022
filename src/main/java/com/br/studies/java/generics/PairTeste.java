package com.br.studies.java.generics;

public class PairTeste {
    public static void main(String[] args) {

        Pairs<Integer, String> charactersHimym = new Pairs<>();

        charactersHimym.adicionar(1, "Ted Mosby");
        charactersHimym.adicionar(2, "Lily Aldrin");
        charactersHimym.adicionar(3, "Marshall Ericksen");
        charactersHimym.adicionar(4, "Barney Stinson");
        charactersHimym.adicionar(5, "Robin");
        charactersHimym.adicionar(5, "Tracy");

        System.out.println(charactersHimym.getValor(1));
        System.out.println(charactersHimym.getValor(2));
        System.out.println(charactersHimym.getValor(3));
        System.out.println(charactersHimym.getValor(4));
        System.out.println(charactersHimym.getValor(5));
    }
}
