//this class is to create the deck of cards
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public class Card {

    public enum Suits {
        HEARTS, SPADES, CLUBS, DIAMONDS
    };

    public enum Value {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JOKER, QUEEN, KING
    };
    Suits suits;
    Value value;

    Card(Suits s, Value val) {
        suits = s;
        value = val;
    }

    public Value getValues() {
        return this.value;
    }

    public Suits getSuits() {
        return this.suits;
    }


    

    //default modifier for child classes
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
  

}
