//this class is to create the the game and its rules
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
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
    private ArrayList<Player> players = new ArrayList<>();// the players of the game

    public Game(String BlackJack) {
        gameName = BlackJack;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void cpuchoice(int plyer, int cpu, GroupOfCards deck, Player player) {
        Scanner sc = new Scanner(System.in);
        //hit for cpu hand
        System.out.println(deck.devtoStringCpuHand()); //displays players hand
        System.out.println("Total = " + deck.devcpuaddHand()); //displays players hand in total value
        if (deck.paddHand() >= 21) {
                    for (int i = 0; i <= 1; i++) {
                deck.cpuhit();
                System.out.println(deck.devtoStringCpuHand()); //displays players hand
                System.out.println("Total = " + deck.devcpuaddHand()); //displays players hand in total value
            }
                }
       else if (deck.devcpuaddHand() <= 16) {
            for (int i = 0; deck.devcpuaddHand() <= 16; i++) {
                deck.cpuhit();
                System.out.println(deck.devtoStringCpuHand()); //displays players hand
                System.out.println("Total = " + deck.devcpuaddHand()); //displays players hand in total value
            }
        }
        if ((21 - deck.paddHand()) < (21 - deck.devcpuaddHand())) { //announce win or loss
            System.out.println(player.getPlayerID() + "WINS!");
        } else 
            System.out.println("DEALER WINS!");
    }

    public void choice(int plyer, int cpu, GroupOfCards deck, Player player) {
        Scanner sc = new Scanner(System.in);
        String choice = "ad";
        do {
            choice = "none";
            System.out.println("hit or Stand?");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("stand")) {
                cpuchoice(plyer, cpu, deck, player);
            } else if (choice.equalsIgnoreCase("hit")) {
                deck.hit();
                System.out.println(deck.toStringPHand()); //displays players hand
                System.out.println("Total = " + deck.paddHand()); //displays players hand in total value
                if (deck.paddHand() >= 21) {
                    cpuchoice(plyer, cpu, deck, player);
                }
            }
        } while (choice.equalsIgnoreCase("hit") || deck.paddHand() >= 21);
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
