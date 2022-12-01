package guia1;
import java.util.Scanner;
/**
* Realizar un programa que pida N cantidad de números y se sumen
* Imprimir el resultado de la suma
* @author USER
*/
public class Ejercicio21 {
/**
* @param args the command line arguments
* DE: cantidad numeros
* DS: cantidad numeros positivos y negativos
*/
public static void main(String[] args) {
        float num;
        float suma;
        int cantidadN;
        suma = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros deseada: ");
        cantidadN = read.nextInt();
        
        for (int i=0; i<cantidadN; i++){
            System.out.println("Introduzca numero" + (i+1) + ":");
            num = read.nextFloat();
            suma += num;
        }
        System.out.println("La suma es: "+ suma);
    }
}
