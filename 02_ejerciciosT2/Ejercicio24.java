/*
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio24 {
    public static void main(String[] args){
        
    System.out.println("Escriba la primera frase: ");
    String frase1 = new Scanner(System.in).nextLine();
    
    System.out.println("Escriba la segunda frase: ");
    String frase2 = new Scanner(System.in).nextLine();
    
    //PrintWriter Ruta = new PrintWriter("d:/frases.txt");
    
    try {
         PrintWriter Ruta = new PrintWriter("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 2/Ejercicio24/frases.txt");
         Ruta.print(frase1);
         Ruta.print(frase2);
         Ruta.close();
    } catch (FileNotFoundException e) {
         System.out.println("Error "+e.getMessage());
      }
   
   }
}