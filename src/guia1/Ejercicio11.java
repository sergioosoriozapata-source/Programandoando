package guia1;

import javax.swing.JOptionPane;
/*
Imprimir los numeros del 1 al 50 usando un ciclo for.
*/

public class Ejercicio11 {

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, 
            "==========================================\n" +
            "== Ingreso al Ejercicio 11 de la Guia 1 ==\n" +
            "==========================================");

        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 50; i++) {
            resultado.append(i);
            
            if (i < 50) {
                resultado.append(i % 10 == 0 ? "\n" : ", ");
            }
        } 

        JOptionPane.showMessageDialog(null, resultado.toString(), "Números del 1 al 50", JOptionPane.INFORMATION_MESSAGE);
    }
}

