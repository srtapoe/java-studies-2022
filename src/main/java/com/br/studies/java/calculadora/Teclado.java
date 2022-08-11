package com.br.studies.java.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Teclado extends JPanel implements ActionListener {

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints cons = new GridBagConstraints();

        setLayout(layout);

        cons.weightx = 1;
        cons.weighty = 1;
        cons.fill = GridBagConstraints.BOTH;

        //line 1
        Color COR_CINZA_ESCURO = new Color(68, 69, 68);
        Color COR_LARANJA = new Color(242, 163, 60);
        cons.gridwidth = 3;
        adicionarBotao("AC", COR_CINZA_ESCURO, cons, 0, 0);
        cons.gridwidth = 1;
        adicionarBotao("/", COR_LARANJA, cons, 3, 0);


        //line 2
        Color COR_CINZA_CLARO = new Color(97, 100, 99);
        adicionarBotao("7", COR_CINZA_CLARO, cons, 0, 1);
        adicionarBotao("8", COR_CINZA_CLARO, cons, 1, 1);
        adicionarBotao("9", COR_CINZA_CLARO, cons, 2, 1);
        adicionarBotao("*", COR_LARANJA, cons, 3, 1);

        //line 3
        adicionarBotao("4", COR_CINZA_CLARO, cons, 0, 2);
        adicionarBotao("5", COR_CINZA_CLARO, cons, 1, 2);
        adicionarBotao("6", COR_CINZA_CLARO, cons, 2, 2);
        adicionarBotao("-", COR_LARANJA, cons, 3, 2);


        //line 4
        adicionarBotao("1", COR_CINZA_CLARO, cons, 0, 3);
        adicionarBotao("2", COR_CINZA_CLARO, cons, 1, 3);
        adicionarBotao("3", COR_CINZA_CLARO, cons, 2, 3);
        adicionarBotao("+", COR_LARANJA, cons, 3, 3);

        //line 5
        cons.gridwidth = 2;
        adicionarBotao("0", COR_CINZA_CLARO, cons, 0, 4);
        cons.gridwidth = 1;
        adicionarBotao("0", COR_CINZA_CLARO, cons, 1, 4);
        adicionarBotao(",", COR_CINZA_CLARO, cons, 2, 4);
        adicionarBotao("=", COR_LARANJA, cons, 3, 4);
    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints cons, int x, int y) {

        cons.gridx = x;
        cons.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, cons);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processarComando(botao.getText());
        }


    }
}
