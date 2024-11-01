package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar una letra e identifique 
    si es vocal o consonante. */

public class Ejercicio5 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        var letra = scanner.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra es vocal.");
        } else {
            System.out.println("La letra es consonante.");
        }

        scanner.close();

    }
}
