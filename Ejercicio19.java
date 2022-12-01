package guia1;
import java.util.Scanner;
/**
* Realizar una calculadroa de hipotenusa o catetos
* @author USER
*/
public class Ejercicio19 {
/**
* @param args the command line arguments
* DE:incognitas hipotenusa, Cateto adyacente y opuesto
* DS:respuesta de la incognita de hipotenusa, cateto adyacente y cateto opuesto
*/
public static void main(String[] args) {
        double hipotenusa;
        double catAdy;
        double catOp;
        double resultante;
        char opcion;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Dígite las siguientes opcines");
        System.out.println("Opcion '1': Hallar Cateto hipotenusa");
        System.out.println("Opcion '2': Hallar Cateto Adyacente");
        System.out.println("Opcion '3': Hallar Cateto Opuesto\n");
        opcion = read.next().charAt(0);
        
        switch (opcion){
            case '1':
            System.out.println("Introduzca cateto adyacente");
            catAdy = read.nextDouble();
            System.out.println("Introduzca cateto opuesto");
            catOp = read.nextDouble();
            hipotenusa = ((catAdy*2)+(catOp*2));
            resultante = Math.sqrt(hipotenusa);
            System.out.println("La hipotenusa es: "+resultante);
            break;
            case '2':
            System.out.println("Introduzca la hipotenusa");
            hipotenusa = read.nextDouble();
            System.out.println("Introduzca cateto opuesto");
            catOp = read.nextDouble();
            catAdy = ((hipotenusa*2)-(catOp*2));
            resultante = Math.sqrt(catAdy);
            System.out.println("El cateto adyacente es: "+resultante);
            break;
            case '3':
            System.out.println("Introduzca cateto adyacente");
            catAdy = read.nextDouble();
            System.out.println("Introduzca hipotenusa");
            hipotenusa = read.nextDouble();
            catOp = ((catAdy*2)-(hipotenusa*2));
            resultante = Math.sqrt(catOp);
            System.out.println("El cateto opuesto es: "+resultante);
            break;
        }
    }
}
