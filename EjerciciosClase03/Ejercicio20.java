package EjerciciosClase03;

/*Realice un programa que genere el tablero de ajedrez en consola usando instrucciones de repetición.
```
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
```
donde **N** representa al cuadro negro y **B** representa al cuadro blanco. */

public class Ejercicio20 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
            }
            System.out.println("|");
        }
    }
}
