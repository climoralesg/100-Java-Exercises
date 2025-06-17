package Ejercicio_11;

/*
 * Ejercicio 11: Precio con IVA
    Pide un número real que represente un precio y muestra el precio con IVA. El IVA es del 19%.
 */

import java.util.Scanner;


public class Main {
    public static void main(String args[]){

        int number;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor monetario");
        number = sc.nextInt();

        result = number + (number * 0.19);

        System.out.printf("El precio del producto es %d y su precio con IVA es %.2f ", number, result);
        
    }
}
