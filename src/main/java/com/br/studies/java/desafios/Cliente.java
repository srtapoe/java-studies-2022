package com.br.studies.java.desafios;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private int senha;

    public Cliente(int senha) {
        this.senha = senha;
    }


}
