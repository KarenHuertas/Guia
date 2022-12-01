
package guia1;

import java.util.Scanner;
/**
 *ejercicio16 guia1 
 * @author USER
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * DE:cantidad horas trabajadas, valor horas de trabajo
     * DS:cantidad horas trabajadas y el pago
     */
    public static void main(String[] args) {
        // 
        int cantidadTrabajo;
        float valorHoras;
        float horaMes;
        float pagoMes;
        
        horaMes = 0;
        pagoMes = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca cantidad horas trabajadas");
        cantidadTrabajo = read.nextInt();
        System.out.println("Introduzca valor horas");
        valorHoras = read.nextInt();
        
        if (cantidadTrabajo >= 38 && cantidadTrabajo <= 56){
           horaMes = cantidadTrabajo*4;
           pagoMes = horaMes*valorHoras;
        }
        System.out.println("La cantidad de horas trabajadas en el mes es:"+horaMes);
        System.out.println("El pago en el mes es: "+pagoMes);      
    }  
}
