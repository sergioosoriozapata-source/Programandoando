package guia1;

import javax.swing.JOptionPane;
/*
Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.
*/

public class Ejercicio4 {

    public void Calculadora() {

        JOptionPane.showMessageDialog(null,
                "=========================================\n" +
                        "== Ingreso al Ejercicio 4 de la Guia 1 ==\n" +
                        "=========================================");

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero, para la calculadora:"));
        double num2 = Double
                .parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero, para la calculadora:"));

        String inputOp = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar (+, -, *, /):");
        char operacion = inputOp.charAt(0);

        double resultado = 0;
        boolean valida = true;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Error: No es posible dividir entre cero.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    valida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                valida = false;
                break;
        }

        if (valida) {
            JOptionPane.showMessageDialog(null, "El resultado es -> " + resultado);
        }
    }

}
