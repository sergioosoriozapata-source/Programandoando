package guia1;

import javax.swing.JOptionPane;

public class Ejercicio19 {
	
	public void NumerosMultiples() {
		int cantidad = 0;

        for (int numero = 1; numero <= 200; numero++) {
            if (numero % 10 == 0) {
                cantidad++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de múltiplos de 10: " + cantidad);
	}
}
    