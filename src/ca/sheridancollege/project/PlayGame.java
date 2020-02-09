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

        GroupOfCards deck = new GroupOfCards(0);
        Game gme = new Game("Black Jack");
        
        deck.showCards();
        deck.shuffle();

        System.out.println("Welcome to " + gme.getGameName() + "!");
        System.out.println("Enter your Player id:");
        String id = sc.next();
        Player player = new Player(id);
       
        
        
         for (Card num : deck.cards) { 		      
           System.out.println(num.getValues() + " of " + num.getSuits());		
      }
        
        
      
           
        
            
   

    }
}
