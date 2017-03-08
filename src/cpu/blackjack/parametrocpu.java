/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu.blackjack;

/**
 *
 * @author ped90
 */
public class parametrocpu {
    
    int dealerTotal;

    public parametrocpu(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }

    public parametrocpu() {
    }

    public int getDealerTotal() {
        return dealerTotal;
    }

    public void setDealerTotal(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }

    @Override
    public String toString() {
        return "parametros{" + "dealerTotal=" + dealerTotal + '}';
    }
    
    
    
}
