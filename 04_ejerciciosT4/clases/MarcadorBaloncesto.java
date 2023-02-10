

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
       
        this(nL,nV,null);
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
    
        this(nL,0,nV,0,f);
    }
    public MarcadorBaloncesto(String nL,int pL,String nV, int pV, LocalDate fecha){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        this.fecha = fecha;
    }
    public void añadirCanasta(char equipo, int puntos){
        if(equipo =='L'&& (puntos < 0 || puntos <= 3) ){
            puntosLocal += puntos;
        }else{
            if(equipo =='V' && (puntos < 0 || puntos <=3)){
                puntosVisitante += puntos;
            }
        }
    }
    public void reset(){
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    public int getPuntosLocal(){
        return puntosLocal;
    }
    public int getPuntosVisitante(){
        return puntosVisitante;
    }
    public boolean ganaLocal(){
        return (puntosLocal>puntosVisitante);
    }
    public boolean ganaVisitante(){
        return (puntosVisitante>puntosLocal);
    }
    public boolean hayEmpate(){
        return (puntosLocal == puntosVisitante);
    }
    @Override
    public String toString(){
        
        String aux;
        aux= "Marcador de Baloncesto: \n"+
              nombreLocal+":"+puntosLocal+" "+nombreVisitante+":"+puntosVisitante+
              "\n"+"Fecha: "+fecha;
        
        return aux;
    }

}
