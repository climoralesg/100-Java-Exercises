package Ejercicio_16;

/*
 * 
 * Ejercicio 16: Adivina el número
Genera un número aleatorio entre 1 y 100.
Pide al usuario números entre estos dos valores y, si el usuario falla, 
debes indicarle si el número que introdujo es mayor o menor que el número objetivo.
 El programa termina cuando el usuario acierta. No hay límite de intentos.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");

        int numberGenerated = (int) (Math.random() * 100) + 1;
        
        System.out.println("El numero generado "+numberGenerated);

        while(true){
        
            int numberIn = sc.nextInt();

            if(numberGenerated == numberIn){
                System.out.println("El numero ingresado es el correcto");
                break;
            }else{
                if(numberGenerated > numberIn){
                    System.out.println("El numero generado es mayor al ingresado");
                }else if (numberGenerated < numberIn){
                    System.out.println("El numero generado es menor al ingresado");

                }
            }
        }
    }
}
