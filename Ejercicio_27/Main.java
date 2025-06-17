package Ejercicio_27;

import java.util.Scanner;

/*
 * Ejercicio 27: Muestra dígitos
Crea un método que, dado un número, muestre sus dígitos.
 */

public class Main {

    public static void numberView(int number){

        String numberString = Integer.toString(number); 

        for(int i = 0 ; i <= numberString.length()-1 ; i++){
            System.out.println("Letra: "+numberString.charAt(i) +"");
            System.out.println(((Object)numberString.charAt(i)).getClass().getSimpleName());
        }

    }
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola! ingresa un numero");

        int number = sc.nextInt();

        numberView(number);

    }    
}