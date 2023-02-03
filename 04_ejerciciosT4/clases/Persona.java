

package clases;
import clases.DNI;
import java.time.*;
/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Persona {
    
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    public Persona(String n,DNI d,double s, LocalDate fn){
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;
    }
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = s;
        fechaNacimiento = fn;       
    }
    public Persona(String n,DNI d){
        nombre = n;
        dni = d;
        sueldo = 900;
        fechaNacimiento = LocalDate.now().minusYears(20);
    }
    

}
