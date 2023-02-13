

package clases;
import clases.DNI;
import java.time.*;
import clases.CuentaCorriente;
import java.time.format.DateTimeFormatter;


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
        cuenta =  new CuentaCorriente();
        
    }
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        /*nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = s;
        fechaNacimiento = fn;  
        cuenta = new CuentaCorriente();*/
        this(n,new DNI(numDNI,letraDNI),s,fn);
    }
    public Persona(String n,DNI d){
        /*nombre = n;
        dni = d;
        sueldo = 900;
        fechaNacimiento = LocalDate.now().minusYears(20);
        cuenta = new CuentaCorriente();*/
        this(n,d,900,LocalDate.now().minusYears(20));
    }
    public Persona(String n, int numDNI, char letraDNI){
        /*nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = 900;
        fechaNacimiento = LocalDate.now().minusYears(20);
        cuenta = new CuentaCorriente();*/
        this(n,new DNI(numDNI,letraDNI),900,LocalDate.now().minusYears(20));
    }
    public void aumentarSueldo(int porcentaje){
        sueldo += (sueldo*porcentaje)/100;  
    }
    public void cobrarSueldo(){
        cuenta.añadirDinero((int) sueldo);
    }
    public String getNombre(){
        return nombre;   
    }
    public DNI getDNI(){
        return dni;
    }
    public double getSueldo(){
        return sueldo;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public CuentaCorriente getCuentaCorriente(){
        return cuenta;
    }
    public boolean esMayorEdad(){
        
        return (fechaNacimiento.compareTo(LocalDate.now().minusYears(18))<= 0);
             
    }
    public boolean tieneDinero(){
        
        return (cuenta.getSaldo() > 0);
       
    }
    public boolean esMileurista(){
        
        return(sueldo < 1200);
         
    }
    @Override
    public String toString(){
        String aux;
        if(fechaNacimiento == null){
            aux = "Nombre: "+nombre + dni.toString()+ " Fecha nacimiento: Sin registro"
                    +" "+cuenta.toString();
        }else{
            aux = "Nombre: "+nombre+" DNI: "+dni+ " Fecha nacimiento: "
            +fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    +" "+cuenta.toString(); 
        }
        return aux;
    }
}