
package guia1;

import java.util.Scanner;

/**
 *Calcula el área de un cuadrado, pedir al usuario los datos para el cálculo
 * @author USER
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * DE:lado
     * DS:área del cuadrado
     */
    public static void main(String[] args) {
        // 
        float lado;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca el número en metros");
        lado = read.nextFloat();
        
        lado *= lado; 
        
        System.out.println("El cuadrado es: "+lado);
        
    }
}
