package Ejercicio_46;


import java.util.Scanner;

public class Main {


     public static void diagonalDirecta(int[][] dataMatriz){
        System.out.println("\n");

        for(int j = 0; j < dataMatriz[0].length ; j++ ){       
            System.out.println(dataMatriz[j][j]);
        }

    }

    public static void diagonalInversa(int[][] dataMatriz){
        System.out.println("\n");
        
        for (int j = dataMatriz[0].length - 1, i = 0; j >= 0 && i < dataMatriz[0].length; j--, i++) {
            System.out.println(dataMatriz[i][j]); 
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

        diagonalDirecta(matriz);
        diagonalInversa(matriz);
         
    }
}