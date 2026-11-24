package guia1;

import javax.swing.JOptionPane;

public class Ejercicio22 {
	public void ArregloDe10Numeros() {
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, numeros[i]);
        }
	}
}
