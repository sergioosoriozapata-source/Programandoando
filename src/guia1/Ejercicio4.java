package guia1;

import java.util.Scanner ;

/*
Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.
*/

public class Ejercicio4 {

    public void Calculadora () {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println ("=========================================") ;
        System.out.println ("== Ingreso al Ejercicio 4 de la Guia 1 ==") ;
        System.out.println ("=========================================") ;

        System.out.print ("Ingrese el primer numero, para la calculadora -> ") ;
        double num1 = scanner.nextDouble();

        System.out.print ("Ingrese el segundo numero, para la calculadora -> ") ;
        double num2 = scanner.nextDouble();

        System.out.print ("Ingrese la operacion que desea realizar (+, -, *, /) -> ") ;
        char operacion = scanner.next().charAt(0);
        
        double resultado = 0 ;
        boolean valida = true ;

        switch (operacion) {
            case '+':
                resultado = num1 + num2 ;
                break ;

            case '-':
                resultado = num1 - num2 ;
                break ;

            case '*':
                resultado = num1 * num2 ;
                break ;
            
            case '/':
                if (num2 == 0){
                    System.out.println("Error: No es posible dividir entre cero.") ;
                    valida = false ;
                }else {
                    resultado = num1 / num2 ;
                }
                break ;
        
            default:
                System.out.println("Operación no válida.") ;
                valida = false;
                break ;
        }

        if (valida) {
            System.out.println("El resultado es -> " + resultado);
        }
        scanner.close();
    }

}
