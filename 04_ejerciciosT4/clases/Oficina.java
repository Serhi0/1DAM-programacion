

package clases;

import clases.DNI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import clases.Persona;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Oficina {
    
    private String nombre;
    private ArrayList<Persona> trabajadores;
    
    public Oficina(String s ){
        /*nombre = s;
        trabajadores = null;*/
        this(s,0);
    }
    public Oficina(String s,int tipo){
        this.trabajadores = new ArrayList<Persona>();
        nombre = s;
       if(tipo <=0 || tipo>3){
          trabajadores = null; 
       }else{
            if(tipo >=1){ 
                trabajadores.add(new Persona("Antonio Pérez Pérez",
                new DNI("11111111H"),900,
                LocalDate.of(2020, 2, 28)));
                
           }
           if(tipo >=2){ 
                trabajadores.add(new Persona("Luis López López",
                new DNI("22222222J"),1000, 
                LocalDate.of(1995, 9, 10)));
                
           }
           if(tipo ==3){ 
                trabajadores.add(new Persona("Ana Díaz Díaz",
                new DNI("33333333P"),1200,
                LocalDate.of(1985, 5, 21)));
            }    
        }
    }
    public Oficina(){
        
        this("Industrias DAW",3);
    }
    public void añadirEmpleado(Persona p){
        trabajadores.add(p);
    }
    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac){
        trabajadores.add(new Persona(nombre,new DNI(DNI),sueldo,fechaNac));
    }
    public int getTotalEmpleados(){
        return trabajadores.size();
    }
    public int getTotalEmpleadosMileuristas(){
        int aux =0;
        
        for (Persona p : trabajadores){
            if(p.esMileurista()){
                aux++;
            }
        }
        return aux;
    }
    public List<Persona> getMileuristas(){
        
        ArrayList<Persona> aux = new ArrayList();
        
        for (Persona p : trabajadores){
            if(p.esMileurista()){
                aux.add( p);
            }
        }
        return aux;  
    }
    public boolean trabaja(Persona p){
       return trabajadores.contains(p);
    }
    public void pagarEmpleados(){
        for (Persona p : trabajadores){
            p.cobrarSueldo();
        }
    }
    public void mostrarInformeEmpleados(){
        String aux;
        for (Persona p : trabajadores){
            aux = p.esMileurista() == true ? "Si":"No";
            System.out.println("nombre: "+p.getNombre()+" Sueldo: "+p.getSueldo()
                    +" Mileurista: "+aux); 
        }
        
    }
    @Override
    public String toString(){
        
        String aux = "Nombre Oficina: " + nombre + "\n";
        
        for (Persona p : trabajadores){
            aux += p.toString() +"\n";
        }
        return aux;
    }
}
