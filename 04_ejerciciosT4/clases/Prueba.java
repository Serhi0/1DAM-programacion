


package clases;
import clases.Oficina;
import clases.DNI;
import clases.Caja;
import java.time.LocalDate;
import java.time.Month;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Prueba {

    
    public static void main(String[] args) {
        
      Oficina a = new  Oficina();
      
        System.out.println(a.toString()); 

        DNI b = new DNI(99999999,'Y');
        System.out.println(b.toString());
        Caja c = new Caja(true,"");
        System.out.println(c.toString());
        MarcadorBaloncesto d = new MarcadorBaloncesto("rojo","azul");
        System.out.println(d.toString());
        Persona h = new Persona("toby",88888888,'H',10,null);
        System.out.println(h.toString());
        Punto w = new Punto (45.0,300);
        System.out.println(w.toString());
        CuentaCorriente z = new CuentaCorriente();
        z.añadirDinero(1000);
        System.out.println(z.toString());
        c.setMensaje("prueba");
        c.pasarMayusculas();
        System.out.println(c.toString());
        d.añadirCanasta('L',3);
        System.out.println(d.toString());
        d.reset();
        System.out.println(d.toString());
        Persona kevin = new Persona("Kevin",99999999,'T',9000,LocalDate.of(1988, Month.MARCH, 1));
        kevin.aumentarSueldo(50);
        kevin.cobrarSueldo();
        System.out.println(kevin.toString());
        a.añadirEmpleado("manuel", "33333333H", 0, LocalDate.of(1988, Month.MARCH, 1));
        System.out.println(a.toString());
       
        System.out.println(kevin.esMayorEdad());
        System.out.println(kevin.esMileurista());
        System.out.println(kevin.tieneDinero());
        System.out.println(kevin.getCuentaCorriente());
        c.cerrar();
        System.out.println(c.getMensaje());
        a.mostrarInformeEmpleados();
        System.out.println(d.getPuntosLocal());
        System.out.println(d.hayEmpate());
}       
}
