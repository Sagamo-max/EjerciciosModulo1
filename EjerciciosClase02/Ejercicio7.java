import java.util.Scanner;

public class Ejercicio7 {

    /*Escribe un programa que solicite al usuario dos números y luego realice 
    las operaciones de suma, resta, multiplicación y división con esos números. 
    Muestra los resultados en la consola. */

    public static void main(String[] args) {
            
            var scanner = new Scanner(System.in);

            var numero1 = 0;
            var numero2 = 0;
    
            System.out.print("Ingrese el primer numero: ");
            numero1 = scanner.nextInt();
    
            System.out.print("Ingrese el segundo numero: ");
            numero2 = scanner.nextInt();
    
            System.out.println("La suma de los numeros es: " + (numero1 + numero2));
            System.out.println("La resta de los numeros es: " + (numero1 - numero2));
            System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2));
            System.out.println("La division de los numeros es: " + (numero1 / numero2));

            scanner.close();
        }
}