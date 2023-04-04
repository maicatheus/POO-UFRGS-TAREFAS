package gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import static gui.providers.Constantes.HEIGHT_GERAL;
import static gui.providers.Constantes.WIDTH_GERAL;

public class Conversor extends JFrame {

    public Conversor() {
        this.setTitle("Conversor de Temperatura");
        JPanel rootPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setSize(WIDTH_GERAL,HEIGHT_GERAL);
        this.setVisible(true);

        rootPanel.setLayout(new BorderLayout());
        this.add(rootPanel);

        JPanel pageStartPanel = new JPanel();
        pageStartPanel.add(new Entrada());


        JPanel lineStartPanel = new JPanel();
        lineStartPanel.add(new EscalaEntrada());

        JPanel lineEndPanel = new JPanel();
        lineEndPanel.add(new EscalaSaida());

        JPanel pageEndPanel = new JPanel();
        pageEndPanel.add(new BotoesAcao());

        JPanel centerPanel = new JPanel();
        centerPanel.add(new CenterPanel());

        rootPanel.add(pageStartPanel, BorderLayout.PAGE_START);
        rootPanel.add(lineStartPanel,BorderLayout.LINE_START);
        rootPanel.add(lineEndPanel, BorderLayout.LINE_END);
        rootPanel.add(pageEndPanel, BorderLayout.PAGE_END);
        rootPanel.add(centerPanel, BorderLayout.CENTER);
    }
}
