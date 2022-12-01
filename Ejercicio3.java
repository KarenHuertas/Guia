
package guia1;

import java.util.Scanner;

/**
 *Leer un número determinar si es par e impar, imprimir el mensaje
 * @author USER
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * DE: numero
     * DS: nº par e impar e imprimir
     */
    public static void main(String[] args) {
        // 
        float num;
        
        Scanner read = new Scanner(System.in);
        System.out.println();
        num = read.nextFloat();
        if (num == 0){
            System.out.println("El número es cero");
        }else{
            if (num % 2 == 0){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
            }
        } 
    } 
}
