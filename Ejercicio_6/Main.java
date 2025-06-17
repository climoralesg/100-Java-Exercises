package Ejercicio_6;
/*
 * Ejercicio 6: Tabla de multiplicar
Pide un número por consola y muestra la tabla de multiplicar de ese número. Por ejemplo, si el número que pides es el 5, debe devolver:
5
10
15
20
25
30
35
40
45
50
 * 
 * 
 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
    
        number = sc.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(number*i);
        }
    }    
}
