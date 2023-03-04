

package tema5;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la clase de una compra sin pasarnos del presupuesto
 * 
 * @version 0.1
 * @since 4/3/2023
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Compras {
    
    //ATRIBUTOS
    
    private double presupuesto;
    private List<Double> precios = new ArrayList<>();
    
    //CONSTRUCTOR
    
    /**
     * Método constructor crea un objeto para hacer compras
     * 
     * @param presupuesto Numero decimal representa la cantidad dinero para el gasto
     */
    public Compras(double presupuesto){
        this.presupuesto = presupuesto;
    }
    
    //SETTER
    
    /**
     * Metodo que recibe un precio y registra en el objeto una compra con dicho 
     * precio.En caso que no hay presupuesto, se lanza una Exception.
     * 
     * @param dinero Número decimal con el valor de la compra
     * @throws java.lang.Exception
     * @throws IllegalStateException Si no hay suficiente presupuesto.
     */
    public void registrarCompra(double dinero) throws Exception{
       
       if(this.presupuesto - dinero >= 0){
           this.precios.add(dinero);
           this.presupuesto -= dinero;
       }else{
           throw new IllegalStateException("No hay suficiente presupuesto. "
                   + "Faltan "+Math.abs(this.presupuesto-dinero));
       }
    }
       
       //GETTER
    
    /**
     * Metodo que devuelve una cadena de texto con la información de la clase
     * 
     * @return Candena de texto con la información de la clase
     */ 
    @Override 
    public String toString(){
        
        int i = 1;
        
        String aux = "Presupuesto Actual: "+this.presupuesto+"\n"
                +"Compras realizadas: \n";    
        
        for(double precio : precios){
            aux +="Articulo: "+i+" Precio: "+precio+"\n";
            i++;
        }     
        return aux;
    } 
}
