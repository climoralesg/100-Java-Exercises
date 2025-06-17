/*
 * Ejercicio 35: Mayor y menor en un array
Mostrar el menor y mayor de un array de números creado por ti mismo.
 */

package Ejercicio_35;

import java.util.Scanner;
public class Main{
    
    public static int[] insertionSort(int[] arrayNumbers){
        
        for(int j=1; j < arrayNumbers.length ; j++){
            int key= arrayNumbers[j];
            int i =j -1;
            while(i>=0 && arrayNumbers[i] > key){
                arrayNumbers[i+1] = arrayNumbers[i];
                i--;
            }
            arrayNumbers[i+1] = key;
        }
        return arrayNumbers;
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arrayNumbers[];

        System.out.println("Ingrese el tamaño del array");

        int lengthArray = sc.nextInt();

        System.out.println("Ingrese los valores del array");
        arrayNumbers = new int[lengthArray];

        for(int i = 0;i<arrayNumbers.length ;i++){
            arrayNumbers[i] = sc.nextInt();
        }
        int arrayOrder[] = insertionSort(arrayNumbers);
        
         System.out.println("El numero menor es "+ arrayOrder[0]);

         System.out.println("El numero mayor es "+ arrayOrder[arrayOrder.length-1]);

    }


 }