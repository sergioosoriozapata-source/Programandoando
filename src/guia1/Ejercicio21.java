package guia1;

import java.util.Scanner;

/*
Calcular el factorial de un numero almacenado en una variable usando un ciclo for.
*/

public class Ejercicio21 {
    
    public void Factorial() {

        System.out.println ("==========================================") ;
        System.out.println ("== Ingreso al Ejercicio 21 de la Guia 1 ==") ;
        System.out.println ("==========================================") ;

        Scanner scanner = new Scanner(System.in) ;

        System.out.println ("Ingrese el numero para sacar su factorial -> ") ;
        int NumeroFactorial= scanner.nextInt() ;
        
        int Resultado = 1 ;

        for(int i = 1 ; i <= NumeroFactorial ; i ++){
            Resultado *= i ;
        }
        System.out.println("El factorial de " + NumeroFactorial + " es -> " + Resultado) ;

        scanner.close() ;
    }
}
