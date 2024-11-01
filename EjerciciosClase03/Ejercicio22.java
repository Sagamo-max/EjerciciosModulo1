package EjerciciosClase03;

import java.util.Scanner;

/*Realizar un programa que permita controlar el juego de piedra, papel, tijera  
introduciendo P para piedra, L para papel y T para tijera por cada jugador.  
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final 
de cada ronda preguntar si desea volver a jugar. */

public class Ejercicio22 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String jugarDeNuevo;

        do {
            System.out.println("Jugador 1 - Introduzca P para piedra, L para papel y T para tijera:");
            String jugador1 = scanner.nextLine().toUpperCase();

            System.out.println("Jugador 2 - Introduzca P para piedra, L para papel y T para tijera:");
            String jugador2 = scanner.nextLine().toUpperCase();

            if (jugador1.equals(jugador2)) {
                System.out.println("Empate!");
            } else if ((jugador1.equals("P") && jugador2.equals("T")) ||
                (jugador1.equals("T") && jugador2.equals("L")) ||
                (jugador1.equals("L") && jugador2.equals("P"))) {
                System.out.println("Jugador 1 gana!");
            } else {
                System.out.println("Jugador 2 gana!");
            }

            System.out.println("¿Desea volver a jugar? (S/N):");
            jugarDeNuevo = scanner.nextLine().toUpperCase();
        } while (jugarDeNuevo.equals("S"));

        System.out.println("Finalizando el juego...");

        scanner.close();
    }
}
