package Ejercicio_42;

/*
 * 
 * Ejercicio 42: Mini-ahorcado
Vamos a hacer un pequeño ahorcado.

Tendremos un pequeño array con palabras que tu elijas, créalo tu mismo.

Debes mostrar la palabra cogida con guiones e ir pidiendo letras.

El usuario gana cuando la palabra este completa.

Si falla 6 veces, el usuario pierde.

||
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
          
        Scanner sc = new Scanner(System.in);

        int countFails = 0;
        int countLetters = 0;
        int countGeneralLetters = 0;
        String palabra;
      
        System.out.println("Ingresa una frase y/o palabra");
        
        palabra = sc.nextLine();
        char[] charWordArray = palabra.toCharArray();

        while(true){

            for(int i = 0 ; i< charWordArray.length ; i++){
                System.out.print(charWordArray[i]);
                if(i != charWordArray.length-1){
                    System.out.print("-");
                }
                
            }

            System.out.println("\nCual es la siguiente letra que deseas adivinar?");
           
            char letraAdivinar = sc.next().charAt(0);

            for(int j = 0 ; j < charWordArray.length ; j++){
                
                if(charWordArray[j] == letraAdivinar && charWordArray[j] != '*'){
                    charWordArray[j] = '*';
                    countLetters ++;
                }

            }
            countGeneralLetters =+ countLetters;

            if(countGeneralLetters == palabra.length()){
                System.out.println("haz adivinado la palabra, felicitaciones");
                break;
            }

            if(countLetters == 0){
                countFails++;
            }

            if(countFails == 6){
                System.out.println("Haz llegado a los 6 intentos y solo adivinaste esto");

                for(int i = 0 ; i< charWordArray.length ; i++){
                    System.out.print(charWordArray[i]);
                    if(i != charWordArray.length-1){
                        System.out.print("-");
                    }
                }

                break;
            }
        }
    }
}
