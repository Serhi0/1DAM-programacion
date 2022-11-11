/*
 */
package pystrings01;

import java.util.*;
/**
 *
 * @author Sergio
 */

//Se puede ejecutar de dos formas, intercambiando el comentario de
//forma 1* por forma 2*

public class Pystrings03 {
    public static void main(String[] args){
        
        System.out.println("Traductor de latín, Introduce una palabra: ");
        String palabra = new Scanner(System.in).nextLine();
        
        StringBuilder traductor = new StringBuilder(palabra); //forma 2*
        //String traductor; // forma 1*
        boolean a = palabra.endsWith("a");
        boolean e = palabra.endsWith("e");
        boolean i = palabra.endsWith("i");
        boolean o = palabra.endsWith("o");
        boolean u = palabra.endsWith("u");
        
        
        if(a||e||i||o||u){
        //traductor = palabra.substring(0, palabra.length()-1); //forma 1*
        //traductor = traductor+"us"; //forma 1*
        
        traductor.replace(palabra.length()-1, palabra.length(),"us"); //forma 2*
        }else{
        //traductor = palabra+"us"; //forma 1*
        traductor.insert(palabra.length(),"us"); //forma 2*
        }
        
        System.out.println(traductor);
    }
}
