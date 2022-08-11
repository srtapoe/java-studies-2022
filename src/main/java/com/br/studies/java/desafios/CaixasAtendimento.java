package com.br.studies.java.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaixasAtendimento {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(100);
        Cliente cliente2 = new Cliente(101);
        Cliente cliente3 = new Cliente(102);
        Cliente cliente4 = new Cliente(103);
        Cliente cliente5 = new Cliente(510);
        Cliente cliente6 = new Cliente(511);
        Cliente cliente7 = new Cliente(104);
        Cliente cliente8 = new Cliente(105);
        Cliente cliente9 = new Cliente(512);

        List<Cliente> fila = new ArrayList<>();
        fila.add(cliente1);
        fila.add(cliente2);
        fila.add(cliente3);
        fila.add(cliente4);
        fila.add(cliente5);
        fila.add(cliente6);
        fila.add(cliente7);
        fila.add(cliente8);
        fila.add(cliente9);

        chamarCliente(fila);
    }


    public static void chamarSenha() {
        System.out.println("Cliente sendo atendido....");
    }


    public static void chamarCliente(List<Cliente> fila) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Proxima senha: ");
        int senhaAtendimento = dadosEntrada.nextInt();


        if(senhaAtendimento >= 500){
            System.out.println("Caixa n: 01");
            String chamarProximo = "";

            while(!chamarProximo.equalsIgnoreCase("s")){
                System.out.println("Atendimeno finalizado? ");
                chamarProximo = dadosEntrada.nextLine();
            }
        }else{
            System.out.println("Senha = " + senhaAtendimento);
            System.out.println("Caixa n: 02");
            chamarSenha();
        }

    }
}
