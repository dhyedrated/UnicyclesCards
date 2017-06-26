package hye.unicycles.game;

import hye.unicycles.*;
/**
 *
 * @author David
 */
public class PinochleDeck extends BaseDeck {
       /**
     *Deck of  cards 48 in total
     * Made up of 4 suits: Spades, Hearts, Diamonds, Clubs
     * With 12 values each.  Two each of Ace, 9, 10, Jack, Queen, and King
     */
    public PinochleDeck()
    { 
        initializeDeck(new StringBasedCard[] {            
            new StringBasedCard("Ace_Of_Spades")
            , new StringBasedCard("Ace_Of_Spades")
            , new StringBasedCard("Nine_Of_Spades")
            , new StringBasedCard("Ten_Of_Spades")
            , new StringBasedCard("Jack_Of_Spades")
            , new StringBasedCard("Queen_Of_Spades")
            , new StringBasedCard("King_Of_Spades")
            , new StringBasedCard("Nine_Of_Spades")
            , new StringBasedCard("Ten_Of_Spades")
            , new StringBasedCard("Jack_Of_Spades")
            , new StringBasedCard("Queen_Of_Spades")
            , new StringBasedCard("King_Of_Spades")
        //Hearts
            , new StringBasedCard("Ace_Of_Hearts")
            , new StringBasedCard("Ace_Of_Hearts")
            , new StringBasedCard("Nine_Of_Hearts")
            , new StringBasedCard("Ten_Of_Hearts")
            , new StringBasedCard("Jack_Of_Hearts")
            , new StringBasedCard("Queen_Of_Hearts")
            , new StringBasedCard("King_Of_Hearts") 
            , new StringBasedCard("Nine_Of_Hearts")
            , new StringBasedCard("Ten_Of_Hearts")
            , new StringBasedCard("Jack_Of_Hearts")
            , new StringBasedCard("Queen_Of_Hearts")
            , new StringBasedCard("King_Of_Hearts") 
            //Diamonds
            , new StringBasedCard("Ace_Of_Diamonds")
            , new StringBasedCard("Ace_Of_Diamonds")
           , new StringBasedCard("Nine_Of_Diamonds")
           , new StringBasedCard("Ten_Of_Diamonds")
           , new StringBasedCard("Jack_Of_Diamonds")
           , new StringBasedCard("Queen_Of_Diamonds")
           , new StringBasedCard("King_Of_Diamonds")  

           , new StringBasedCard("Nine_Of_Diamonds")
           , new StringBasedCard("Ten_Of_Diamonds")
           , new StringBasedCard("Jack_Of_Diamonds")
           , new StringBasedCard("Queen_Of_Diamonds")
           , new StringBasedCard("King_Of_Diamonds")   
           //Clubs
           , new StringBasedCard("Ace_Of_Clubs")
           , new StringBasedCard("Ace_Of_Clubs")
           , new StringBasedCard("Nine_Of_Clubs")
           , new StringBasedCard("Ten_Of_Clubs")
           , new StringBasedCard("Jack_Of_Clubs")
           , new StringBasedCard("Queen_Of_Clubs")
           , new StringBasedCard("King_Of_Clubs")  
           , new StringBasedCard("Nine_Of_Clubs")
           , new StringBasedCard("Ten_Of_Clubs")
           , new StringBasedCard("Jack_Of_Clubs")
           , new StringBasedCard("Queen_Of_Clubs")
           , new StringBasedCard("King_Of_Clubs")  
        });
    }
};
