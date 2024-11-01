package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar un número mientras estos sean negativos. 
Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de 
números negativos ingresados.
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numero = -1;
        var cantidadNegativos = 0;

        while (numero < 0) {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                cantidadNegativos++;
            }
        }

        System.out.println("Ha ingresado un numero positivo. La cantidad de numeros negativos ingresados es: " + cantidadNegativos);

        scanner.close();
    }
}
