package com.br.studies.java.calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora(){

        OrganizarLayout();

        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void OrganizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233,60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
