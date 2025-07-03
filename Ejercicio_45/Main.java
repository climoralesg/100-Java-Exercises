package Ejercicio_45;
/* 
Ejercicio 45: Muestra columna matriz
Crea una matriz de números 3x3. Crea una función que, dada una matriz y una columna, muestre solo esa columna.
*/

import java.util.Scanner;

public class Main {


     public static void funcionMatriz(int[][] dataMatriz, int columna){
        System.out.println("\n");

        for(int j = 0; j < dataMatriz[0].length ; j++ ){       
            System.out.println(dataMatriz[j][columna-1]);
        }

    }
    
    public static void main(String args[]){
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores de la matriz");

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[0].length ; j++ ){
                matriz[i][j] = sc.nextInt();
            }
        }

        funcionMatriz(matriz, 2); 
    }
}
