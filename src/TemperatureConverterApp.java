import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterApp extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton convertButton;
    private JComboBox<String> scaleComboBox;
    private JRadioButton toCelsiusButton, fromCelsiusButton;
    
    public TemperatureConverterApp() {

        setTitle("Temperature Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        inputField = new JTextField(10);
        resultLabel = new JLabel("Masukkan suhu dan pilih konversi");
        convertButton = new JButton("Konversi");


        String[] scales = {"Fahrenheit", "Kelvin", "Reamur"};
        scaleComboBox = new JComboBox<>(scales);
        

        toCelsiusButton = new JRadioButton("To Celsius");
        fromCelsiusButton = new JRadioButton("From Celsius", true);
        ButtonGroup group = new ButtonGroup();
        group.add(toCelsiusButton);
        group.add(fromCelsiusButton);


        JPanel radioPanel = new JPanel();
        radioPanel.add(fromCelsiusButton);
        radioPanel.add(toCelsiusButton);
        

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Suhu: "));
        inputPanel.add(inputField);
        inputPanel.add(new JLabel("Konversi ke: "));
        inputPanel.add(scaleComboBox);
        

        add(inputPanel, BorderLayout.NORTH);
        add(radioPanel, BorderLayout.CENTER);
        add(convertButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.SOUTH);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });


        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
            }
        });


        inputField.addCaretListener(e -> convertTemperature());
    }


    private void convertTemperature() {
        String inputText = inputField.getText();
        if (inputText.isEmpty()) {
            resultLabel.setText("Masukkan suhu terlebih dahulu");
            return;
        }

        try {
            double inputTemp = Double.parseDouble(inputText);
            String targetScale = (String) scaleComboBox.getSelectedItem();
            double resultTemp;

            if (fromCelsiusButton.isSelected()) {
                switch (targetScale) {
                    case "Fahrenheit":
                        resultTemp = inputTemp * 9 / 5 + 32;
                        break;
                    case "Kelvin":
                        resultTemp = inputTemp + 273.15;
                        break;
                    case "Reamur":
                        resultTemp = inputTemp * 4 / 5;
                        break;
                    default:
                        resultTemp = inputTemp;
                }
            } else {
                switch (targetScale) {
                    case "Fahrenheit":
                        resultTemp = (inputTemp - 32) * 5 / 9;
                        break;
                    case "Kelvin":
                        resultTemp = inputTemp - 273.15;
                        break;
                    case "Reamur":
                        resultTemp = inputTemp * 5 / 4;
                        break;
                    default:
                        resultTemp = inputTemp;
                }
            }

            resultLabel.setText("Hasil Konversi: " + resultTemp + " °" + targetScale);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConverterApp().setVisible(true));
    }
}
