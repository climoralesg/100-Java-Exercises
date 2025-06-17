
/*
 * Ejercicio 25: Validar número entre dos números
Crea una función que valide si un número está entre dos números. Necesitas dos parámetros numéricos.
 */

package Ejercicio_25;

import java.util.Scanner;
public class Main {
    
    public static Boolean validateNumbers(int principalNumber){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int firstNumber = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int secondNumber = sc.nextInt();
        
        if(firstNumber > secondNumber){
            int pivot = secondNumber;
            secondNumber = firstNumber;
            firstNumber = pivot;
        }
    
        boolean result = (principalNumber > firstNumber) && (principalNumber < secondNumber) ? true : false;

        return result;
    
    }
    
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero principal");

        int principalNumber = sc.nextInt();

        boolean result = validateNumbers(principalNumber);

        if(result){
            System.out.println("El numero se encuentra entre los numeros indicados");
        }else{
            System.out.println("El numero no se encuentra en los numeros indicados");
        }

    }

  
}
