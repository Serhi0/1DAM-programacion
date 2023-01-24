


package examen3;

import java.util.*;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio2Examen3 {

    
    public static void main(String[] args) {
        
        int numero=0, suma=0, contador=0;
        double media;
        boolean repetir = true;
        
        System.out.println("Introduzca n�meros hasta que el acomulado sea"
                + "mayor de 10000");
        while(repetir){
            while(repetir){
                System.out.println("Introduzca n�mero");
                try{
                    numero = new Scanner(System.in).nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Error: "+e.getMessage());
                }
                if(numero<0){
                    System.out.println("N�mero negativo, repita.");
                }else{
                    repetir = false;
                }
            }
            contador++;
            suma += numero;
            if(suma<10000){
                repetir = true;
            }
        }
        media=suma/(contador*1.0);
        System.out.println("El total acumulado es: "
        +suma+" ha introducido "+contador+" numeros"
        +" y la media es: "+media);
    }

}
