package EjerciciosClase03;

import java.util.Scanner;

/* Escriba un programa que le permita ingresar tres números e imprima 
    en la consola el más grande de ellos.*/

public class Ejercicio2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        var numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        var numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mas grande es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mas grande es: " + numero2);
        } else {
            System.out.println("El numero mas grande es: " + numero3);
        }

        scanner.close();

    }
}
