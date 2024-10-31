import java.util.Scanner;

public class Ejercicio9 {
    
    /*Escribe un programa que convierta una temperatura dada en grados Celsius a 
    grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
    ```
    Fahrenheit = Celsius * 9/5 + 32
    Kelvin = Celsius + 273.15
    ``` */

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        var celsius = scanner.nextDouble();

        var fahrenheit = celsius * 9/5 + 32;
        var kelvin = celsius + 273.15;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        System.out.println("La temperatura en grados Kelvin es: " + kelvin);

        scanner.close();

    }
}
