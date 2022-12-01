
package guia1;

import java.util.Scanner;

/**
 * Leer un número y calcular
 * el cuadrado
 * el cubo
 * imprimir resultados
 * @author USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * DE:numero
     * DS:cuadrado y cubo de un numero
     */
    public static void main(String[] args) {
        // 
        float num;
        float cuadrado;
        float cubo;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca nº");
        num = read.nextFloat();
        
        cuadrado = num*num;
        cubo = num*num*num;
        
        System.out.println("El cuadrado del número es: "+cuadrado);
        System.out.println("El cuubo del número es: "+cubo); 
    } 
}
