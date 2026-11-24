package guia1;

import javax.swing.JOptionPane;

/*
Mostrar los numeros del 50 al 1 usando un ciclo for.
*/

public class Ejercicio12 {
    
    public void ImprimirAlRevez () {

        JOptionPane.showMessageDialog(null, 
            "==========================================\n" +
            "== Ingreso al Ejercicio 12 de la Guia 1 ==\n" +
            "==========================================");

        StringBuilder resultado = new StringBuilder();

        for (int i = 50; i >= 1; i--) {
            resultado.append(i);
            
            // Coma y espacio, con salto de línea cada 10 números (41, 31, 21, 11)
            if (i > 1) {
                resultado.append((i - 1) % 10 == 0 ? "\n" : ", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString(), "Números del 50 al 1", JOptionPane.INFORMATION_MESSAGE);
    }
}
