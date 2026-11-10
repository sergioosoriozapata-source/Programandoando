package guia1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa el precio: ");
        double precio = sc.nextDouble();
        double descuento = 0;
        double total = 0;

        if (precio > 500000) {
            descuento = precio * 0.20;
            total = precio - descuento;
            System.out.println("al precio $" + (int)precio + ", se le aplica descuento: 20% y el total seria: " + (int)total);
        } else if (precio > 200000) {
            descuento = precio * 0.15;
            total = precio - descuento;
            System.out.println("al precio $" + (int)precio + ", se le aplica descuento: 15% y el total seria: " + (int)total);
        } else if (precio > 100000) {
            descuento = precio * 0.10;
            total = precio - descuento;
            System.out.println("al precio $" + (int)precio + ", se le aplica descuento: 10% y el total seria: " + (int)total);
        }
        
        sc.close();
    }
}