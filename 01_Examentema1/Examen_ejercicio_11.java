/*
 */
package examen_ejercicio_1;

/**
11. Realiza un programa en el que haya una variable entera llamada a�o inicializada con 
cualquier valor positivo. El programa mostrar� por pantalla si el a�o guardado en dicha 
variable es bisiesto. Ten en cuenta que un a�o es bisiesto cuando se cumple alguna de estas
dos condiciones:
 - Es m�ltiplo de 400
 - No es m�ltiplo de 400, pero es m�ltiplo de 4 y no es m�ltiplo de 100
 */
public class Examen_ejercicio_11 {
    public static void main(String[] args){
         
        int anio = 2020;
        
        boolean condicion1 = (anio%400 == 0);
        boolean condicion2 = (anio%400 !=0 && anio%4==0 && anio%100 != 0);
        
        if(condicion1){
            System.out.println("Es Bisiesto");
        }else {
            if(condicion2) {
                System.out.println("Es Bisiesto");
            }else{
                System.out.println("No es Bisiesto");
            }
        }
        
        
    }
    
}
