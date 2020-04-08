//this class is the main method being the ui of the game
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Modified by: Jonathan Hugo
                Gavin Da Silva
 *              Ishita Ishita
 *              Sheril Garg
 * date: feb/12th/2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game gme = new Game("Black Jack");

        System.out.println("Welcome to " + gme.getGameName() + "!");
        System.out.println("Enter your Player id:");
        String pid = sc.next();
        Player player = new Player(pid);
        player.setPlayerID(pid);
        System.out.println(player.getPlayerID());
        //int start = 0;

        int start = 2;
        do {    //do while lloop
        System.out.println("enter 1 if you want to start the game! or enter 2 to exit the game");
        start = sc.nextInt();
            if (start == 2){    //if user inputs 2 then the program ends
                break;
                } else if (start == 1){
        System.out.println("Dealing cards..." + "\n");
        
        GroupOfCards deck = new GroupOfCards();
        deck.deal();
        
        System.out.println(deck.toStringCpuHand()); //displays players hand
        System.out.println("Total = " + deck.cpuaddHand()); //displays players hand in total value
        System.out.println(deck.toStringPHand()); //displays players hand
        System.out.println("Total = " + deck.paddHand()); //displays players hand in total value

        gme.choice(deck.paddHand(), deck.cpuaddHand(), deck, player); // checks if player won based on draw
            }
            else
                System.out.println("NOT A VALID ENTRY!!!");
        } while (start >= 1 || start < 1); // no matter the entry, the code will loop *unless user CHOOSES to exit by inputting 2
    }

}
