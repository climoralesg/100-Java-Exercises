package Ejercicio_33;
/*
 * Ejercicio 33: Suma y media de un array de números
Crea un array de números (dale los valores tu mismo) e indica cual es la suma y la media de ese array.
 */

import java.util.Scanner;

public class Main {

    public static float middleArrayNumbers(int arrayData[]){
        float resultMiddle = 0;
        float resultMiddleArray = 0;

        for(int i = 0 ; i < arrayData.length ; i++){

            resultMiddleArray = resultMiddleArray + arrayData[i];
        
        }

        resultMiddle = resultMiddleArray / arrayData.length;
        return resultMiddle;
    }

    public static int totalResultArray(int arrayData[]){
        int resultSumArray = 0;

        for(int i = 0 ; i < arrayData.length ; i++){
            resultSumArray = resultSumArray + arrayData[i];
        }
    
        return resultSumArray;

    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arrayData[];
        System.out.println("Ingrese el tamaño del array");

        int lengthArray = sc.nextInt();

        System.out.println("Ingrese los valores del array");
        arrayData = new int[lengthArray];
        for(int i = 0 ; i < lengthArray ; i++){
            System.out.println("Ingrese la posicion ["+i+"]");
            arrayData[i] = sc.nextInt();
        }
        
        float resultMiddleNumber = (float) middleArrayNumbers(arrayData);
        int resultSumArray = totalResultArray(arrayData);

        System.out.println("la media del array es " +resultMiddleNumber);

        System.out.println("la sumatoria del array es " +resultSumArray);

    }

}
