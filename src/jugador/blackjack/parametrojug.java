/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador.blackjack;

/**
 *
 * @author ped90
 */
public class parametrojug {
    
    int playerTotal;

    public parametrojug() {
    }

    public parametrojug(int playerTotal) {
        this.playerTotal = playerTotal;
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public void setPlayerTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }

    @Override
    public String toString() {
        return "parametros{" + "playerTotal=" + playerTotal + '}';
    }
    
    
    
}
