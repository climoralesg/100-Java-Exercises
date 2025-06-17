package Ejercicio_20;

/*
 * 
 * Ejercicio 20: Número perfecto
Pide un número por consola e indica si es un número perfecto.
Un número perfecto es aquel que es igual a la suma de sus divisores propios positivos. Ejemplo: el 28 es perfecto porque 28 = 1 + 2 + 4 + 7 + 14.
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int number = sc.nextInt();
        
        int sumatory = 0;

        for(int i = 1 ; i < number ; i++){
            if(number % i == 0 ){
                sumatory = sumatory + i;
                if(sumatory == number){
                    break;
                } 
            }
        }

        if(sumatory == number){
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }
}
