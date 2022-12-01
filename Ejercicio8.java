
package guia1;

import java.util.Scanner;

/**
 *Leer 3 números
 *Imprimir solo los números pares que se encuentren entre el rango 100 y 200
 * @author USER
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     * DE: 3 números
     * DS: numeros pares entre 100 y 200
     */
    public static void main(String[] args) {
        // 
        float num1;
        float num2;
        float num3;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca el número 1");
        num1 = read.nextFloat();
        if (num1 < 100 || num1 > 200){
            System.out.println("El número es inválido");
            }
        System.out.println("Tntroduzca el número 2");
        num2 = read.nextFloat();
        
        System.out.println("Tntroduzca el número 3");
        num3 = read.nextFloat();
        
        if (num1 < 100 || num1 > 200 && num1 == 0){
            System.out.println("El número es INVALIDO");
            }else{
            System.out.println("El número " +num1+ " es primo");
            }
        if (num2 < 100 || num2 > 200 && num2 == 0){
            System.out.println("El número es INVALIDO");
            }else{
            System.out.println("El número " +num2+ " es primo");
            }
        if (num3 < 100 || num3 > 200 && num3 == 0){
            System.out.println("El número es INVALIDO");
            }else{
            System.out.println("El número " +num3+ " es primo");
        }
    }
}    
