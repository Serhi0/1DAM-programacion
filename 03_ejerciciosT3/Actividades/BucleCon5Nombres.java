


package juegor;

import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class BucleCon5Nombres {

    
    public static void main(String[] args) {
        
        int contador = 0;
        List<String> lista = new ArrayList<String>();
        
        while(contador < 5 ){
            System.out.println("Escribe un nombre");
            String nombre = new Scanner(System.in).nextLine();
            lista.add(nombre);
            contador ++;
            
        
    }
        System.out.println("Ha escrito"+contador+" nombres");
        System.out.println(lista);
    }

}
