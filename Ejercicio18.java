
package guia1;

import java.util.Scanner;

/**
     * realizar un algoritmo qye calcule el salario a pagar de un empleado
     * según los siguientes parametros
     * 
     * Si gana menos de 700.000, descuento de pensión =-2%, 
     * descuento de salud =-4% y más Aux. de transporte= +11%.
     * 
     * Si gana entre 741.000 y 999.999, descuento de pensión =-4%, 
     * descuento de salud =-6% y más Aux. de transporte= +9%.
     * 
     * Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, 
     * descuento de segurode vida 5%, descuento de salud =-6% 
     * y más Aux. de transporte= +9%.
     * 
     * Si gana más de 1.800.000 y menos de 2.500.00, 
     * descuento por pensión es -6%, descuento de seguro de vida 5%, 
     * descuento de salud =-8% y más Aux. de transporte= +8%.
     * 
     * Si gana más de 2.500.000, descuento por pensión es -8%, 
     * descuento de seguro de vida 6%, descuento de salud =-10% 
     * y más Aux. de transporte= +9%.
     *
 * @author USER
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     * DE: salario, des pension, des salud, aux. transportem des seguro de vida
     * DS: salario a pagar en total
     */
    public static void main(String[] args) {
        // 
      double salario;

      Scanner read = new Scanner(System.in);
      System.out.print("Introduzca su salario: ");
      salario = read.nextDouble();

        if (salario<=700000){
           System.out.print("salario invalido");
           } else {
             salario = (salario*1.05);
           }  
         if (salario>=741000 && salario<=999999) {
             salario=(salario*0.99);
         }
         if (salario>=1000000 && salario<=1800000) {
             salario=(salario*0.92);
         }
         if (salario>1800000 && salario<2500000) {
             salario=(salario*0.89);
         }
         if (salario>=2500000) {
             salario=(salario*0.85);
         }
         System.out.print("El salario correspondiente es: " + salario);
    }
} 

