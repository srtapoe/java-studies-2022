package com.br.studies.java.calculadora;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador{

        private final JLabel label;
        
    public Display(){
        Memoria.getInstancia().adicionarObservador(this);


        setBackground(new Color(46,49,50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    @Override
    public void ValorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
