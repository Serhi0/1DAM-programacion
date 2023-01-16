package tema3;

import java.util.Scanner;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        /*
         * Realiza un programa que pregunte al usuario "¿Eres mayor de edad 
         * (si/no)?". Si el usuario escribe "Si", el ordenador mostrará un 
         * mensaje "El usuario es mayor de edad". Si el usuario escribe "No", el
         * ordenador mostrará "El usuario es menor de edad". Si el usuario 
         * escribe cualquier otra cosa, el ordenador mostrará "No te entiendo" y
         * volverá a hacer la pregunta hasta que el usuario escriba lo correcto. 
         */
        
        String confirma = "";

        while (!confirma.equalsIgnoreCase("si")
                && !confirma.equalsIgnoreCase("no")) {

            System.out.println("¿Eres mayor de edad? (si/no)?");
            confirma = new Scanner(System.in).nextLine();

            if (confirma.equalsIgnoreCase("si")) {
                System.out.println("El usuario es mayor de edad.");
            } else {
                if (confirma.equalsIgnoreCase("no")) {
                    System.out.println("El usuario es menor de edad");
                } else {
                    System.out.println("No te entiendo");
                }
            }
        }
    }
}
