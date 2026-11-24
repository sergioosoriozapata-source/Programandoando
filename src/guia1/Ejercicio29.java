package guia1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public void CaracterDeUnaCadena() {
        String cadena = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto: ");
        String resultado = "";

        for (char c : cadena.toCharArray()){
            resultado += c + "\n";
        }
        JOptionPane.showMessageDialog(null, "Cadena inicial: " + cadena + "\n" + "Carácter por carácter:\n" + resultado);
    }
}
