package guia1;

/*
Calcular la suma de los numeros del 1 al 100 usando un ciclo for.
*/

public class Ejercicio15 {
    
    public void Suma () {

        System.out.println ("==========================================") ;
        System.out.println ("== Ingreso al Ejercicio 15 de la Guia 1 ==") ;
        System.out.println ("==========================================") ;

        int suma = 0 ;

        for (int i = 1 ; i <= 100 ; i ++){
            suma += i ;
        }

        System.out.println ("La suma de los numeros del 1 al 100 es -> " + suma);
    }
}
