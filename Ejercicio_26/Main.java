
/*
 * Ejercicio 26: Invertir palabra y palíndromo
Crea una función que indique si una palabra o frase pasada por parámetro es un palíndromo.

 */

package Ejercicio_26;


import java.util.Scanner;
public class Main {


    public static boolean isPalindromo(String word){
        
        for(int i = 0; i <= (word.length()-1);i++){
            if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra para saber si es un palindromo");
        
        String word = sc.nextLine();

        boolean palindromoResult = isPalindromo(word);

        if(palindromoResult){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }


    }
}
