/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

import java.util.*;

/*5. Escribe un programa al usuario que le pida un valor entero. Ese valor entero se debe
incrementa en 5, utiliza el operador de incremento y se muestra por pantalla. Decrementa
el valor en 4 unidades, utiliza el operador de decremento y muéstralo por pantalla. Utiliza
el operador de incremento unitario sobre la variable y muestra por pantalla su valor. Por
último, utiliza el operador de decremento unitario y muestra por pantalla el nuevo valor. */

public class Examen_ejercicio_5 {
    public static void main(String[] agrs) {
        System.out.println("Introduzca el valor de un entero : ");
        int a = new Scanner(System.in).nextInt();
        
        a += 5;
        System.out.println("el numero ahora es: "+a);
        
        a -= 4;
        System.out.println("el numero ahora es: "+a);
        
        a -- ;
        System.out.println("el numero ahora es: "+a);
        
        a ++ ;
        System.out.println("el numero ahora es: "+a);
        
         a -- ;
        System.out.println("el numero ahora es: "+a);
   

    }
    
}
