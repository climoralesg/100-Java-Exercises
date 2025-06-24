package Ejercicio_39;

import java.util.Map;
import java.util.HashMap;
/*
 * Ejercicio 39: Numero más repetido en un array
Dado un array de números, indica cual es el elemento más repetido, en caso de empate, mostrar el último más repetido.
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Map<Integer,Integer> hashNumbers = new HashMap<Integer,Integer>();

        System.out.println("Ingrese el tamaño del array");
        int arrayLength = sc.nextInt();

        int arrayView[] = new int[arrayLength];

        System.out.println("Ingrese los valores del array");
        
        for(int i = 0; i < arrayLength ; i++){
            arrayView[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arrayLength ; i++){
            int valorBusqueda = arrayView[i];
            int count = 0;
            if(hashNumbers.get(valorBusqueda) != null){
                continue;
            }else{
                for(int j = i ; j < arrayLength ; j++){
                    if(valorBusqueda == arrayView[j] ){
                        count++;
                    }
                }
                hashNumbers.put(arrayView[i], count);
            }
        }
        System.out.println(hashNumbers);


    }

}
