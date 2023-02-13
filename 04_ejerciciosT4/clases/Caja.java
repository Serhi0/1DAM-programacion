

package clases;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Caja {
    
    private boolean abierto;
    private String mensaje;
    
    public Caja(String m){
       
        this(false,m);
    }
    public Caja(boolean a, String m){
        mensaje = m;
        abierto = a;
    }
    public Caja(){
       
        this(false,"Viva el tema 7");
    }
    public void setMensaje(String m){
        if(abierto){
            mensaje = m;
        }
        
    }
    public void pasarMayusculas(){
        mensaje = mensaje.toUpperCase();
    }
    public void abrir(){
        abierto = true;
    }
    public void cerrar(){
        abierto = false;
    }
    public String getMensaje(){
        
        String aux;
        
        if(abierto){
           aux = mensaje;
        }else{
            aux =null; // el profesor prefiere cadena vacia.
        }
        return aux;
    }
    @Override
    public String toString(){
       String aux;
        if(abierto){
           aux = "Estado: Abierta, " +"Mensaje: "+mensaje;
       }else{
           aux = "Estado: Cerrada, " +"Mensaje: "+mensaje;
       }      
       
       return aux;
    }
    

}
