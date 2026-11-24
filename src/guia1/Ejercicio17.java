package guia1;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public void TablaMultiplicar() {
        String resultado = "-- TABLA DE MULTIPLICACI├ôN --\n";
        
        for (int i = 0; i <= 10; i++) {
            int calc = 7 * i;
            resultado += "7 x " + i + " = " + calc + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
