package Ejercicio_47;

/*
 * 
Ejercicio 47: Fila idéntica matriz
Crea una matriz de números 3x3. Crea una función que, dada una fila de la matriz, indique si los valores de esa fila son idénticos.

 */
import java.util.Scanner;


public class Main {

    public static void viewEquals(int[][] matriz, int fila){
        boolean equals = true;
        
        for(int i = 0; i < matriz[0].length ; i++){
            if(!(i+1 == matriz[0].length)){

                int valorAnterior = matriz[fila][i];
                int valorPosterior = matriz[fila][i+1]; 
                
                if(matriz[fila][i] != matriz[fila][i+1]){
                    equals = false;
                    break;
                }
            }
        }

        if (equals==true){
            System.out.println("La fila indicada de la matriz es la misma");
        }else{
            System.out.println("La fila indicada de la matriz no es la misma");
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
        viewEquals(matriz,2);
    }
}
