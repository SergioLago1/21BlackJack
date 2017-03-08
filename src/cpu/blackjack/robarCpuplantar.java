
package cpu.blackjack;

import java.util.Random;
import java.util.Scanner;
import libreria.milibreria;


public class robarCpuplantar{
    
    Scanner keyboard = new Scanner(System.in); 
    
    
    public void cuestion(parametrocpu cpu){
        milibreria carta = new milibreria();
        Random rnd = new Random();
         int cc = rnd.nextInt(new milibreria().getNewCard().length-1); 
 
        System.out.println("Turno de la cpu "); //mensaje del turno de cpu
        System.out.println("La cpu roba una carta " + carta.getNewCard()[3] + "."); //mensaje de robo de carta del cpu

        //cc++; 
        while (cpu.getDealerTotal() < 21){ //Si la cpu tiene en su suma menos de 16 pide carta
            System.out.println();
            System.out.println("La cpu pide carta "); //mensaje de que roba carta
            System.out.println("La cpu roba un " + carta.getNewCard()[cc] + "."); //mensaje de la carta que roba la CPU
            cc++;
            cpu.setDealerTotal(cpu.getDealerTotal() + carta.getNewCard()[cc]);
            System.out.println();
            System.out.println("Su suma total es de " + cpu.getDealerTotal() +"."); //mensaje de que muestra la suma de carats de CPU
            
            if (cpu.getDealerTotal() > 21){ //Compara si la suma de CPU es mayor a 21
                System.out.println();
                System.out.println("La cpu se pasó, tú ganas"); // cpu se pasa y muestra que ganas
                System.exit(0);
            }
           
            //if (cpu.getDealerTotal() < 21 && cpu.getDealerTotal() > 16){ //compara si la suma esta entre 21 y 16
              //  System.out.println();
                //System.out.println("La cpu se pasa"); //cpu se pasa 
            //}
        }
    }
}
