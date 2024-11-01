package EjerciciosClase03;

import java.util.Scanner;

/*Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes 
números: 1 para el mayor, 2 para el del medio y 3 para el menor.  
Cuando llega la hora de la reunión, uno de los hermanos va tarde. 
Dados los números de los hermanos que llegan a tiempo, determine el número del 
hermano que llegará tarde.  
Por ejemplo:
```
Input : 1 2
Output : 3
```
El tercer hermano es el el que llegara a la reunión tarde. */

public class Ejercicio13 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del primer hermano: ");
        var hermano1 = scanner.nextInt();

        System.out.print("Ingrese el número del segundo hermano: ");
        var hermano2 = scanner.nextInt();

        if (hermano1 == 1 && hermano2 == 2) {
            System.out.println("3");
        } else if (hermano1 == 1 && hermano2 == 3) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }

        scanner.close();
    }
}
