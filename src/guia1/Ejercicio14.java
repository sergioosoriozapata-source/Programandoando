package guia1;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public void NumerosImpares() {
        int numeroActual = 1;
        String resultado = "";

        while (numeroActual <= 100) {
            if (numeroActual % 2 != 0) {
                resultado += numeroActual + " ";

                // salto de línea cada 10 números para que la ventana no sea muy ancha
                if (numeroActual % 10 == 9) {
                    resultado += "\n";
                }
            }
            numeroActual++;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
