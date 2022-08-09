package com.br.studies.java.generics;

import java.util.*;

public class Pairs<K extends Number, Y> {

    private final Set<Pair<K, Y>> itens = new LinkedHashSet<>();

    public void adicionar(K chave, Y valor) {
        if (chave == null) return;

        Pair<K, Y> novoPar = new Pair<>(chave, valor);

        itens.remove(novoPar);

        itens.add(novoPar);
    }

    public Y getValor(K chave) {
        if(chave == null) return null;

        Optional<Pair<K, Y>> pairOptional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();

        return pairOptional.map(Pair::getValor).orElse(null);
    }
}
