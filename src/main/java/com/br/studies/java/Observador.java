package com.br.studies.java;

import javax.swing.*;
import java.awt.*;


public class Observador {
    public static void main(String[] args) {

        JFrame window = new JFrame("Observador");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(600, 200);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);

        JButton button = new JButton("Clique aqui");
        window.add(button);

        button.addActionListener(e -> System.out.println("Evento ocorreu"));

        window.setVisible(true);
    }
}
