package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar un número real e identifique si el 
    número es negativo, positivo o cero. */

public class Ejercicio1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero real: ");
        var numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
        scanner.close();
    }
}