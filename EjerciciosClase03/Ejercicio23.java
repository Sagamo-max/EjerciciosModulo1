package EjerciciosClase03;

import java.util.Scanner;

/* Realizar un programa que imprima un diamante usando caracteres de texto. 
El programa debe pedir al usuario el tamaño del diamante, el cual debe ser un 
número entero positivo impar. 
Ej:
- Si tamaño es: 3
    ```
     *
    ***
     *
    ```
- Si tamaño es: 7
    ```
       *
      ***
     *****
    *******
     *****
      ***
       *
    ```
Ten en cuenta que la linea de asteriscos (*) de la fila central es la mas grande 
y debe estar alineada a la parte izquierda de la pantalla y debe tener del tamaño 
del número dado. El resto de las lineas deben quedar los asteriscos centrados 
teniendo como base la linea central.
En caso de que el número ingresado no sea válido, se le debe informar el usuario 
el caso que no está cumpliendo.*/

public class Ejercicio23 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int tamano;

        while (true){
            System.out.println("Ingrese el tamaño del diamante (numero entero positivo impar):");
            tamano = scanner.nextInt();

            if (tamano % 2 == 0 && tamano > 0) {
                System.out.println("El tamaño del diamante debe ser impar.");
            } else if (tamano < 0) {
                System.out.println("El tamaño del diamante debe positivo.");
            } else {
                break;
            }
        }

        int mitadTamano = tamano / 2;
        for (int i = 0; i < tamano; i++) {
            int espacios = Math.abs(mitadTamano - i);
            int asteriscos = tamano - (espacios * 2);

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
