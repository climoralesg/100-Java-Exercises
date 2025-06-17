package Ejercicio_15;
/*
 * Ejercicio 15: Palíndromo
Pide una frase por consola e indica si es un palíndromo.
Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda. Ejemplo: "alola".
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra para saber si es palindromo");

        cadena = sc.nextLine();
        int i = 0;
        while (i<=cadena.length()-1) {
            int finalLetter = cadena.length() - (i+1);
            if(cadena.charAt(i) != cadena.charAt(finalLetter) ){
                System.out.println("No es un palindromo");
                break;
            }
            i++;
        }

        if(i==cadena.length()){
            System.out.println("Es un palindromo");
        }
    }
}
