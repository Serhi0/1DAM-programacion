

package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Oficina {
    
    private String nombre;
    private ArrayList<Persona> trabajadores;
    
    public Oficina(String s ){
        nombre = s;
        trabajadores = null;
    }
    public Oficina(String s,int tipo){
        nombre = s;
       if(tipo <=0 || tipo>3){
          trabajadores = null; 
       }else{
            if(tipo >=1){ 
                trabajadores.add(tipo-1,new Persona("Antonio Pérez Pérez",
                new DNI("111111111H"),900,
                LocalDate.parse("28/02/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
           }
           if(tipo >=2){ 
                trabajadores.add(tipo-1,new Persona("Luis López López",
                new DNI("222222222J"),1000, 
                LocalDate.parse("10/09/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                
           }
           if(tipo ==3){ 
                trabajadores.add(tipo-1,new Persona("Ana Díaz Díaz",
                new DNI("333333333P"),1200,
                LocalDate.parse("21/05/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            }    
        }
    }
    public Oficina(){
        
        this("Industrias DAW",3);
        
        
    }

}
