
package guia1;

import java.util.Scanner;

/**
 *Realice un programada que calcule el valor a pagar por 
 *algunos galones de gasolina.
 *Si sabemos que cada litro de gasolina es 9500
 *Imprimr las cantidad de galones, cantidad litros
 *precio por galon y precio a pagar
 * @author USER
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     * DE:cantidad litros
     * DS:C.galones, C.litros, P.galon, P.pagar
     */
    public static void main(String[] args) {
        // 
        double cantidadGalon;
        double litroGasolina;
        double precioGalon;
        float cantidadLitro;
        double precioLitro;
        litroGasolina = 9500;
               
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca cantidad de litros de gasolina");
        cantidadLitro = read.nextInt();
        
        precioLitro = cantidadLitro*litroGasolina;
        cantidadGalon= cantidadLitro*0.26;
        precioGalon = precioLitro*0.26;
        
        System.out.println("La cantidad de galones es: "+cantidadGalon);
        System.out.println("El precio del galon es: "+precioGalon);
        System.out.println("La cantidad de litros es: "+cantidadLitro);
        System.out.println("El precio del litro es: "+precioLitro);
    }  
}
