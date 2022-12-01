
package guia1;

import java.util.Scanner;

/**
 *realizar un programada que convierta una temperatura dada en grados centigrados
 *en grados fahrenheit 
 *Imprimir la temperatura en ºC y ºF
 * @author USER
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     * DE:ºC
     * DS:ºC Y ºF
     */
    public static void main(String[] args) {
        // 
        float centigrados;
        double fahrenheit;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca una temperatura en ºC");
        centigrados = read.nextInt();
        
        fahrenheit = (1.8*centigrados)+32;
        
        System.out.println("La temperatura dada en ºC es en ºF: "+fahrenheit);    
    }  
}
