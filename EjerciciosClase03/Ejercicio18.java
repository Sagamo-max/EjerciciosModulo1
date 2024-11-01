package EjerciciosClase03;

/*Escriba un programa que genere 120 números aleatorios entre -100 y 100. Imprime los
siguientes cálculos:
- Sumar los valores positivos.
- Sumar los valores negativos.
- Calcule la media de los números negativos.
- Calcule la media de los números positivos.
- Cuente la cantidad de ceros. */

public class Ejercicio18 {
    public static void main(String[] args) {
        var sumPositivos = 0;
        var sumNegativos = 0;
        var cuentaCeros = 0;
        var cuentaPositivos = 0;
        var cuentaNegativos = 0;

        for (var i = 0; i < 120; i++) {
            var numeroAleatorio = (int) (Math.random() * 201) - 100;
            if (numeroAleatorio > 0) {
                sumPositivos += numeroAleatorio;
                cuentaPositivos++;
            } else if (numeroAleatorio < 0) {
                sumNegativos += numeroAleatorio;
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }

        System.out.println("Suma de los valores positivos: " + sumPositivos);
        System.out.println("Suma de los valores negativos: " + sumNegativos);
        System.out.println("Media de los valores positivos: " + (sumPositivos / cuentaPositivos));
        System.out.println("Media de los valores negativos: " + (sumNegativos / cuentaNegativos));
        System.out.println("Cantidad de ceros: " + cuentaCeros);
    }
}
