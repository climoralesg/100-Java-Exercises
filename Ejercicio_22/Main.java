package Ejercicio_22;

/*
* Ejercicio 22: Generar número aleatorio entre dos números
Crea una función que genere un número aleatorio entre dos números pasados por parámetro.
* 
* 
* 
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros");
        
        int firstNumber = sc.nextInt();
        
        int secondNumber = sc.nextInt();

        int resultRandom = (int) (Math.random() * (secondNumber - firstNumber) + firstNumber);

        System.out.printf("El numero random generado es %d ", resultRandom);

    }
}