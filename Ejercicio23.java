package guia1;
import java.util.Scanner;
/**
* Leer N cantidad de números  
* imprimir la cantidad de pares y cantidad de impares
* @author USER
*/
public class Ejercicio23 {
/**
* @param args the command line arguments
* DE: cantidad N numeros
* DS: cantidad pares e impares
*/
public static void main(String[] args) {
        int numPar;
        int numImpar;
        int num;
        int cantidadN;
        numPar = 0;
        numImpar = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros deseada: ");
        cantidadN = read.nextInt();
        
        for (int i=0; i<cantidadN; i++){
            System.out.println("Introduzca numero" + (i+1) + ":");
            num = read.nextInt();
        
        if (num % 2 ==0){
            numPar++;
            }else{
            numImpar++;
         }
        }
        System.out.println("Los números positivos ingresados: " + numPar);
        System.out.println("Los números negativos ingresados: " + numImpar);
    }
}