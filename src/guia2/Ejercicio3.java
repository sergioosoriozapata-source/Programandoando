package guia2;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public void IMC() {
        String entradaPeso = JOptionPane.showInputDialog("Peso (kg):");
        if (entradaPeso == null) return;

        String entradaAltura = JOptionPane.showInputDialog("Estatura (m):");
        if (entradaAltura == null) return;

        try {
            double peso = Double.parseDouble(entradaPeso.trim());
            double altura = Double.parseDouble(entradaAltura.trim());
            if (altura == 0)
                throw new ArithmeticException("La estatura no puede ser 0");
            double imc = peso / (altura * altura);
            JOptionPane.showMessageDialog(null,
                    "IMC: " + String.format("%.2f", imc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Dato invalido. Usa punto decimal. Ej: 1.70");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
