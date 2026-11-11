package guia2;

import javax.swing.JOptionPane;

public class Ej4Arreglo {
    public static void main(String[] args){
        String[] nombres = {"Ana","Luis","Maria","Pedro", "Sofia"};
        try {
            int i = Integer.parseInt(
                JOptionPane.showInputDialog("Posicion (0 a "+(nombres.length - 1)+"):"));
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