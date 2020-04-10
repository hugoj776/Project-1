/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author sheri
 */
public class money extends GroupOfCards{
    
    private double amount;
    private double betMade;
    
    public money(double betMade)
    {
        
        this.betMade = betMade;
    }
  

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getBetMade() {
        return betMade;
    }

    public void setBetMade(double betMade) {
        this.betMade = betMade;
    }
    public double addMoney(double betMade){
        return getAmount() + betMade;
    }
    public double subtractMoney(double betMade){
        return getAmount() - betMade;
    }
    
}
