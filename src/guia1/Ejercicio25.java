package guia1;

import javax.swing.JOptionPane;

public class Ejercicio25{
    public void NumeroMenor(){
        int[] numeros = {2,4,6,8,10,12,14};

        int menor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
          JOptionPane.showMessageDialog(null,"El número menor del arreglo es: " + menor);
    }
}
