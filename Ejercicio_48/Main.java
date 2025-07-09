package Ejercicio_48;

/*
 * Ejercicio 48: Movimiento ajedrez rey en una matriz
Teniendo una matriz de char de 8x8, simula el movimiento de un rey de ajedrez.
El rey puede moverse una posición dentro del tablero. Muestra su ubicación en cada momento. 
 */

import java.util.Scanner;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void mostrarArray(char[][] matriz) {
        System.out.print("\n");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static char[][] moverArray(char[][] matriz, int columna, int fila) {

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 'X';
            }
        }

        matriz[fila][columna] = 'O';

        return matriz;

    }

    public static void main(String args[]) throws IOException {

        InputStream in = System.in;
        int fila = 3;
        int columna = 3;

        char[][] matriz = new char[8][8];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 'X';
            }
        }

        matriz[fila][columna] = 'O';

        while (true) {
            int ch = in.read();

            mostrarArray(matriz);

            if (ch == 27) {

                if (in.available() >= 2) {
                    int next1 = in.read();
                    int next2 = in.read();
                    if (next1 == 91) {
                        switch (next2) {
                            case 65:

                                System.out.println("Flecha ↑");

                                if (fila - 1 < 0) {
                                    System.out.println("La fila ingresada supera los limites");
                                } else {
                                    fila--;
                                    matriz = moverArray(matriz, columna, fila);
                                }

                                break;
                            case 66:
                                System.out.println("Flecha ↓");
                                if (fila + 1 >= matriz.length) {
                                    System.out.println("La fila ingresada supera los limites");
                                } else {
                                    fila++;
                                    matriz = moverArray(matriz, columna, fila);
                                }

                                break;
                            case 67:
                                System.out.println("Flecha →");
                                if (columna + 1 >= matriz.length) {
                                    System.out.println("La columna ingresada supera los limites");
                                } else {
                                    columna++;
                                    matriz = moverArray(matriz, columna, fila);
                                }

                                break;
                            case 68:
                                System.out.println("Flecha ←");

                                if (columna - 1 < 0) {
                                    System.out.println("La columna ingresada supera los limites");
                                } else {
                                    columna--;
                                    matriz = moverArray(matriz, columna, fila);
                                }

                                break;
                            default:
                                System.out.println("Secuencia desconocida: " + next2);
                        }
                    }
                }
            } else {
                System.out.println("Tecla normal: " + (char) ch + " (ASCII: " + ch + ")");
            }
        }

    }

}