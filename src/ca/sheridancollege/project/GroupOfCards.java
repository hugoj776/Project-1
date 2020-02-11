/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
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
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> pHand = new ArrayList<Card>();
    ArrayList<Card> cpuHand = new ArrayList<Card>();

    public GroupOfCards(int givenSize) {
        size = givenSize;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    GroupOfCards() {
        for (Suits s : Suits.values()) {
            for (Value val : Value.values()) {
                cards.add(new Card(s, val));
                shuffle();
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

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

    public int size() {
        return cards.size();
    }

    public void deal() {
        for (int i = 0; i < 2; i++) {
            Card a = cards.remove(cards.size() - 1);
            pHand.add(a);

            a = cards.remove(cards.size() - 1);
            cpuHand.add(a);
        }
    }
    
    public void hit() {
        for (int i = 0; i < 1; i++) {
            Card a = cards.remove(cards.size() - 1);
            pHand.add(a);
        }
    }
    
    public void cpuhit() {
        for (int i = 0; i < 1; i++) {
            Card a = cards.remove(cards.size() - 1);
            cpuHand.add(a);
        }
    }
//    public ArrayList<GroupOfCards> dealCards(int playeramnt) {
//        ArrayList<GroupOfCards> playerHand = new ArrayList<>(playeramnt);
//        ArrayList<Card> deckShuffled = new ArrayList<>(cards);
//
//        int dealtAmnt = deckShuffled.size()/playeramnt;
//        int remainingCards = deckShuffled.size() % playeramnt;
//        Collections.shuffle(deckShuffled);
//
//        for (int p = 0; p < playeramnt; ++p) {
//            if (p == remainingCards) {
//                --dealtAmnt;
//            }
//            GroupOfCards phand = new GroupOfCards (deckShuffled.subList(0, dealtAmnt + 1));
//            deckShuffled.removeAll(phand.cards);
//            
//            playerHand.add(phand);
//        }
//        return playerHand;
//    }
    public String toString() {
        String cardamount = cards.size() + " cards:" + "\n";
        for (Card card : cards) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n";
        }

        return cardamount;
    }

    public String toStringPHand() {
        String cardamount = "you have " + pHand.size() + " cards:" + "\n";
        for (Card card : pHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n";
        }

        return cardamount;
    }

    public String devtoStringCpuHand() {
        String cardamount = "Opponent has " + cpuHand.size() + " cards:" + "\n";
        for (Card card : cpuHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n";
        }

        return cardamount;
    }

    public String toStringCpuHand() {
        String cardamount = "Opponent has " + cpuHand.size() + " cards:" + "\n";
        
        for (Card card : cpuHand) {
            cardamount = cardamount + card.getValues() + " of " + card.getSuits() + "\n" + "second card is hidden" + "\n";
            break;
        }
        

        return cardamount;
    }
    

    public int paddHand() {
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : pHand) {
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
            cardtotal += card2;
        }

        return cardtotal;
    }
    
    public int cpuaddHand() {
        int card2 = 0;
        int cardtotal = 0;
        for (Card card : cpuHand) {
            card2 = card.getint();
            cardtotal += card2;
            break;
        }

        return cardtotal;
    }

}//end class
