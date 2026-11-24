package guia2;
import javax.swing.JOptionPane;

public class guia2Main {
    public void Guia2() {

        int opcion = pedirOpcion(
                "Ingresando a los Ejercicios De la guia 2 \n" +
                "1.Ejercicios Try Catch \n" +
                "2.Ingresando A Ejercicios Con Base De Datos");

        if (opcion == 1) {

            opcion = pedirOpcion(
                "============================================== \n"+
                "== Ingresando a los ejercicios de Try Catch == \n"+
                "============================================== \n"+
                "1. División entera básica \n"+
                "2. Conversión de temperatura \n"+
                "3. Calculadora de IMC \n"+
                "4. Acceso a arreglo por índice \n"+
                "5. Validación con bucle (retry) \n"+
                "6. Cancelación del diálogo (NullPointerException) \n"+
                "Ingrese la opcion deseada -> \n"+
                "\n"
            );

            if (opcion == -1) return;

            switch (opcion) {

                case 1:
                    Ejercicio1 ej1 = new Ejercicio1();
                    ej1.DivisionEnteraBasica();
                    break;

                case 2:
                    Ejercicio2 ej2 = new Ejercicio2();
                    ej2.ConversionTemperatura();
                    break;

                case 3:
                    Ejercicio3 ej3 = new Ejercicio3();
                    ej3.IMC();
                    break;

                case 4:
                    Ejercicio4 ej4 = new Ejercicio4();
                    ej4.PosicionNombre();
                    break;

                case 5:
                    Ejercicio5 ej5 = new Ejercicio5();
                    ej5.ValidacionConWhile();
                    break;

                case 6:
                    Ejercicio6 ej6 = new Ejercicio6();
                    ej6.CampoNombre();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } else if (opcion == 2) {
            MainPersistenciaData BaseDatos = new MainPersistenciaData();
            BaseDatos.MenuBaseDeDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida. Debe ingresar 1 o 2.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Devuelve la opción ingresada o -1 si cancelan o escriben algo inválido
    private int pedirOpcion(String mensaje) {
        String entrada = JOptionPane.showInputDialog(null, mensaje);
        if (entrada == null) return -1;

        try {
            return Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
}
