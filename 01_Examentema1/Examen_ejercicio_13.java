/*
 */
package examen_ejercicio_1;

import java.util.*;
/**
 13.  Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). El radio se pedir� por teclado. 
Usa la constante PI y el m�todo pow de Math.
 */
public class Examen_ejercicio_13 {
    public static void main(String[] args){
        
        final double pi = Math.PI;
        double r;
        
        
        System.out.println("Introduzca el radio :");
                double radio = new Scanner(System.in).nextDouble();
                
                r= pi*Math.pow(radio,2);
                
                System.out.println("el �rea del circulo es :"+r);
                
                
                
    }
}
