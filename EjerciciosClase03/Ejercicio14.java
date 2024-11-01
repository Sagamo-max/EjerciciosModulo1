package EjerciciosClase03;

import java.util.Scanner;

/* Realice un programa en el que ingrese un número y muestre el cubo. 
Repita el proceso hasta que se introduzca un valor negativo.*/

public class Ejercicio14 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numero = 0;

        while (numero >= 0) {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            System.out.println("El cubo de " + numero + " es " + Math.pow(numero, 3));
        }

        System.out.println("Ha ingresado un numero negativo. El programa ha finalizado.");

        scanner.close();
    }
}
