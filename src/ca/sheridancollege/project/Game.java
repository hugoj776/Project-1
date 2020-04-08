//this class is to create the the game and its rules
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modified by: Jonathan Hugo
 *              Gavin Da Silva
 *              Ishita Ishita
 *              Sheril Garg
 * date: feb/12th/2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game extends GroupOfCards {

    private final String gameName;//the title of the game

    public Game(String BlackJack) { //constructor for game title and player arraylist
        gameName = BlackJack;
    }

  
    public String getGameName() {   //returns game name
        return gameName;
    }

    public void cpuchoice(int plyer, int cpu, GroupOfCards deck, Player player) {
        
        if (deck.paddHand() >= 21) { //ai 

            System.out.println(deck.devtoStringCpuHand()); //displays players hand
            System.out.println("Total 1= " + deck.devcpuaddHand()); //displays players hand in total value

        } else if (deck.devcpuaddHand() <= 16) {
            for (deck.devcpuaddHand(); deck.devcpuaddHand() <= 16;) {
                deck.cpuhit();
                System.out.println(deck.devtoStringCpuHand()); //displays players hand
                System.out.println("Total 2= " + deck.devcpuaddHand()); //displays players hand in total value
            }
        } else {
            for (int i = 0; i < 1; i++) {
                deck.cpuhit();
                System.out.println(deck.devtoStringCpuHand()); //displays players hand
                System.out.println("Total 3=" + deck.devcpuaddHand()); //displays players hand in total value
            }
        }           

        //if (deck.paddHand() <= 21 && deck.devcpuaddHand() > 21)
        if (deck.paddHand() > 21) {
        System.out.println("BUST!");
        } else if ((deck.paddHand() > deck.devcpuaddHand()) && deck.paddHand() <= 21 ) { //announce win or loss
            System.out.println(player.getPlayerID() + " WINS1!"); // PROBLEM doenst work if integer is negative
            
        } else if ((21 - deck.paddHand() > 21 - deck.devcpuaddHand()) && (21 - deck.devcpuaddHand()) < 0) { //announce win or loss
            System.out.println(player.getPlayerID() + " WINS2!"); // PROBLEM doenst work if integer is negative
        } else if (deck.paddHand() == deck.devcpuaddHand()) {
            System.out.println("PUSH!");
        } else if ((deck.paddHand() < deck.devcpuaddHand()) && deck.paddHand() <= 21 && deck.devcpuaddHand() <= 21 ){
            System.out.println("DEALER WINS!");
        }

    }

    public void choice(int plyer, int cpu, GroupOfCards deck, Player player) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("hit or Stand?");
            choice = sc.nextLine();
            System.out.println();
            if (choice.equalsIgnoreCase("stand")) {
                cpuchoice(plyer, cpu, deck, player);
                break;
            } else if (choice.equalsIgnoreCase("hit")) {
                deck.hit();
                System.out.println(deck.toStringPHand()); //displays players hand
                System.out.println("Total = " + deck.paddHand()); //displays players hand in total value
                if (deck.paddHand() >= 21) {
                    cpuchoice(plyer, cpu, deck, player);
                    break;
                }
            } else if (!choice.equals(choice.equalsIgnoreCase("hit")) && !choice.equals(choice.equalsIgnoreCase("stand"))){
            System.out.println("NOT A VALID ENTRY!!!");
            System.out.println(deck.toStringCpuHand()); //displays players hand
        System.out.println("Total = " + deck.cpuaddHand()); //displays players hand in total value
        System.out.println(deck.toStringPHand()); //displays players hand
        System.out.println("Total = " + deck.paddHand()); //displays players hand in total value
            }
            choice = "none";
        } while (choice.equalsIgnoreCase("hit") || deck.paddHand() >= 21 || choice.equalsIgnoreCase("stand") || choice.equalsIgnoreCase("none"));
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    //public abstract void play();
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    //public abstract void declareWinner(); make into toString with if statments?
}//end class
