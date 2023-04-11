package gui;

import javax.swing.*;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;
import java.awt.*;

public class Conversor extends JFrame {

    private JButton btnReset;
    private JPanel eastPanel;
    private ButtonGroup radioBtnGroupSaida;
    private JRadioButton radBTnSaiKelvin;
    private JRadioButton radBTnSaiFahrenheit;
    private JRadioButton radBTnSaiCelsius;
    private ButtonGroup radioBtnGroupEntrada;
    private JRadioButton radBTnEntKelvin;
    private JRadioButton radBTnEntFahrenheit;
    private JRadioButton radBTnEntCelsius;
    private JTextField TFsaida;
    private JButton btnConverter;
    private JTextField TFtexto;
    private JTextField TFEntrada;
    private JPanel rootPanel;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel southPanel;
    private JPanel centerPanel;

    JLabel labelEntrada;
    public Conversor() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650,325);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        this.rootPanel = new JPanel();
        this.northPanel = new JPanel();
        this.eastPanel = new JPanel();
        this.westPanel = new JPanel();
        this.southPanel = new JPanel();
        this.centerPanel = new JPanel();
        this.centerPanel.setBackground(new Color(211, 211, 211));

        this.labelEntrada = new JLabel("Entrada");
        this.TFEntrada = new JTextField(10);
        this.TFtexto = new JTextField("Aula Pratica\n Converson de temperaturas");
        this.TFtexto.setEditable(false);

        this.btnConverter = new JButton("Coinverter");
        this.btnConverter.addActionListener( e -> converter());
        this.btnReset = new JButton("Reset");
        this.btnReset.addActionListener( e -> reset());
        this.TFsaida = new JTextField(10);
        this.TFsaida.setEditable(false);

        this.radBTnEntCelsius = new JRadioButton("Celsius");
        this.radBTnEntFahrenheit = new JRadioButton("Fahrenheit");
        this.radBTnEntKelvin = new JRadioButton("Kelvin");
        this.radBTnEntCelsius.setSelected(true);

        this.radioBtnGroupEntrada = new ButtonGroup();
        this.radioBtnGroupEntrada.add(radBTnEntCelsius);
        this.radioBtnGroupEntrada.add(radBTnEntFahrenheit);
        this.radioBtnGroupEntrada.add(radBTnEntKelvin);

        this.radBTnSaiCelsius = new JRadioButton("Celsius");
        this.radBTnSaiFahrenheit = new JRadioButton("Fahrenheit");
        this.radBTnSaiKelvin = new JRadioButton("Kelvin");
        this.radBTnSaiCelsius.setSelected(true);

        this.radioBtnGroupSaida = new ButtonGroup();
        this.radioBtnGroupSaida.add(radBTnSaiCelsius);
        this.radioBtnGroupSaida.add(radBTnSaiFahrenheit);
        this.radioBtnGroupSaida.add(radBTnSaiKelvin);

        montarLayout();
        this.setVisible(true);

    }

    private void reset() {
        this.TFEntrada.setText("");
        this.TFsaida.setText("");
        this.radBTnEntCelsius.setSelected(true);
        this.radBTnSaiCelsius.setSelected(true);
    }

    private void montarLayout(){
        this.northPanel.add(labelEntrada);
        this.northPanel.add(TFEntrada);

        this.westPanel.setLayout(new GridLayout(4,1));
        this.westPanel.setBorder(BorderFactory.createTitledBorder("Entrada"));
        this.westPanel.add(radBTnEntCelsius);
        this.westPanel.add(radBTnEntFahrenheit);
        this.westPanel.add(radBTnEntKelvin);

        this.eastPanel.setLayout(new GridLayout(4,1));
        this.westPanel.setBorder(BorderFactory.createTitledBorder("Saida"));
        this.eastPanel.add(radBTnSaiCelsius);
        this.eastPanel.add(radBTnSaiFahrenheit);
        this.eastPanel.add(radBTnSaiKelvin);

        this.southPanel.add(btnConverter);
        this.southPanel.add(btnReset);
        this.southPanel.add(TFsaida);

        this.centerPanel.add(TFtexto);

        this.rootPanel.setLayout(new BorderLayout());
        this.rootPanel.add(northPanel,BorderLayout.NORTH);
        this.rootPanel.add(westPanel,BorderLayout.WEST);
        this.rootPanel.add(eastPanel,BorderLayout.EAST);
        this.rootPanel.add(southPanel,BorderLayout.SOUTH);
        this.rootPanel.add(centerPanel,BorderLayout.CENTER);

        this.rootPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        this.setContentPane(rootPanel);


    }

    private void converter() {
        try {
            String entrada = TFEntrada.getText().trim();
            validarTemperatura(entrada);

            double valor = Double.parseDouble(entrada);

            if (radBTnEntCelsius.isSelected()) {
                if (radBTnSaiFahrenheit.isSelected()) {
                    valor = (9.0/5.0 * valor) + 32;
                } else if (radBTnSaiKelvin.isSelected()) {
                    valor = valor + 273.15;
                }
            } else if (radBTnEntFahrenheit.isSelected()) {
                if (radBTnSaiCelsius.isSelected()) {
                    valor = 5.0/9.0 * (valor - 32);
                } else if (radBTnSaiKelvin.isSelected()) {
                    valor = 5.0/9.0 * (valor - 32) + 273.15;
                }
            } else if (radBTnEntKelvin.isSelected()) {
                if (radBTnSaiCelsius.isSelected()) {
                    valor = valor - 273.15;
                } else if (radBTnSaiFahrenheit.isSelected()) {
                    valor = 9.0/5.0 * (valor - 273.15) + 32;
                }
            }

            TFsaida.setText(String.format("%.2f", valor));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite uma temperatura válida!");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void validarTemperatura(String temperatura) throws IllegalArgumentException {
        double valor = Double.parseDouble(temperatura);

        if (radBTnEntCelsius.isSelected())
                valor = valor + 273.15;

        if(radBTnEntFahrenheit.isSelected())
            valor = 5.0/9.0 * (valor - 32) + 273.15;

        if (valor < 0)
            throw new IllegalArgumentException("A temperatura de entrada não pode ser menor que zero kelvin!");
    }

}
