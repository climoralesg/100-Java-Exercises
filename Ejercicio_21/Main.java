/*
 * 
 * Ejercicio 21: Suma del 1 a n
Crea una función que devuelva la suma de los
números del 1 al número pasado como parámetro (incluido).
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number = sc.nextInt();
        int acumulador = 0;
        for (int i = 0; i <= number; i++) {
            acumulador = acumulador + i;
        }

        System.out.printf("El numero acumulador es %d", acumulador);

    }
}