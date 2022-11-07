/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

import java.util.*;

/*2. Escribe un programa que muestre por pantalla tu nombre y apellidos dentro de un
rectángulo formado por el carácter ‘*’. Además, debe pedir al usuario que escriba 5 tipos
de datos diferentes para almacenarlos en su variable correspondiente. Por último, se debe
mostrar por pantalla el contenido de cada una de las variables.*/

public class Examen_ejercicio_2 {
    public static void main(String[] args) {
        
        //muestro por pantalla el rectangulo
        System.out.println("*************************");
        System.out.println("*Sergio Morillas Garrido*");
        System.out.println("*************************");
        
        //pido valores al usuario y declaro
        System.out.println("Escribe un valor para int: ");
        int a = new Scanner(System.in).nextInt();
        
        System.out.println("Escribe un valor para double: ");
        double b = new Scanner(System.in).nextDouble();
                
        System.out.println("Escribe un valor para long: ");
        long c = new Scanner(System.in).nextLong();   
        
        System.out.println("Escribe un valor para String: ");
        String d = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe un valor para double: (true o false)");
        boolean e = new Scanner(System.in).nextBoolean();
        
        //Imprimo por pantalla
        System.out.println("El valor para int es: "+a);
        System.out.println("El valor para double es: "+b);
        System.out.println("El valor para long es: "+c);
        System.out.println("El valor para String es: "+d);
        System.out.println("El valor para boolean es: "+e);
        
        
    }
    
}
