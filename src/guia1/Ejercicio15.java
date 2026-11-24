package guia1;

import javax.swing.JOptionPane;

/*
Calcular la suma de los numeros del 1 al 100 usando un ciclo for.
*/

public class Ejercicio15 {
    
    public void Suma () {

        JOptionPane.showMessageDialog(null, 
            "==========================================\n" +
            "== Ingreso al Ejercicio 15 de la Guia 1 ==\n" +
            "==========================================");

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        JOptionPane.showMessageDialog(null, 
            "La suma de los numeros del 1 al 100 es -> " + suma, 
            "Resultado", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
