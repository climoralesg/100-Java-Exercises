package Ejercicio_32;



/*
 * Ejercicio 32: Rellenar un array con numeros aleatorios
Crea un array de 10 posiciones y rellenalo con números aleatorios. . Muestralos al final.
Crea una función para rellenarlo y otra para mostrar.
 * 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    

    public static Integer[] fillNumbers(Integer clearArray[]){
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0;i<clearArray.length;i++){
            clearArray[i] = secureRandom.nextInt(100) + 1;
        }

        return clearArray;
    }

    public static void viewArray(Integer arrayNumbers[]){
        for (int i = 0;i<arrayNumbers.length;i++){
            System.out.println(arrayNumbers[i]);
        }
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Integer arrayNumbers[];
        
        System.out.println("Ingrese un numero");

        int arrayLength = sc.nextInt();

        arrayNumbers = new Integer[arrayLength];
        
        arrayNumbers = fillNumbers(arrayNumbers);

        viewArray(arrayNumbers);
        
    }
}
