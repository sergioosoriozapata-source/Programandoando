package guia1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public void SumarNumerosDeUnArreglo(){
        int[] numeros = {2, 5, 8, 1, 4};
        String stringArrayNumeros = Arrays.toString(numeros);
        int resultado = 0;

        for (int n : numeros){
            resultado += n;
        }
        JOptionPane.showMessageDialog(null, "Array: " + stringArrayNumeros + "\n" + "Suma total: " + resultado);
    }
}
