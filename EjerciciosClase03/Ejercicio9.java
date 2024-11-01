package EjerciciosClase03;

import java.util.Scanner;

/*Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la 
cantidad de unidades que le compren. La siguiente tabla muestra la información: 

| Unidades | Precio por unidad |
| :-: | --: |
|[1 - 50] | $50.000 |
|(50 - 100] | $45.000 |
|(100 - 150] | $40.000 |
|(150 - 200] | $35.000 |
|> 200 | $25.000 |

Escriba un programa que dado un número de camisas retorne el precio por unidad. */

public class Ejercicio9 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de camisas: ");
        var cantidadCamisas = scanner.nextInt();

        if (cantidadCamisas >= 1 && cantidadCamisas <= 50) {
            System.out.println("El precio por unidad es de $50.000.");
        } else if (cantidadCamisas > 50 && cantidadCamisas <= 100) {
            System.out.println("El precio por unidad es de $45.000.");
        } else if (cantidadCamisas > 100 && cantidadCamisas <= 150) {
            System.out.println("El precio por unidad es de $40.000.");
        } else if (cantidadCamisas > 150 && cantidadCamisas <= 200) {
            System.out.println("El precio por unidad es de $35.000.");
        } else {
            System.out.println("El precio por unidad es de $25.000.");
        }

        scanner.close();
    }
}
