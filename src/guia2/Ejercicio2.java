package guia2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public void ConversionTemperatura() {
        String entrada = JOptionPane.showInputDialog("Temperatura en Celsius:");
        if (entrada == null) return;

        try {
            double c = Double.parseDouble(entrada.trim());
            double f = (c * 9.0 / 5) + 32;
            JOptionPane.showMessageDialog(null,
                    c + "C = " + f + "F");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ingresa un numero valido. Ejemplo: 36.5");
        }
    }

}
