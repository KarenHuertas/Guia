
package guia1;

import java.util.Scanner;

/**
 * Dado un numero es metros (m) realizar el cálculo de conversión a:
 * km hm dc dm cm mm
 * @author USER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     * DE:numero en metros
     * DS:conversion en km, hm, Dc, dm, cm, mm
     */
    public static void main(String[] args) {
        // 
        float num;
        float km;
        float hm;
        float dc;
        float m;
        double dm;
        double cm;
        double mm;
 
        Scanner read = new Scanner(System.in);
        System.out.println("Tntroduzca el número en metros");
        num = read.nextFloat();
        
        km = num/1000;
        hm = num/100;
        dc = num/10;
        m = num/1;
        dm = num/0.1;
        cm = num/0.01;
        mm = num/0.001;
        
        System.out.println("El número en km es: "+km);
        System.out.println("El número en hm es: "+hm);
        System.out.println("El número en dc es: "+dc);
        System.out.println("El número en m es: "+m);
        System.out.println("El número en dm es: "+dm);
        System.out.println("El número en cm es: "+cm);
        System.out.println("El número en mm es: "+mm);
        
               
    }
    
}
