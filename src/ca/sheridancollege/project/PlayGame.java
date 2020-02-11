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
        String id = sc.next();
        Player player = new Player(id);

        int start = 0;

        System.out.println("enter 1 if you want to start the game!");
        //start = sc.nextInt();
        //do {
        System.out.println("Dealing cards" + "\n");
        deck.deal();
       
        System.out.println(deck.toStringCpuHand()); //displays players hand
        System.out.println("Total = " + deck.cpuaddHand()); //displays players hand in total value
        System.out.println(deck.toStringPHand()); //displays players hand
        System.out.println("Total = " + deck.paddHand()); //displays players hand in total value
        
        gme.choice(deck.paddHand(), deck.cpuaddHand(), deck, player); // checks if player won based on draw
        
        
        
        // } while (start == 1);
    }

}
