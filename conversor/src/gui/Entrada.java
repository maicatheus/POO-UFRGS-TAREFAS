package gui;

import javax.swing.*;

import java.awt.*;
import java.util.List;

import static gui.providers.Constantes.TEXT_FIELD_HEIGTH;
import static gui.providers.Constantes.WIDTH_GERAL;

public class Entrada extends JPanel {
    private JTextField textFieldEntrada;
    public Entrada() {
        this.setLayout(new GridLayout(1,2,10,10));
        this.setSize(WIDTH_GERAL,50);
        this.setVisible(true);


        JLabel labelEntrada = new JLabel("Entrada:");
        this.add(new Panel());
        this.add(labelEntrada);
        this.textFieldEntrada= new JTextField();
        this.add(this.textFieldEntrada);
        this.add(new Panel());

    }
}
