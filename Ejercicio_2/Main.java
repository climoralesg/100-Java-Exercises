/*
 * 2.Saludador
Pide un nombre por consola y salúdalo por consola.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nombre");
        String name = sc.nextLine();
        System.out.printf("Hola! %s, Bienvenido\n", name);
    }
}
