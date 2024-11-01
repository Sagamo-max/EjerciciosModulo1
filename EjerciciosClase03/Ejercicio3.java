package EjerciciosClase03;

import java.util.Scanner;

    /* Escriba un programa que permita ingresar un número e identificar 
    si es par o impar.*/

public class Ejercicio3 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero para comprobar si es par o impar: ");
        var numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        scanner.close();

    }
}
