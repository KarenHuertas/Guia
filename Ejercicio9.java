
package guia1;

import java.util.Scanner;

/**
 *Dado un monto en pesos calcular el 15% menos y el 15% más
 *Imprimir el monto inicial y con el descuento y con el aumento
 * @author USER
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * DE:monto, 15% menos, 15% más
     * DS: monto inicial, con descuesto y con aumento
     */
    public static void main(String[] args) {
        // 
        float monto;
        double descuento = 0.15;
        double aumento = 0.15;

        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca un monto");
        monto = read.nextInt();
        
        descuento = monto * descuento;
        descuento = monto - descuento;
        aumento = monto * aumento;
        aumento = aumento + monto;
        
        System.out.println("El monto inicial es: "+monto);
        System.out.println("El monto con descuento es: "+descuento);
        System.out.println("El monto con aumento es: "+aumento);
    }
}
