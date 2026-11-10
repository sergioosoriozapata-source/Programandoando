package src.guia1;
import javax.swing.JOptionPane;

public class guiaMain {
    public void Guia1() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido a lista de ejercicios Guia 1 \n" +
                        "1.Ejercicios Estructuras Condicionales\n" +
                        "2.Ejercicios practicos: ciclos for, while y arreglos.\n" +
                        "Ingrese una opción de Ejercicio\n"));

        if (opcion == 1) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "1.ejercicio Estructuras Condicionales \n " +
                                    "Lista de Ejercicios: \n" +
                                    "1. Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else. \n"
                                    +
                                    "2. Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%). \n"
                                    +
                                    "3. Pida la edad del usuario. Si es >= 18 mostrar 'Puede ingresar', si es menor 'Acceso denegado', si es negativa 'Edad invalida'. \n"
                                    +
                                    "4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero. \n"
                                    +
                                    "5. Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400. \n"
                                    +
                                    "6. Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango. \n"
                                    +
                                    "7. Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo. \n"
                                    +
                                    "8. Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total. \n"
                                    +
                                    "9. Simule un login: usuario correcto 'admin', contrasena '1234'. Si coinciden mostrar 'Bienvenido', si no 'Credenciales incorrectas'. Use equals(). \n"
                                    +
                                    "10. Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad. \n"
                                    +
                                    "Ingrese una opcion: \n" +
                                    "\n")

            );
            // ====================== Ejecución ejercicios ======================
            // Acá se debe de poner el caso y la opción de ejercicio siguiendo la estructura
            // de abajo.
            // Es cosa de copiar y pegar lo de abajo según el ejercicio reemplazando el
            // numero y ya.
            // El metodo que se llama se deberá de definir al final del archivo.
            // =================================================================
            switch (opcion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
                    break;
            }

        } else if (opcion == 2) {

            System.out.println("Ingrese una opcion ");

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "2.Ejercicios practicos: ciclos for, while y arreglos. \n " +
                                    "11. Imprimir los numeros del 1 al 50 usando un ciclo for. \n"
                                    +
                                    "12. Mostrar los numeros del 50 al 1 usando un ciclo for. \n"
                                    +
                                    "13. Imprimir todos los numeros pares del 1 al 100 usando un ciclo for. \n"
                                    +
                                    "14. Imprimir todos los numeros impares del 1 al 100 usando un ciclo while. \n"
                                    +
                                    "15. Calcular la suma de los numeros del 1 al 100 usando un ciclo for. \n"
                                    +
                                    "16. Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for. \n"
                                    +
                                    "17. Mostrar la tabla de multiplicar del numero 7 usando un ciclo for. \n"
                                    +
                                    "18. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados. \n"
                                    +
                                    "19. Contar cuantos numeros del 1 al 200 son multiples de 10 usando un ciclo for. \n"
                                    +
                                    "20. Mostrar los numeros del 1 al 100 que sean divisibles entre 3 Y entre 5 simultaneamente. \n"
                                    +
                                    "21. Calcular el factorial de un numero almacenado en una variable usando un ciclo for. \n"
                                    +
                                    "22. Declarar un arreglo de 10 numeros e imprimir cada elemento usando un ciclo for. \n"
                                    +
                                    "23. Calcular la suma de todos los elementos de un arreglo usando un ciclo for. \n"
                                    +
                                    "24. Encontrar el numero mayor dentro de un arreglo usando un ciclo for. \n"
                                    +
                                    "25. Encontrar el numero menor dentro de un arreglo usando un ciclo for. \n"
                                    +
                                    "26. Contar cuantas veces aparece un numero especifico dentro de un arreglo. \n"
                                    +
                                    "27. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados. \n"
                                    +
                                    "28. Mostrar los primeros 20 numeros y su cubo (n^3) usando un ciclo for. \n"
                                    +
                                    "29. Recorrer una cadena de texto e imprimir cada caracter en una linea usando un ciclo for. \n"
                                    +
                                    "Ingrese una opcion\n" +
                                    "\n")

            );

            // ====================== Ejecución ejercicios ======================
            // Acá se debe de poner el caso y la opción de ejercicio siguiendo la estructura
            // de abajo.
            // Es cosa de copiar y pegar lo de abajo según el ejercicio reemplazando el
            // numero y ya.
            // El metodo que se llama se deberá de definir al final del archivo.
            // =================================================================
            switch (opcion) {
                case 11:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 1");
                    // Ejercicio11();
                    break;
                case 12:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 2");
                    // Ejercicio12();
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
                    break;
            }

        } else {
            JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
        }

    }

    // ====================== Invocar ejercicios ======================
    // Aquí se invocan los ejercicios atravez de métodos.
    // Es solo copiar y pegar el método, cambiar el nombre y al método al que accede
    // (TablaDel7.TablaMultiplicarDel7()).
    // ================================================================
    public void Ejercicio1() {
        // Ejercicio1 TablaDel7 = new Ejercicio1();
        // TablaDel7.TablaMultiplicarDel7();
    }

    public void Ejercicio2() {
        // Ejercicio2 FactorialDeUnNumero = new Ejercicio2();
        // FactorialDeUnNumero.FactorialDeUnNumero();
    }
}
