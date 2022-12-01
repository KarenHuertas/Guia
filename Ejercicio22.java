package guia1;
import java.util.Scanner;
/**
* Leer N cantidad de números
* imprimir la cantidad de positivo y cantidad de negativos. 
* @author USER
*/
public class Ejercicio22{
/**
* @param args the command line arguments
* DE: cantidad N números
* DS: suma de N cantidad números
*/
public static void main(String[] args) {
        float numPositivo;
        float numNegativo;
        float num;
        int cantidadN;
        numPositivo = 0;
        numNegativo = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros deseada: ");
        cantidadN = read.nextInt();
        
        for (int i=0; i<cantidadN; i++){
            System.out.println("Introduzca numero" + (i+1) + ":");
            num = read.nextFloat();
        
        if (num == 0){
            numPositivo++;
            }else{
        if (num == 0){
         System.out.println("El numero es neutral");
            }else{
        numNegativo++;
                }
            }
        }
        System.out.println("Los numeros positivos encontrados son: " + numPositivo);
        System.out.println("Los numeros negativos encontrados son " + numNegativo);
   }
}