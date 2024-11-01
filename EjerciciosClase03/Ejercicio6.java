package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar un número y determine si es 
divisible por dos y siete. */

public class Ejercicio6 {
    public static void main(String[] args) {
            
            var scanner = new Scanner(System.in);
    
            System.out.print("Ingrese un numero: ");
            var numero = scanner.nextInt();
    
            if (numero % 2 == 0 && numero % 7 == 0) {
                System.out.println("El numero es divisible por 2 y 7.");
            } else {
                System.out.println("El numero no es divisible por 2 y 7.");
            }
    
            scanner.close();
    }
}
