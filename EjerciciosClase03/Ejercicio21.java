package EjerciciosClase03;

import java.util.Scanner;

/* Realizar un programa que permita hacer la siguiente conversión:
- Millas a kilómetros. 
- Kilómetros a millas.  
Considera que  
- 1 milla son 1.60934 kilómetros  
- 1 kilómetro es 0.621371 millas
*/

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la conversion que desea realizar:");
        System.out.println("1. Millas a kilometros");
        System.out.println("2. Kilometros a millas");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad de millas: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934;
            System.out.println(millas + " millas son " + kilometros + " kilometros.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad de kilómetros: ");
            double kilometros = scanner.nextDouble();
            double millas = kilometros * 0.621371;
            System.out.println(kilometros + " kilometros son " + millas + " millas.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
