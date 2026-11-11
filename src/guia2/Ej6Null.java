package guia2;

import javax.swing.JOptionPane;
public class Ej6Null {
    public static void main(String [] args) {
        String nombre = JOptionPane.showInputDialog(
            "Escribe tu nombre: ");
            if(nombre == null || nombre.isBlank()){
                 JOptionPane.showMessageDialog(null, "Cancelaste la operacion o no rellenaste el campo requerido.");
            } else {
                 JOptionPane.showMessageDialog(null, "Hola, "+nombre.toUpperCase() + "!");
            }
    }
}
