package Ejercicio_31;
/*
 * Ejercicio 31: Crear y recorrer un array
Crea un array de 3 posiciones, rellenalo pidiendo los números al usuario y recorrelo para mostrarlo.
 * 
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength= 3;    
        Integer numbersArray[];
        
        numbersArray = new Integer[arrayLength];

        for (int i = 0;i< arrayLength; i++){
            System.out.println("Ingrese el valor "+(i+1)+" del array");
            int value = sc.nextInt(); 
            numbersArray[i]=value;
        }

        System.out.println("Los numeros ingresados son");
        
        for (int i = 0;i< arrayLength; i++){
            System.out.println("Posicion ["+i+"]: "+ numbersArray[i]);            
        }


    }
}
