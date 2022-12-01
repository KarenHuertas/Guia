
package guia1;

import java.util.Scanner;

/**
 *Calcula el área de un triángulo equilatero 
 *Pedir al usuario los datos para el cálculo
 * @author USER
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * DE:base, altura y área
     * DS:base, alutra y área 
     */
    public static void main(String[] args) {
        // 
        float base;
        float altura;
        float area;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca la base del triángulo equilatero");
        base = read.nextFloat();
        System.out.println("Tntroduzca la altura del triángulo equilatero");
        altura = read.nextFloat();
        
        area = base*altura;
        
        System.out.println("El área del triangulo equilatero es: "+area);
    }
}
