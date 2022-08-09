package com.br.studies.java.generics;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Pair<C, V> {

    private C chave;
    private V valor;

    public Pair(){}

    public Pair(C chave, V valor){
        super();
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(chave, pair.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }
}
