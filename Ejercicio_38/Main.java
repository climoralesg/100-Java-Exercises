
/*
Ejercicio 38: Fusion arrays
Dado dos arrays creados por ti, fusionalos en uno.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int tamanoArrayUno;
        int tamanoArrayDos;

        System.out.println("Ingrese el tamaño del array 1");

        tamanoArrayUno = sc.nextInt();
        int arrayUno[] = new int[tamanoArrayUno];

        System.out.println("Ingrese el tamaño del array 2");

        tamanoArrayDos = sc.nextInt();

        int arrayDos[] = new int[tamanoArrayDos];



        System.out.println("Ingrese los valores del Array 1");

        for(int i = 0 ; i < arrayUno.length ; i++){
            arrayUno[i] = sc.nextInt();
        }


        System.out.println("Ingrese los valores del Array 2");
        for(int i = 0 ; i < arrayDos.length ; i++){
            arrayDos[i] = sc.nextInt();
        }

        int arrayFinal[] = new int[arrayUno.length + arrayDos.length];


        System.arraycopy(arrayUno, 0, arrayFinal, 0, arrayUno.length);
        System.arraycopy(arrayDos, 0, arrayFinal, arrayUno.length, arrayDos.length);

        System.out.println(Arrays.toString(arrayFinal));

        sc.close();
    }
}
