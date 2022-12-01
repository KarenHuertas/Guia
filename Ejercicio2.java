
package guia1;


import java.util.Scanner;

/**
 *Leer un numero e imprimir si es positivo o negativo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * DE: numero
     * DS: positivo o negativo
     */
    public static void main(String[] args) {
        // 
        Float num;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca número");
        num = read.nextFloat();
        
        if (num>0){
            System.out.println("El número es positivo");
        }else{
            if (num == 0){
                System.out.println("El número es cero");
            }else{
                System.out.println("El número es negativo");
            }
        }
    }    
}
