/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio18 {
    public static void main(String[] args){
        
        System.out.println("¿Cual es tu correo electronico?");
        String correo = new Scanner(System.in).nextLine();
        
       int numero = correo.indexOf("@");
       String nombre = correo.substring(0,numero);
       String dominio = correo.substring(numero+1,correo.length());
       
       System.out.println("El nombre es: "+nombre);
       System.out.println("El dominio es: "+dominio);
    }
    
}
