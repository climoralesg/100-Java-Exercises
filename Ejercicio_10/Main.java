package Ejercicio_10;
/*
 * Ejercicio 10: Validar un número
Pide un número por consola y valida que ese número esté entre 0 y 10. Hazlo con un do-while.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        do{
            System.out.println("Ingresa un numero: número debe estar entre 0 y 10 (sin incluir ambos)");
            number = sc.nextInt();
        }while(number >= 10 || number <= 0 );

        System.out.println("Excelente el numero ingresado esta entre el solicitado");
    }    
}
