package src;
import javax.swing.JOptionPane;

import src.guia1.guiaMain;
import src.guia2.guia2Main;

public class Main {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido A Programando Ando \n" +
                        "Aqui Aprenderas Java  \n" +
                        "Ingrese una opcion para El Programa\n" +
                        "1.Ejercicio Guia 1\n" +
                        "2.Ejercicios Guia 2\n"));


        if (opcion == 1) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            guiaMain guia1 = new guiaMain();
            guia1.Guia1();
        }
         if (opcion == 2) {
            System.out.println("Ingresando A Ejercicios Guia 2");
            guia2Main guia2 = new guia2Main();
            guia2.Guia2();
        }
    }
}
