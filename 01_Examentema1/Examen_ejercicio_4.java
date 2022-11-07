/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

import java.util.*;

/*4. Realiza un programa que pregunte al usuario la edad de dos personas. El programa
mostrará si ambas son mayores de edad, y también si la primera persona es mayor que la
segunda. (no puedes usar la estructura condicional if).
 */
public class Examen_ejercicio_4 {
    public static void main(String[] args) {
        
        //inicializo y pido valor
        System.out.println("Introduzca la edad de la primera persona: ");
        int a = new Scanner(System.in).nextInt();
        
        System.out.println("Introduzca la edad de la segunda persona: ");
        int b = new Scanner(System.in).nextInt();
        
        //declaro
        boolean mayoresedad, primeramayor;
        
        //calculos
        mayoresedad = (a >= 18) && (b >= 18);
        primeramayor = a > b;
        
        //muestro por pantalla
        System.out.println("¿Son las dos mayores de edad? "+mayoresedad);
        System.out.println("¿Es la primera persona mayor que la segunda? "+mayoresedad);
        
        
        
        
        
        
        
    }
    
}
