package guia1;
import java.util.Scanner;
/**
* Un estudiante desea realizar el cálculo de promedio de sus notas, 
* se debe leer las notas del estudiante y calcular el promedio e imprimirlo.
* @author USER
*/
public class Ejercicio24 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
        float acumulador;
        float num;
        int cantidadN;
        acumulador = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca notas deseadas: ");
        cantidadN = read.nextInt();
        
        for (int i=0; i<cantidadN;i++){
            System.out.println("Introduzca la nota" + (i+1) + ":");
            num = read.nextFloat();
            acumulador += num;
        }
        System.out.println("El promedio de las notas es: " +(acumulador/cantidadN));
}}