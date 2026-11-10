package guia1;

import java.util.Scanner;

/*
Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.
*/

public class Ejercicio10 {

    public void CalcularIMC() {

        double peso;
        double altura;

        Scanner scanner = new Scanner(System.in) ;

        System.out.println ("==========================================") ;
        System.out.println ("== Ingreso al Ejercicio 10 de la Guia 1 ==") ;
        System.out.println ("==========================================") ;
                
        System.out.println("Ingrese su peso en Kg") ;
        peso = scanner.nextDouble() ;

        System.out.println("Ingrese su Altura en M") ;
        altura = scanner.nextDouble() ;

        double IMC = peso / (altura * altura) ;

        if (IMC < 18.5) {
            System.out.println("Bajo peso") ;
        }else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Normal") ;
        }else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso") ;
        }else {
            System.out.println("Obesidad") ;
        }
        scanner.close();
    }

}
