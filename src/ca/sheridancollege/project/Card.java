//this class is to create the deck of cards
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * Name: Jonathan Hugo
 * date: feb/12th/2020
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

    public enum Suits { // "Suits" gets 4 values being the suits on a deck of cards
        HEARTS, SPADES, CLUBS, DIAMONDS
    };

    public enum Value { //"Value" gets 13 values being each card in a deck of cards with earch card having an int value with them
        ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(10), QUEEN(10), KING(10);
   
    private final int crdVal;   //constructor for the intergers withing the "Value" values
    Value(int crdVal) {
        this.crdVal = crdVal;
    }

    public int getCrdVal() {    //method to get int value 
        return crdVal;
    }
    
    
    };
    Suits suits;
    Value value;

    Card(Suits s, Value val) { // arraylist with 2 values of each column, suits and value
        suits = s;
        value = val;
    }

    public int getint(){    //method to get int value 
        return value.getCrdVal();
    }    
     
    
    public Value getValues() {  //gets "Value" values e.x. ACE, TWO, THREE, etc
        return this.value;
    }

    public Suits getSuits() {   // gets "Suits" values e.x. HEARTS, SPADES, etc
        return this.suits;
    }

}
