package guia1;

/*
Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados.
*/

public class Ejercicio18 {
    
    public void TablaMultiplicar () {

        System.out.println ("==========================================") ;
        System.out.println ("== Ingreso al Ejercicio 18 de la Guia 1 ==") ;
        System.out.println ("==========================================") ;

        for (int y = 1 ; y <= 10 ; y ++) {

            System.out.println ("\n -- Tabla de multiplicar del " + y + " --");

            for (int i = 1 ; i <= 10 ; i ++){
            System.out.println( y + " x " + i + " = " + (y * i));
        }
            System.out.println ("-------------------------------------------");
        }
    }
}
