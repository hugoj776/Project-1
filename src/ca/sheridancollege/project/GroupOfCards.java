/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
     * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private int size = 52;//the size of the grouping
    public Card[] cards = new Card[size]; 
   private int HandSize = 2;
    public Card[] playerCards = new Card[HandSize]; 
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
          public void generateDeck() //method created to go through each individual card
        {
                int countCards = 0; //sets card count to zero 
                /*
                The java compiler internally adds the
                values() method when it creates an enum. 
                
                The values() method returns an array 
                containing all the values of the enum.
                */
                
		for(Card.Suits s: Card.Suits.values())//loop to change card number for each "countCards"
                {
                    for(Card.Value v: Card.Value.values())//loop to change card number for each "countCards"
                    {
                        //Creating objects using constructor and 
                        //assigning values of emun fields 
                        //from list of possible discrete values
                        cards[countCards] = (new Card(s,v)); 
                        countCards++; // increased "countcards" so another int is givin an uno card object
                    }
                }//end outter for
                
            }
          public void generateHand(){ //creates hand by making new array out of randomly selected arrays from card deck/array
      //create object with 2 cards from cards array
          }
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
          /*////////
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
     *///// /////    

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
