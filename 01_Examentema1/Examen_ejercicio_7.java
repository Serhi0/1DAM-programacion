/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ejercicio_1;

/**
 7. Realiza un programa con las variables que aparecen a continuaci�n, y a continuaci�n
muestre por pantalla su suma, su producto, divisi�n, multiplicaci�n y resto de la divisi�n.
String n1 = �123�;
String n2 = �69�
 */
public class Examen_ejercicio_7 {
    public static void main(String[] args) {
        
        String n1 = "123";
        String n2 = "69";
        
        double nn1 =Double.parseDouble(n1);
        double nn2 =Double.parseDouble(n2);
        double resultado;
        
        resultado = nn1 + nn2;
        System.out.println(nn1+" + "+nn2+" = "+resultado);
        
        resultado = nn1 - nn2;
        System.out.println(nn1+" - "+nn2+" = "+resultado);
        
        resultado = nn1 * nn2;
        System.out.println(nn1+" * "+nn2+" = "+resultado);
        
        resultado = nn1 / nn2;
        System.out.println(nn1+" / "+nn2+" = "+resultado);
        
        resultado = nn1 % nn2;
        System.out.println(nn1+" % "+nn2+" = "+resultado);

        
        
    }
    
}
