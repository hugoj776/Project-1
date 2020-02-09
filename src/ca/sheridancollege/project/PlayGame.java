//this class is the main method being the ui of the game
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Welcome to Black Jack!");
    System.out.println("");
    GroupOfCards me = new GroupOfCards(1);
    me.createDeck();
    System.out.println(me);
               //create 52 Cards
             
               
               /*   me.generateHand();
                for(Card c: me.cards)
                {
                    System.out.println(c.getValues() + " of " + c.getSuits());
                }
               for(Card c: ch.cards)
                {
                    System.out.println(c.getValues() + " of " + c.getSuits());
                }
             */
    
    }
}
