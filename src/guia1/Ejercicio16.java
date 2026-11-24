package guia1;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public void SumaImpar() {
        int suma = 0;
        
        for (int i = 1; i <= 50; i += 2) {
            suma += i;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los n├║meros impares del 1 al 50 es: " + suma);
    }
}
