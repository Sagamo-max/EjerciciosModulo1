package EjerciciosClase03;

import java.util.Scanner;

/*Escriba un programa que permita ingresar tres números (representan la longitud 
de una línea) y compruebe si con estos números se puede formar un triángulo. */

public class Ejercicio7 {
    public static void main(String[] args) {
            
            var scanner = new Scanner(System.in);
    
            System.out.print("Ingrese el primer numero: ");
            var numero1 = scanner.nextInt();
    
            System.out.print("Ingrese el segundo numero: ");
            var numero2 = scanner.nextInt();
    
            System.out.print("Ingrese el tercer numero: ");
            var numero3 = scanner.nextInt();
    
            if (numero1 + numero2 > numero3 && numero1 + numero3 > numero2 && numero2 + numero3 > numero1) {
                System.out.println("Se puede formar un triangulo con los numeros ingresados.");
            } else {
                System.out.println("No se puede formar un triangulo con los numeros ingresados.");
            }
    
            scanner.close();
    }
}
