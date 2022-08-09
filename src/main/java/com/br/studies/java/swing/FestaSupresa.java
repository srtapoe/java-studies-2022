package com.br.studies.java.swing;

public class FestaSupresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registerObservadores(namorada);
        porteiro.monitorarChegada();
    }
}
