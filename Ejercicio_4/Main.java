package Ejercicio_4;
/*
 * Ejercicio 4: Menor de dos números
Pide dos números por consola e indica cuál es el menor de los dos números. En caso de que sean iguales, también lo debes indicar.
 */

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Ingrese el primer numero");

        firstNumber = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        
        secondNumber = sc.nextInt(); 

        if(firstNumber == secondNumber){
            System.out.println("Ambos numeros son iguales");
        }else{
            if(firstNumber > secondNumber){
                System.out.println("El primer numero es mayor al segundo");
            }else{
                System.out.println("El segundo numero es mayor al primero");
            }
        }

    }
}
