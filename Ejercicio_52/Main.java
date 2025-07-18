package Ejercicio_52;

/*Ejercicio 52: Buscaminas
Teniendo una matriz de 6x7 con 10 minas colocadas aleatoriamente, pide al usuario que ingrese una fila y una columna (solo zonas que no se hayan explorado).
El jugador gana cuando no pisa ninguna mina durante 5 turnos seguidos. Si pisa una mina, el juego termina.
 * 
 */
import java.util.Scanner;

public class Main {

    public static void viewArray(char[][] matriz) {

        System.out.print("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {
        int minesCount = 0;
        int turnos = 5;
        boolean explode = false;

        char[][] tabla = new char[6][7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < tabla.length; i++) {
            for (int j = 0 ; j < tabla[0].length; j++) {
                tabla[i][j] = 'O';
            }
        }

        for (int i = 0; i < 10; i++) {
            int filaRandom;
            int columnaRandom;
            do {
                filaRandom = (int)Math.floor(Math.random()*6);
                columnaRandom = (int)Math.floor(Math.random()*7);    
            }while(tabla[filaRandom][columnaRandom] == 'X');
            minesCount ++;
            tabla[filaRandom][columnaRandom] = 'X';
            
        }

        for(int i = 1 ; i <= turnos ; i++){
            viewArray(tabla);

            System.out.println("Ingrese la fila ");
            int filaLectura = sc.nextInt();
            System.out.println("Ingrese la columna  ");
            int columnaLectura = sc.nextInt();

            if(tabla[filaLectura][columnaLectura] == 'X'){
                minesCount--;
                tabla[filaLectura][columnaLectura] = '|';
                explode = true;
                break;
            }else{
                System.out.println("Pisaste un lugar correcto");
            }
            
        }
        
        if(explode){
            System.out.println("KA-BUM explotaste");
        }else{
            System.out.println("Felicitaciones eres un buen solado y saliste ileso");
        }
        viewArray(tabla);
    
    }
}