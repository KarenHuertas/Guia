
package guia1;

import java.util.Scanner;

/**
 *Dado 4 notas de un estudiante calcular el promedio del estudiante
 * imprimir las notas y el promedio
 * @author USER
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * DE:4 notas
     * DS:notas y promedio
     */
    public static void main(String[] args) {
        // 
        float num1;
        float num2;
        float num3;
        float num4;
        float promedio;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca nota 1");
        num1 = read.nextFloat();
        System.out.println("Tntroduzca nota 2");
        num2 = read.nextFloat();
        System.out.println("Tntroduzca nota 3");
        num3 = read.nextFloat();
        System.out.println("Tntroduzca nota 4");
        num4 = read.nextFloat();
        
        promedio = num1 + num2 + num3 + num4;
        
        System.out.println("Las notas son: "+num1);
        System.out.println("Las notas son: "+num2);
        System.out.println("Las notas son: "+num3);
        System.out.println("Las notas son: "+num4);
        
        System.out.println("El promedio es: "+(promedio/4));
        
        
    }
    
}
