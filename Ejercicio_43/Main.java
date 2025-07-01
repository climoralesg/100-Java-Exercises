package Ejercicio_43;

/*
 *  Ejercicio 43: Creando rellenando y recorriendo una matriz

    Crea una matriz de números de 3x3, pidiendo cada numero. Al final recorre la matriz y muestrala.
 */


 import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los elementos de la matriz");
        System.out.println("");
        for(int i = 0 ; i < 3 ; i++ ){
            for (int j = 0; j < 3 ; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < 3 ; i++ ){
            for (int j = 0; j < 3 ; j++){
                System.out.print(matriz[i][j]);       
            }
            System.out.print("\n");
        }
        
    }
}
