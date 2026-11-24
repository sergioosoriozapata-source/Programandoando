package guia2;

import javax.swing.JOptionPane;

/*
Objetivo -> Combinar try-catch con while para repetir la entrada hasta que sea válida.
Excepciónes trabajadas -> NumberFormatException | IllegalArgumentException.

El programa pide un número entre 1 y 100. Si el usuario ingresa texto o un número fuera de rango, 
el cuadro de diálogo se muestra de nuevo hasta que el dato sea correcto. Este patrón simula la validación real de formularios.
*/

public class Ejercicio5 {

    public void ValidacionConWhile() {

        int numero = 0;
        boolean valido = false;

        JOptionPane.showMessageDialog(null,
                "=========================================\n" +
                "== Ingreso al Ejercicio 5 de la Guia 2 ==\n" +
                "=========================================");

        while (!valido) {

            try {

                String entrada = JOptionPane.showInputDialog("Numero entre 1 y 100:");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return; 
                }

                numero = Integer.parseInt(entrada);

                if (numero < 1 || numero > 100)
                    throw new IllegalArgumentException("Fuera de rango");

                valido = true;

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null,
                        "Solo numeros enteros. Intenta de nuevo.");

            } catch (IllegalArgumentException e) {

                JOptionPane.showMessageDialog(null,
                        "El numero debe estar entre 1 y 100.");
            }
        }
        JOptionPane.showMessageDialog(null,
                "Numero aceptado: " + numero);

    }

}
