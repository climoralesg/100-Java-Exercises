package Ejercicio_7;

/*
 * Ejercicio 7: Recorre cadenas
Pide una cadena por consola y muestra sus caracteres uno a uno.

 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Ingresa una cadena de texto");

        cadena = sc.nextLine();

        for(int i=0; i<cadena.length();i++ ){
            System.out.println("Caracter "+i+": "+cadena.charAt(i));
        }

    }
}
