/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
    
        public enum Suits {red, yellow, green, blue};
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JOKER, QUEEN, KING};
        private final Suits suits;
        private final Value value;
        
        public Card(Suits s, Value gVal)
        {
           suits =s;
           value= gVal;
        }


	

    @Override
    public abstract String toString();
    
}
