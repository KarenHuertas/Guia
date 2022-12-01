package guia1;
import java.util.Scanner;
/**
* Determinar la calificación de un Estudiante
*Escala de ponderación:
* 0 y 2.9 insuficiente
* 3.0 y 3.5 regular
* 3.6 y 4.0 bien
* 4.1 y 4.5 muy bien
* 4.6 y 5.0 excelente
* @author USER
*/
public class Ejercicio17 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
        float num;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = read.nextFloat();
        
        if (num <= 2.9){
        System.out.println("La ponderación es insuficiente: "+num);
        }
        if (num >= 3.0 && num <= 3.5){
        System.out.println("La ponderación es regular: "+num);
        }
        if (num >= 3.6 && num <= 4.0){
        System.out.println("La ponderación es bien: "+num);
        }
        if (num >= 4.1 && num <= 4.5){
        System.out.println("La ponderación es muy bien: "+num);
        }
        if (num >= 4.6 && num <= 5.0){
        System.out.println("La ponderación es excelente: "+num);
        }
    }
}