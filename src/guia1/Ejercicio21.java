package guia1;

import javax.swing.JOptionPane;

/*
Calcular el factorial de un numero almacenado en una variable usando un ciclo for.
*/

public class Ejercicio21 {
    
    public void Factorial() {

        JOptionPane.showMessageDialog(null, 
            "==========================================\n" +
            "== Ingreso al Ejercicio 21 de la Guia 1 ==\n" +
            "==========================================");

        int numeroFactorial = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el numero para sacar su factorial:")
        );
        
        int resultado = 1;

        for (int i = 1; i <= numeroFactorial; i++) {
            resultado *= i;
        }

        JOptionPane.showMessageDialog(null, 
            "El factorial de " + numeroFactorial + " es -> " + resultado, 
            "Resultado Factorial", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
