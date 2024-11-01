package EjerciciosClase03;

import java.util.Scanner;

/*Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.  
Por ejemplo:
```
Input : 3 , 100 , 1
Output : 13100
```
Tenga en cuenta que la respuesta es un texto. Los números los puede concatenar. */

public class Ejercicio11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        var numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        var numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        var numero3 = scanner.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                System.out.println(numero1 + "" + numero2 + "" + numero3);
            } else {
                System.out.println(numero1 + "" + numero3 + "" + numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                System.out.println(numero2 + "" + numero1 + "" + numero3);
            } else {
                System.out.println(numero2 + "" + numero3 + "" + numero1);
            }
        } else {
            if (numero1 < numero2) {
                System.out.println(numero3 + "" + numero1 + "" + numero2);
            } else {
                System.out.println(numero3 + "" + numero2 + "" + numero1);
            }
        }

        scanner.close();
    }
}
