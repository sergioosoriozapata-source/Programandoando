package guia1;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

/*
Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados.
*/

public class Ejercicio18 {
    
    public void TablaMultiplicar () {

        JOptionPane.showMessageDialog(null, 
            "==========================================\n" +
            "== Ingreso al Ejercicio 18 de la Guia 1 ==\n" +
            "==========================================");

        StringBuilder resultado = new StringBuilder();

        for (int y = 1; y <= 10; y++) {
            resultado.append(" -- Tabla de multiplicar del ").append(y).append(" --\n");

            for (int i = 1; i <= 10; i++) {
                resultado.append(y).append(" x ").append(i).append(" = ").append(y * i).append("\n");
            }
            resultado.append("-------------------------------------------\n\n");
        }

        JTextArea textArea = new JTextArea(resultado.toString());
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(320, 400));

        JOptionPane.showMessageDialog(null, scrollPane, "Tablas de Multiplicar (1 al 10)", JOptionPane.INFORMATION_MESSAGE);
    }
}
