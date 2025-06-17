package Ejercicio_36;

/*
 * Ejercicio 36: Dígitos en un array
Crea una función que dado un número natural me devuelva sus dígitos en un array.
 * 
 */

import java.util.Scanner;



public class Main {
    
    public static char[] getNumber(int naturalNumber){
        String naturalNumberString = Integer.toString(naturalNumber);
        char[] charArray = naturalNumberString.toCharArray();

        return charArray;
    }
    
    public static void main (String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int naturalNumber = sc.nextInt();

        char[] charArray = getNumber(naturalNumber);


        for(int i = 0; i < charArray.length; i++){
            
            System.out.println(charArray[i]);
        
        }

    }
}
