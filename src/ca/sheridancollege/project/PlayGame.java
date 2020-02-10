//this class is the main method being the ui of the game
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GroupOfCards deck = new GroupOfCards();
        Game gme = new Game("Black Jack");
       

        System.out.println("Welcome to " + gme.getGameName() + "!");
        System.out.println("Enter your Player id:");
        //String id = sc.next();
        //Player player1 = new Player(id);
        
       deck.deal();
       System.out.println(deck.toStringPHand());
       System.out.println(deck.toString());
       System.out.println(deck.addHand());
       //var int i = 1+Value.values(0);
       
                 
   

    }
    
}
