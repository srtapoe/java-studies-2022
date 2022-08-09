package com.br.studies.java.swing;

import lombok.Getter;
import java.util.Date;

@Getter
public class ChegadaAniversariante {

    private final Date momentoChegada;

    public ChegadaAniversariante(Date momentoChegada) {
        this.momentoChegada = momentoChegada;
    }
}
