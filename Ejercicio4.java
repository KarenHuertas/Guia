
package guia1;

import java.util.Scanner;

/**
 * leer dos numeros, determinar el mayor de los dos e imprimir
 * @author USER
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments.
     * DE: dos numeros
     * DS: Número mayor de dos
     */
    public static void main(String[] args) {
        // 
        float num1;
        float num2;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        num1 = read.nextFloat();
        System.out.println("Introduzca número 2");
        num2 = read.nextFloat();
        
        if (num1 > num2){
            System.out.println("El número mayor es: "+num1);
        }else{
            System.out.println("El número mayor es: "+num2);
        }
    }  
}
