/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio13 {
    public static void main(String[] args){
        
        System.out.println("Escribre tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("Tu nombre en may�sculas: "+nombre.toUpperCase());
        System.out.println("Tu nombre en min�sculas: "+nombre.toLowerCase());
        System.out.println("Total de caractares de tu nombre: "+nombre.length());
    }
}
