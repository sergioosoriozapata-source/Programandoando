package guia1;

import javax.swing.JOptionPane ;

public class Ejercicio2 {

    public void IngresoDatos () {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero: "));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Su numero es par: " + numero);
        } else if (numero % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Su numero es impar: " + numero);
        } else {
            JOptionPane.showMessageDialog(null, "Su numero es cero.");
        }

        JOptionPane.showMessageDialog(null, "Su numero es: " + numero);
    }
}