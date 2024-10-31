import java.util.Scanner;

public class Ejercicio8 {
    
    /*Crea un programa que calcule el área y el perímetro de un rectángulo. 
    Solicita al usuario la longitud y el ancho del rectángulo. */

    public static void main(String[] args) {
    
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del rectangulo: ");
        var longitud = scanner.nextDouble();

        System.out.print("Ingrese el ancho del rectangulo: ");
        var ancho = scanner.nextDouble();

        var area = longitud * ancho;
        var perimetro = 2 * (longitud + ancho);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        scanner.close();
    }
}
