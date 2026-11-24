package guia1;

import javax.swing.JOptionPane;
/*
Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.
*/

public class Ejercicio10 {

    public void CalcularIMC() {

        double peso;
        double altura;

        JOptionPane.showMessageDialog(null,
                "==========================================\n" +
                        "== Ingreso al Ejercicio 10 de la Guia 1 ==\n" +
                        "==========================================");

        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kg:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Altura en M:"));

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        } else {
            JOptionPane.showMessageDialog(null, "Obesidad");
        }
    }

}
