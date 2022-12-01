package guia1;
import java.util.Scanner;
/**
* Dado las fracciones integradas por el usuario
* Determinar si son fracciones equivalentes
* @author USER
*/
public class Ejercicio20{
/**
* @param args the command line arguments
*DE: dos fracciones
*DS: si son o no fracciones equivalentes
*/
public static void main(String[] args) {
        float numerador1;
        float denominador1;
        float numerador2;
        float denominador2;
        float resultado1;
        float resultado2;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca numerador de la fraccion 1: ");
        numerador1 = read.nextFloat();
        System.out.println("Introduzca denominador de la fraccion 1: ");
        denominador1 = read.nextFloat();
        resultado1 = (numerador1/denominador1);
        System.out.println("Introduzca numerador de la fraccion 2: ");
        numerador2 = read.nextFloat();
        System.out.println("Introduzca denominador de la fraccion 2: ");
        denominador2 = read.nextFloat();
        resultado2 = (numerador2/denominador2);
        
        if (resultado1 == resultado2){
            System.out.println("son fracciones equivalentes");
            }else {
            System.out.println("no son fracciones equivalentes");
        }
    }
}