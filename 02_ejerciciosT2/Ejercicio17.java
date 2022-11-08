/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio17 {
    public static void main(String[] args){
         
        System.out.println("¿Cual es tu nombre?");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("¿Cual es tu dominio?");
        String dominio = new Scanner(System.in).nextLine();
        
       if( dominio.endsWith(".es") || dominio.endsWith(".com")){
           String correo = nombre+"@"+dominio;
           System.out.println("Tu correo es: "+correo);
       }else{
           System.out.println("El dominio es incorrecto");
       }
      
    }
}
