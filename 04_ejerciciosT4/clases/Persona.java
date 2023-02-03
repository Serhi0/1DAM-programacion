package clases;
import clases.DNI;
import java.time.*;
import clases.CuentaCorriente;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Persona {
    
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;
    
    public Persona(String n,DNI d,double s, LocalDate fn){
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;
        this.cuenta = cuenta = new CuentaCorriente();
        
    }
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = s;
        fechaNacimiento = fn;  
        this.cuenta = cuenta = new CuentaCorriente();
    }
    public Persona(String n,DNI d){
        nombre = n;
        dni = d;
        sueldo = 900;
        fechaNacimiento = LocalDate.now().minusYears(20);
        this.cuenta = cuenta = new CuentaCorriente();
    }
    public void aumentarSueldo(int porcentaje){
        sueldo %= porcentaje;  
    }
    public void cobrarSueldo(){
        this.cuenta.añadirDinero((int) sueldo);
    }
    

}