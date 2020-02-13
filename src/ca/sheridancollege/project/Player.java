/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Name: Jonathan Hugo
 * date: feb/12th/2020 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;


public class Player extends GroupOfCards {

    private String playerID; //the unique ID for this player

    public Player(String name) // allows user to set a playerID from the main method
    {
        this.playerID = playerID;
    }

    public String getPlayerID() //returns playerID
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) //allows user to set an PlayerID
    {
        playerID = givenID;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
}
