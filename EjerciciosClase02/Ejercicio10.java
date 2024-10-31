import java.util.Scanner;

public class Ejercicio10 {
    
    /*Crea un programa que calcule la media aritmética de tres números 
    introducidos por el usuario. */

    public static void main(String[] args) {
            
            var scanner = new Scanner(System.in);
    
            System.out.print("Ingrese el primer numero: ");
            var numero1 = scanner.nextDouble();
    
            System.out.print("Ingrese el segundo numero: ");
            var numero2 = scanner.nextDouble();
    
            System.out.print("Ingrese el tercer numero: ");
            var numero3 = scanner.nextDouble();
    
            var media = (numero1 + numero2 + numero3) / 3;
    
            System.out.println("La media de los numeros es: " + media);
    
            scanner.close();
    }
}
