
package guia1;

import java.util.Scanner;
/**
 *Calcular el área de un círculo
 *Pedir al usuario datos para el círculo
 * @author USER
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * DE:radio, diametro
     * DS:área del círculo
     */
    public static void main(String[] args) {
        // 
        float radio;
        float diametro;
        double area;
        double pi;
        pi = 3.14;
        char opcion = 2;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Seleccione la opción para "
                + "calcular el área del círculo");
        
        System.out.println("Dígite '1' para radio o Dígite '2' para diametro");
        
        switch (opcion){
            case '1':
                System.out.println("Introduzca el radio");
                radio = read.nextFloat();
                area = pi * (radio*radio);
                System.out.println("El área del círculo es: "+area);
                break;
            case '2':
                System.out.println("Introduzca el diametro");
                diametro = read.nextFloat();
                area = pi * diametro;
                System.out.println("El área del círculo es: "+area);
                break;
        }
    }
}
