/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

/**
 8. Declara una lista con las cinco vocales. Otra con 5 valores decimales. Otra con los nombres
de los lenguajes de programaci�n que conoces. Muestra por pantalla la ultima posici�n de
cada una de las listas. As�gnale a la primera posici�n de la lista de lenguajes de
programaci�n el valor �Cobol�. Muestra por pantalla el valor de la primera posici�n despu�s
de modificarlo.
 */
public class Examen_ejercicio_8 {
    public static void main(String[] args) {
        
        String[] vocales={"a","e","i","o","u"};
        double [] decimales={10.10, 11.11, 12.12, 13.13, 14.14};
        String[] lenguajes={"java","c++","c","phyton","javascrit"};
        
        System.out.println(vocales[vocales.length -1]+" "+decimales[decimales.length-1]+" "+lenguajes[lenguajes.length-1]);
        
        lenguajes[0] = "Cobol";
        
        System.out.println(vocales[0]+" "+decimales[0]+" "+lenguajes[0]);
        
                
    }
    
}
