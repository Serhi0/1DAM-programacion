/*
 */
import bpc.daw.objetos.Caja;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio29 {
    public static void main(String[] args){
        
        System.out.println("Apartado A");
        System.out.println("Escribe un numero :");
        int numero = new Scanner(System.in).nextInt();
           
        System.out.println("Si en vez de numero escribe letras dará InputMismatchException");
        
        
        System.out.println("Apartado B");
       
        System.out.println("Argumento 1: "+ args[0]);
        System.out.println("Argumento 1: "+ args[1]);
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        
        int n3 = n1 + n2;
        
        System.out.println("La suma de los argumentos es: " +n3);
        
        System.out.println("Si no recibe los argumentos dará ArrayIndexOutOfBoundsException");
        
        System.out.println("Apartado C");
        Caja c = null;
        //c.abrirCaja();   
        //System.out.println(c.getMensaje().length());
        
        System.out.println("Si intentamos leer una caja vacia dará NullPointerException");
    }
}

