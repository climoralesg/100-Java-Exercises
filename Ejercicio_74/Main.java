package Ejercicio_74;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String args[]) throws IOException{

        Path path = Paths.get("");
        String s = path.toAbsolutePath().toString();
        File file = new File(s+"/Ejercicio_74/text.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line ;
        while ((line = reader.readLine())!=null) {
            System.out.println(line);
        }
    }
}