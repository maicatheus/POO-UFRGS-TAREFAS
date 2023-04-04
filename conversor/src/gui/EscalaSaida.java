package gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class EscalaSaida extends JPanel {
    private ButtonGroup btnGroup;
    public EscalaSaida() {

        this.setLayout(new GridLayout(4,1));
        this.setSize(150,200);
        this.setVisible(true);

        JLabel labelEscala = new JLabel("Escolha a escala:");
        this.add(labelEscala);

        Border border = BorderFactory.createLineBorder(new Color(94, 94, 94), 3);
        TitledBorder titledBorder = BorderFactory.createTitledBorder(border, "Saida", TitledBorder.CENTER, TitledBorder.TOP);
        this.setBorder(titledBorder);
        adicionarRadioBtnEscala(List.of("Celsius","Farehnheit","Kelvin"));

    }

    private void adicionarRadioBtnEscala(List<String> nomeEscalas){
        btnGroup = new ButtonGroup();
        nomeEscalas.forEach(nome -> {
            JRadioButton radioButton = new JRadioButton(nome);
            btnGroup.add(radioButton);
            this.add(radioButton);
        });
    }

}
