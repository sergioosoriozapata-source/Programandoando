package guia1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio24 {
    public void NumeroMayorEnUnArray(){
        int[] numeros = {12, 34, 7, 45, 22, 19, 50, 3, 28, 41};
        String numerosString = Arrays.toString(numeros);
        int numeroMayor = 0;

        for (int n : numeros){
            if (n > numeroMayor){
                numeroMayor = n;
            }
        }
        JOptionPane.showMessageDialog(null, "Array: " + numerosString+ "\n" + "Número mayor: " + numeroMayor);
    }
    
}
