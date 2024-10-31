public class Ejercicio1 {

    /*En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" 
    utilizando las instrucciones necesarias.*/

    public static void main(String[] args) {
        System.out.println("El resultado de la operación  6/2(1+2) es: " + (6/2*(1+2)));
    }

    /*
    ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?

    Personalemente considero que el resultado es 1, 
    ya que, primero aplico, por decirlo así, le distribitiva al paréntesis 
    luego soluciono el resto de la operación. Sin embargo, siguiendo la prioridad de 
    operacines en java, el resultado es 9.

    Explique por que la otra calculadora genera un resultado diferente.

    Esta da un resultado diferente debido a que está programada con una diferente 
    prioridad de operaciones. Posiblemente se usaron más paréntesis para definir
    esta prioridad.
    
     */
}