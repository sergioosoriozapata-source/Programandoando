package guia1;


public class Ejercicio26{
    public static void main(String[] args){
        int[] numeros = {1,23,1,34,1,56};
        int numeroBuscado = 1;

        int contador = 0;

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] == numeroBuscado){
                contador++;
            }
        }
        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el arreglo.");
    }
}