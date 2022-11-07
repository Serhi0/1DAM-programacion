/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

import java.util.*;

/**
 9. Realiza un programa que pregunte un número comprendido entre 10 y 56 por teclado al
usuario. Si el número está en dicho rango, el programa mostrará un mensaje de que es
correcto, y en caso contrario, se indicará que no lo es. 
 */
public class Examen_ejercicio_9 {
    public static void main(String[] args) {
        
        System.out.println("escribe un numero entre 10 y 56");
        int a = new Scanner(System.in).nextInt();
        
        if(a>= 10 && a<=56){
           System.out.println("Es correcto"); 
        }else{
            System.out.println("El numero no es correcto");
        }
        
    }
    
}
