package com.br.studies.java.swing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registerObservadores(ObservadorChegadaAniversariante obs){
        observadores.add(obs);
    }

    public void monitorarChegada(){
        Scanner scanner = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou? ");
            valor = scanner.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                ChegadaAniversariante evento = new ChegadaAniversariante(new Date());
                observadores
                        .forEach(o -> o.chegou(evento));
            }else{
                System.out.println("Alarme falso!");
            }
        }

        scanner.close();
    }
}
