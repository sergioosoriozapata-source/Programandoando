package guia1;


public class Ejercicio25{
    public static void main(String[] args){
        int[] numeros = {2,4,6,8,10,12,14};

        int menor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El número menor del arreglo es: " + menor);
    }
}
