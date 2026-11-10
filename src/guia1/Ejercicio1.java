package guia1 ;

import javax.swing.JOptionPane ; 

/*
Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else.
*/

public class Ejercicio1 {

    public void NumeroEntero () {

        System.out.println ("=========================================") ;
        System.out.println ("== Ingreso al Ejercicio 1 de la Guia 1 ==") ;
        System.out.println ("=========================================") ;

        int numero = Integer.parseInt (JOptionPane.showInputDialog (null, 
            "Ingrese un numero, para saber si es positivo, negativo o cero -> ")) ;

        if (numero > 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + ", es positivo.") ;
        }else if (numero < 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + ", es negativo.") ;
        }else {
            JOptionPane.showMessageDialog(null, "El numero es Cero.") ;
        }
    }
}