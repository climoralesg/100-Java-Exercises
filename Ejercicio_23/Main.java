package Ejercicio_23;

/*
 * Ejercicio 23: Pares entre 2 números
Crea una función que, dados dos números, muestre todos los números pares entre ellos.
 * 
 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        if(firstNumber > secondNumber){
            int pivot=secondNumber;
            secondNumber = firstNumber;
            firstNumber = pivot;
        }

        for (int i = firstNumber ; i < secondNumber;i++){
            if(i%2==0){
                System.out.printf("El numero %d es par\n", i);
            }
        }
    }
}
