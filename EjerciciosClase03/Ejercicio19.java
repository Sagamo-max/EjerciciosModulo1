package EjerciciosClase03;

import java.util.Scanner;

/*Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula 
como la suma de los dos inmediatamente anteriores. Crea un programa reciba un 
número (N) del usuario y muestre los primeros N números de sucesión. */

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero (N): ");
        int N = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Los primeros " + N + " numeros de la sucesion son: ");

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
