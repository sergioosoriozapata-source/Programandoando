package guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public void ValidarEdad() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "));

        if (edad >= 0) {
            if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Puede ingresar");
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Edad invalida");
        }
    }
}
