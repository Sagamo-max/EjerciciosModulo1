package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar una letra e identifique si la 
    letra es mayúscula o minúscula. */

public class Ejercicio4 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        var letra = scanner.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayuscula.");
        } else {
            System.out.println("La letra es minuscula.");
        }

        scanner.close();

    }
}
