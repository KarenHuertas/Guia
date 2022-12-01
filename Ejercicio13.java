package guia1;
import java.util.Scanner;
/**
*Calcular el área de un círculo
*Pedir al usuario datos para el círculo
* @author USER
*/
public class Ejercicio13 {
/**
* @param args the command line arguments
* DE: altura y base
* DS: área del rectángulo
*/
public static void main(String[] args) {
        float area;
        float base;
        float altura;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca altura del rectángulo");
        altura = read.nextFloat();
        System.out.println("Introduzca base del rectángulo");
        base = read.nextFloat();
        area = base*altura;
        System.out.println("El área del rectángulo es: "+area);
    }
}
