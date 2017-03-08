
package blackjack;

import cpu.blackjack.cpuJuega;
import cpu.blackjack.robarCpuplantar;
import interfazGrafica.interfaz;
import java.util.Random;
import javax.swing.JOptionPane;
import jugador.blackjack.jugadorJuega;
import jugador.blackjack.parametrojug;
import jugador.blackjack.robarJugplantar;
import libreria.milibreria;

/**
 *
 * @author Pedro, Miguel y Sergio
 */
public class BlackJack {

    public static void main(String[] args) {
        
        interfaz interf = new interfaz();
        
        Juego creditos = new Juego();
            creditos.saludo();
            creditos.instrucciones();
        
        //milibreria carta = new milibreria();
        //parametrojug pj = new parametrojug();
        jugadorJuega tu = new jugadorJuega(); //crea la clase jugadorJuega
        //robarJugplantar tu1 = new robarJugplantar(); //crea la clase robarJugplantar
        
        //cpuJuega cpu = new cpuJuega(); //crea la clase cpuJuega
        //robarCpuplantar cpu1 = new robarCpuplantar(); //crea la clase robarCpuplantar
        
        //resultadoFinal final1 = new resultadoFinal(); //crea la clase resultadoFinal
    
        tu.numCartasJug();
        //cpu.cartasCrupier();
        //tu1.cuestion(pj);
        //cpu1.cuestion();
        //final1.resultado();
        
        /*cpu.cartasCrupier();
        cpu1.cuestion();
        
        final1.resultado();
        
        /*int bj;
        do{
        bj= Integer.parseInt(JOptionPane.showInputDialog("1) Instrucciones.\n2) Tu turno.\n3) Turno de la CPU. \n4) Resultado final. \n0) Salir."));
        switch(bj){
            case 1:
                creditos.saludo();
                creditos.instrucciones();
                break;
            case 2:
                tu.numCartasJug();
                tu1.cuestion();
                break;
            case 3:
                cpu.cartasCrupier();
                cpu1.cuestion();
                break;
            case 4:
                final1.resultado();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(bj!=0);*/
    }

}
        
        
        
    
     

