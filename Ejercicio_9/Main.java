package Ejercicio_9;

/*
 * Ejercicio 9: Bisiesto
Pide un año por teclado (número) e indica si es bisiesto o no.
Es bisiesto cuando es divisible entre 4 y no divisible entre 100 o si es divisible entre 400.
 * 
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año");
        int year = sc.nextInt();

        if(year%4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println("Es un año bisiesto");
            }else{
                System.out.println("No es un año bisiesto");
            }
        }else{
            System.out.println("No es un año bisiesto");
        }

    }
}
