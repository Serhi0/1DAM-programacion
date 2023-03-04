

package tema5;

/**
 * Clase que crea un Rectángulo
 * 
 * @version 0.1
 * @since 4/3/2023
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Rectangulo {
    
    //ATRIBUTOS
    
    private int base;
    private int altura;
    private int area;
    
    //CONSTRUCTOR
    
    /**
     * Metodo constructor que crea un rectángulo
     * 
     * @param base entero que indica la base del rectángulo
     * @param altura entero que indica la altura del rectángulo
     */
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //SETTERS
    
    /**
     * Metodo que cambia la base del rectángulo
     * 
     * @param b entero que da valor a la base del rectángulo
     */
    public void setBase(int b){
        this.base = b;
    }
    
    /**
     * Metodo que cambia la altura del rectángulo
     * 
     * @param a entero que da valor a la altura del rectángulo
     */
    public void setAltura(int a){
        this.altura = a;
    }
    
    //GETTERS
    
    /**
     * Metodo que devuelve el area del rectángulo
     * 
     * @return entero con el valor del area del rectángulo
     */
    public int getArea(){
       this.area = this.altura*this.base;
       return this.area; 
    }
    
    /**
     * Metodo que devuelve la base del rectángulo
     * 
     * @return entero con el valor de la base del rectángulo
     */
    public int getBase(){
        return this.base;
    }
    
    /**
     * Metodo que devuelve la altura del rectángulo
     * 
     * @return entero con el valor de la altura del rectángulo
     */
    public int getAltura(){
        return this.altura;
    }
    
    /**
     * Metodo Override que devuelve cadena texto informacion del rectángulo
     * 
     * @return Candena de texto con información del rectángulo
     */
    public String toString(){
        String aux ="Altura: "+this.altura+"\n"
                +"Base: "+this.base+"\n"
                +"Area: "+this.area;
        
        return aux;
    }
}
