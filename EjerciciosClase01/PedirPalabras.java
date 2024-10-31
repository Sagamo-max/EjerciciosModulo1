package EjerciciosClase01;

import java.util.Scanner;

public class PedirPalabras {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera palabra: ");
        var palabra1 = scanner.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        var palabra2 = scanner.nextLine();

        System.out.print("Ingrese la tercera palabra: ");
        var palabra3 = scanner.nextLine();

        System.out.printf("%s %s %s%n", palabra1, palabra2, palabra3);

        scanner.close();
    }
}
