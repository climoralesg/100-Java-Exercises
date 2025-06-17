package Ejercicio_13;
/*
    Ejercicio 13: Invertir cadena
    Pide una frase o palabra por consola e inviértela.
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        String cadena;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto");

        cadena = sc.nextLine();

        System.out.println("La cadena invertida es");

        int i;

        for(i = cadena.length()-1 ; i >= 0; i--){
            System.out.print(cadena.charAt(i));
        }
        System.out.println();
    }
}
