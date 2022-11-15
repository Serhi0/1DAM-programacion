/*
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio25 {
    public static void main(String[] args){
        
        File archivo = new File("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 2/Ejercicio24/frases.txt");
        try{
            Scanner escaner = new Scanner(archivo);
            System.out.println("linea 1: "+escaner.next());
            System.out.println("linea 2: "+escaner.next());
 
        }catch(FileNotFoundException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
