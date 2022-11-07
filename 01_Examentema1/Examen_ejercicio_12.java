/*
 */
package examen_ejercicio_1;

import java.util.*;
/**
 12. Escribe un programa que le pida al usuario su edad y muestre por pantalla un mensaje 
diciendo si es menor o mayor de edad. Debes usar un if corto.
 */
public class Examen_ejercicio_12 {
    public static void main(String[] args){
        
        System.out.println("¿Cual es su edad?");
        int  edad = new Scanner(System.in).nextInt();
        
        boolean mayor = edad >= 18 ? true:false;
        
        System.out.println("¿Es mayor de edad? "+mayor);
    }
}
