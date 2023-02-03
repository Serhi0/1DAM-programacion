

package clases;
import java.time.*;
/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class MarcadorBaloncesto {
    
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    
    public MarcadorBaloncesto(String nL, String nV){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;  
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = f; 
    }
    public MarcadorBaloncesto(String nL,int pL,String nV, int pV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = f;
    }
    @Override
    public String toString(){
        
        String aux;
        aux= nombreLocal+":"+puntosLocal+" "+nombreVisitante+":"+puntosVisitante;
        
        return aux;
    }

}
