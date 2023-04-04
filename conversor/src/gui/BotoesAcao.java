package gui;

import javax.swing.*;
import java.awt.*;

public class BotoesAcao extends JPanel {
    private JButton btnConverter;
    private JButton btnReset;
    private JTextField textFieldResultado;

    public BotoesAcao() {
        this.setVisible(true);
        this.setLayout(new GridLayout(1,4,10,10));

        JLabel labelResultado = new JLabel("Resultado: ");
        this.btnConverter = new JButton("Converter");
        this.btnReset = new JButton("Reset");
        this.textFieldResultado = new JTextField();

        this.add(btnConverter);
        this.add(btnReset);
        this.add(labelResultado);
        this.add(textFieldResultado);

    }
}
