package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa en el que ingrese un número y le diga si es positivo o negativo.
Repita el proceso hasta que se ingrese el número cero. */

public class Ejercicio15 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numero = 1;

        while (numero != 0) {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El numero es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {}
        }

        System.out.println("Ha ingresado el numero cero. El programa ha finalizado.");

        scanner.close();
    }
}
