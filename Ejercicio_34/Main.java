package Ejercicio_34;

/*
 * 
 * Ejercicio 34: Arrays iguales
Crea dos arrays e indica si son iguales.
 *  */

import java.util.Scanner;
public class Main {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int[] firstArray = new int[2];
        int[] secondArray = new int[2];
        boolean equalFlag = true;
        for (int i = 0; i < firstArray.length;i++){
            firstArray[i] = sc.nextInt();
            secondArray[i] = sc.nextInt();
        }

        for (int j = 0 ; j < firstArray.length ; j++){
            if(firstArray[j] != secondArray[j]){
                equalFlag = false;
                break;
            }
        }

        if(equalFlag){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
    }
}
