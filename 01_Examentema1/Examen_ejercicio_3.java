/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

import java.util.*;

/*3. Haz un programa que pregunte al usuario tres números enteros y guárdalos en variables
llamadas horas, minutos y segundos. El programa mostrará el número total de segundos
que hay juntando las cantidades de tiempo expresadas en las tres variables*/

public class Examen_ejercicio_3 {
    public static void main(String[] args) {
        
        //Pido variables e inicializa el usuario
        System.out.println("Introduzca el primer numero entero (para horas): ");
        int horas = new Scanner(System.in).nextInt();
        
        System.out.println("Introduzca el segundo numero entero (para minutos): ");
        int minutos = new Scanner(System.in).nextInt();
        
        System.out.println("Introduzca el tercer numero entero (para segundos): ");
        int segundos = new Scanner(System.in).nextInt();
        
        //calculos
        int resultado;
        resultado = horas * 60;
        minutos += resultado;
        resultado = minutos * 60;
        resultado += segundos;
        
        //muestro por pantalla
        System.out.println("El total de segundos es:"+resultado);
        
        
        
        
        
        
        
    }
    
}
