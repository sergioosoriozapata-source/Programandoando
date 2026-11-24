package guia1;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public void MayorDeTresNumeros() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num3:"));

        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Los tres números son iguales.");
        } else if (num1 == num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "Empate entre num1 y num2. El mayor es: " + num1);
        } else if (num1 == num3 && num1 > num2) {
            JOptionPane.showMessageDialog(null, "Empate entre num1 y num3. El mayor es: " + num1);
        } else if (num2 == num3 && num2 > num1) {
            JOptionPane.showMessageDialog(null, "Empate entre num2 y num3. El mayor es: " + num2);
        } else if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El mayor es num1: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "El mayor es num2: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es num3: " + num3);
        }
    }
}
