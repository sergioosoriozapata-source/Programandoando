import javax.swing.JOptionPane;
import guia1.guiaMain;
import guia2.guia2Main;

public class Main {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Bienvenido A Programando Ando \n" +
                "Aqui Aprenderas Java  \n" +
                "Ingrese una opcion para El Programa\n" +
                "1.Ejercicio Guia 1\n" +
                "2.Ejercicios Guia 2\n");

        if (entrada == null) return;

        int opcion;
        try {
            opcion = Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 2.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (opcion == 1) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            guiaMain guia1 = new guiaMain();
            guia1.Guia1();
        } else if (opcion == 2) {
            System.out.println("Ingresando A Ejercicios Guia 2");
            guia2Main guia2 = new guia2Main();
            guia2.Guia2();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida. Debe ingresar 1 o 2.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
