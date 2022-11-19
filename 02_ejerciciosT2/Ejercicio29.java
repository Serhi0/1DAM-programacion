/*
 */
import bpc.daw.objetos.Caja;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
       
        int[]lista={};
        
        //System.out.println(lista[0]+lista[1]);
        
        System.out.println("Si intentamos leer dos valores de una lista que no existe dará ArrayIndexOutOfBoundsException");
        
        System.out.println("Apartado C");
        Caja c = null;
        //c.abrirCaja();   
        //System.out.println(c.getMensaje().length());
        
        System.out.println("Si intentamos leer una caja vacia dará NullPointerException");
    }
}

