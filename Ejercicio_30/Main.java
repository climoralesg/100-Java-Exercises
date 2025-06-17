package Ejercicio_30;


/*
Ejercicio 30: Generar password
Crea una función que genere una contraseña aleatoria con letras mayúsculas, minúsculas y números.
Pasa por parámetro la longitud de la contraseña.
 * 
 */

import java.util.Scanner;
import java.security.SecureRandom;


public class Main {

    public static String generatePassword(int wordLength){
        SecureRandom secureRandom = new SecureRandom();
  
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        StringBuilder stringBuilder = new StringBuilder(wordLength);

        String totalRandomCharacters = mayusculas + minusculas + numeros;


        for(int i = 0; i<wordLength ; i++){
            stringBuilder.append(totalRandomCharacters.charAt( secureRandom.nextInt(totalRandomCharacters.length()-1)+1));
        }
        
        return stringBuilder.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para la longitud de la palabra random");
        int wordLength = sc.nextInt();
        
        String result = generatePassword(wordLength);

        System.out.println("La palabra generada es "+result);
    }
}
