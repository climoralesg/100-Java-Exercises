package Ejercicio_37;

import java.util.ArrayList;

/*
Ejercicio 37: Caracteres de un String en un array
Pide una frase por consola y guarda en un array todos sus caracteres.
*/

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        List<Character> permitidos = new ArrayList<>();

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        char[] fraseConvertida = frase.toCharArray();

        char[] prohibido = { ' ', '\t', '\n' };

        for (char c : fraseConvertida) {
            boolean esProhibido = false;
            for (char p : prohibido) {
                if (c == p) {
                    esProhibido = true;
                    break;
                }
            }
            if (!esProhibido) {
                permitidos.add(c);
            }
        }

        System.out.println("Los caracteres permitidos son:");
        for (char letra : permitidos) {
            System.out.print(letra);
        }

        sc.close();
    }
}
