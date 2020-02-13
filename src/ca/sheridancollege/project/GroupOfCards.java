/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Name: Jonathan Hugo
 * date: feb/12th/2020
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suits;
import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private int size = 52;//the size of the grouping
    ArrayList<Card> cards = new ArrayList<Card>(); //creates array list for entire deck called "cards"
    ArrayList<Card> pHand = new ArrayList<Card>();  //creates array list for entire Players hand called "pHand"
    ArrayList<Card> cpuHand = new ArrayList<Card>();    //creates array list for entire cpu's Hand called "cpuHand"

    public GroupOfCards(int givenSize) {    //Constructor add decks total size
        size = givenSize;
    }

    GroupOfCards() {    // method made up of for loops to create each individual card with each card object being placed inside the cards(deck) arraylist
        for (Suits s : Suits.values()) {
            for (Value val : Value.values()) {
                cards.add(new Card(s, val));
                shuffle();
            }
        }
    }

    public void shuffle() { //shuffle method that shuffles an arraylist
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {  //returns size (int) of arraylist
        return size;
    }

  
    public void setSize(int givenSize) {    //sets size (int) of arraylist
        size = givenSize;
    }

    public int size() { //return cards(deck) size 
        return cards.size();
    }

    public void deal() { //method that gets 4 cards from cards(deck) and splits them between phand(player's hand) and cpuHand(cpu's hand)
        for (int i = 0; i < 2; i++) {
            Card a = cards.remove(cards.size() - 1);
            pHand.add(a);

            a = cards.remove(cards.size() - 1);
            cpuHand.add(a);
        }
    }

    public void hit() { // similar to deal() except 1 card is added to phand
        for (int i = 0; i < 1; i++) {
            Card a = cards.remove(cards.size() - 1);
            pHand.add(a);
        }
    }

    public void cpuhit() {  // similar to deal() except 1 card is added to cpuHand
        for (int i = 0; i < 1; i++) {
            Card a = cards.remove(cards.size() - 1);
            cpuHand.add(a);
        }
    }

    public String toStringPHand() {     //method used to display players hand
        String cardamount = "you have " + pHand.size() + " cards:" + "\n";
        for (Card card : pHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n";
        }

        return cardamount;
    }

    public String devtoStringCpuHand() { //method used to display dealers hand
        String cardamount = "Opponent has " + cpuHand.size() + " cards:" + "\n";
        for (Card card : cpuHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n";
        }

        return cardamount;
    }

    public String toStringCpuHand() {       //method used when dealing cards, only displays one of the dealers cards
        String cardamount = "Opponent has " + cpuHand.size() + " cards:" + "\n";

        for (Card card : cpuHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n" + "second card is hidden" + "\n";
            break; //after 1 card is displayer the method stops
        }

        return cardamount;
    }

    public int prevpaddHand() { // used to choose whether ace should have a value of 1 or 11
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : pHand) {
            card2 = card.getint();
            cardtotal += card2;
        }

        return cardtotal;
    }

    public int paddHand() {
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : pHand) {
            card2 = card.getint();
            if (card.getint() == 11) { // if Ace is drawn..
                if ((prevpaddHand() + 11) > 21) {// if the total card value (prevaddhand()) + 11 is greater then 21 then..
                    card2 = 1;          //change the value of ace (11) to 1
                }                       
            }
            cardtotal += card2;
        }

        return cardtotal;
    }

    public int prevdevcpuaddHand() {    // used to choose whether ace should have a value of 1 or 11
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : cpuHand) {
            card2 = card.getint();
            cardtotal += card2;
        }
        return cardtotal;
    }
    
    public int devcpuaddHand() {
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : cpuHand) {
            card2 = card.getint();
            if (card.getint() == 11) { // if Ace is drawn
                if ((prevdevcpuaddHand() + 11) > 21) { // if the total card value (prevaddhand()) + 11 is greater then 21 then..
                    cardtotal += 1;             //change the value of ace (11) to 1
                    return cardtotal;

                }
            }
            cardtotal += card2;
        }
        return cardtotal;
    }

    public int cpuaddHand() { // method to only show one of the cards dealt to the dealer
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : cpuHand) {
            card2 = card.getint();
            cardtotal += card2;
            if (card.getint() == 11) {
                if ((paddHand() + 11) > 21) {
                    cardtotal += 1;
                }
            }
            break;
        }

        return cardtotal;
    }

}//end class
