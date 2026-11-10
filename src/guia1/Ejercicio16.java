package guia1;


public class Ejercicio16{
    public static void main(String[] args){
        int suma = 0;
        for(int i = 1; i <= 50; i += 2){
            suma += i;
        }
        
        System.out.println("La suma de los números impares del 1 al 50 es: " + suma);
    }
}