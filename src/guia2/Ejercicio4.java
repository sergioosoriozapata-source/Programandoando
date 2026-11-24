package guia2;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public  void PosicionNombre(){
        String[] nombres = {"Ana","Luis","Maria","Pedro", "Sofia"};

        String entrada = JOptionPane.showInputDialog(
                "Posicion (0 a "+(nombres.length - 1)+"):");
        if (entrada == null) return;

        try {
            int i = Integer.parseInt(entrada.trim());
            JOptionPane.showMessageDialog(null,
                    "Nombre: "+ nombres[i]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "ingresa un numero entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,
            "Posicion invalida. solo existen posiciones 0 a "+ (nombres.length - 1));
        }
    }
}
