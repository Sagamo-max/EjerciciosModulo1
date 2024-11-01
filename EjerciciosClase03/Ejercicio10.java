package EjerciciosClase03;

import java.util.Scanner;

/*Escriba una función en la que ingrese un número entero entre 1 y 12. 
Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). 
El resultado debe ser el número de días del mes ingresado.  
Ejemplo:  
```
Input : 12
Output : 31
``` */

public class Ejercicio10 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12: ");
        var mes = scanner.nextInt();

        switch (mes) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                System.out.println("31");
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                System.out.println("Numero de mes invalido.");
        }

        scanner.close();
    }
}
