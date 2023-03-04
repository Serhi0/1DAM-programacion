

package tema5;

/**
 * Clase que crea un Rect�ngulo
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
     * Metodo constructor que crea un rect�ngulo
     * 
     * @param base entero que indica la base del rect�ngulo
     * @param altura entero que indica la altura del rect�ngulo
     */
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //SETTERS
    
    /**
     * Metodo que cambia la base del rect�ngulo
     * 
     * @param b entero que da valor a la base del rect�ngulo
     */
    public void setBase(int b){
        this.base = b;
    }
    
    /**
     * Metodo que cambia la altura del rect�ngulo
     * 
     * @param a entero que da valor a la altura del rect�ngulo
     */
    public void setAltura(int a){
        this.altura = a;
    }
    
    //GETTERS
    
    /**
     * Metodo que devuelve el area del rect�ngulo
     * 
     * @return entero con el valor del area del rect�ngulo
     */
    public int getArea(){
       this.area = this.altura*this.base;
       return this.area; 
    }
    
    /**
     * Metodo que devuelve la base del rect�ngulo
     * 
     * @return entero con el valor de la base del rect�ngulo
     */
    public int getBase(){
        return this.base;
    }
    
    /**
     * Metodo que devuelve la altura del rect�ngulo
     * 
     * @return entero con el valor de la altura del rect�ngulo
     */
    public int getAltura(){
        return this.altura;
    }
    
    /**
     * Metodo Override que devuelve cadena texto informacion del rect�ngulo
     * 
     * @return Candena de texto con informaci�n del rect�ngulo
     */
    public String toString(){
        String aux ="Altura: "+this.altura+"\n"
                +"Base: "+this.base+"\n"
                +"Area: "+this.area;
        
        return aux;
    }
}
