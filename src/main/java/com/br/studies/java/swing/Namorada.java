package com.br.studies.java.swing;

public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(ChegadaAniversariante evento) {
        System.out.println("Avisando os convidados....");
        System.out.println("AApagando as luzes....");
        System.out.println("Esperando ele chagar ao apartamento....");
        System.out.println("Supresa!!!!");
    }
}
