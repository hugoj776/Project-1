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
        ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(10), QUEEN(10), KING(10);
   
    private final int crdVal;
    Value(int crdVal) {
        this.crdVal = crdVal;
    }

    public int getCrdVal() {
        return crdVal;
    }
    };
    Suits suits;
    Value value;

    Card(Suits s, Value val) {
        suits = s;
        value = val;
    }

    public int getint(){
        return value.getCrdVal();
    }    
    
    public Value getValues() {
        return this.value;
    }

    public Suits getSuits() {
        return this.suits;
    }

}
