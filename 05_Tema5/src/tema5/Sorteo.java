

package tema5;

/**
 * La clase representa un sorteo en el que participan la cantidad de personas
 * indicada en la propiedad “totalParticipantes”.
 * 
 * @version 0.1
 * @since 4/3/2023
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Sorteo {

    //ATRIBUTOS
    
    private double dineroCupon;
    private int pagosRealizados =0;
    private int pagosPendientes;
    private int totalParticipantes;
    private double dineroRecogido =0;
    
    //CONSTRUCTORES
    
    /**
     *  Metodo constructor de un Sorteo
     * 
     * @param dineroCupon numero decimal guarda el dinero cuesta el cupon
     * @param totalPersonas  entero que representa las personas que participan
     */
    public Sorteo (double dineroCupon, int totalPersonas){
        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
        this.pagosPendientes = totalPersonas;
    }
    
    //SETTERS
    
    /**
     * Metodo que registra un pago
     * 
     */
    public void registarPago(){
        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido += this.dineroCupon;
    }
    
    /**
     * Metodo que apunta a un nuevo participante
     * 
     */
    public void apuntarNuevoParticipante(){
        this.totalParticipantes++;
        this.pagosPendientes++;
    }

    /**
     * Metodo que devuelve cadena de texto con la información del Sorteo
     * 
     * @return Cadena de texto con la información del Sorteo
     */
    @Override
    public String toString(){
      String aux = "Precio del cupón: "+this.dineroCupon+"\n"
              +"Personas que participan: "+this.totalParticipantes+"\n"
              +"Pagos realizados: "+this.pagosRealizados+"\n"
              +"Pagos pendientes: "+this.pagosPendientes+"\n"
              +"Dinero recogido: "+this.dineroRecogido;
      
      return aux;
    }
    
}
