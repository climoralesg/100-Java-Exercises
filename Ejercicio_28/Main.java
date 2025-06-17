/*
 * Ejercicio 28: Contar mayúsculas o minúsculas
Crea una función que, dado un String y un boolean, cuente las letras mayúsculas o minúsculas, según el valor del segundo parámetro.
 */

package Ejercicio_28;

import java.util.Scanner;
import java.lang.Character;
public class Main {

    public static int optionWord(String word, boolean option) {

        if (option) {
            return (int) word.chars().filter(c -> Character.isUpperCase(c)).count();
        } else {
            return (int) word.chars().filter(c -> Character.isLowerCase(c)).count();
        }
    }

    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");

        String word = sc.nextLine();

        System.out.println("Ingrese ahora un booleano");

        boolean diff = sc.nextBoolean();

    

        if(diff){
            System.out.println("El numero de mayusculas que tiene la palabra es: "+optionWord(word, diff));
        }else{
            System.out.println("El numero de minusculas que tiene la palabra es: "+optionWord(word, diff));
        }

    }
}
