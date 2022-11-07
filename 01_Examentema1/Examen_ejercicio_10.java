package examen_ejercicio_1;

import java.util.*;

/**
 10. Realiza un programa que pregunte al usuario tres números enteros y nos diga cual es el
mayor de los tres y también tiene que contemplar la opción de que sean iguales
 */
public class Examen_ejercicio_10 {
    public static void main(String[] args) {
        
        System.out.println("Escriba el primer numero entero: ");
        int a = new Scanner(System.in).nextInt();
        
        System.out.println("Escriba el segundo numero entero: ");
        int b = new Scanner(System.in).nextInt();
        
        System.out.println("Escriba el tercero numero entero: ");
        int c = new Scanner(System.in).nextInt();
        
        int r;
        
        if(a>=b){
            r=a;
            if(c>=a){
                r=c;
            }
        }else{
            r=b;
            if(c>=b){
                r=c;
            }
        }
            
        System.out.println("El numero mayor es "+r);    
            
            
            
            
        
    }
}
