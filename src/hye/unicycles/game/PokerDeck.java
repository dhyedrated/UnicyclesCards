package hye.unicycles.game;

import hye.unicycles.BaseDeck;
import hye.unicycles.StringBasedCard;


public class PokerDeck extends BaseDeck {

    /**
     *Deck of Poker style cards 52 in total
     * Made up of 4 suits: Spades, Hearts, Diamonds, Clubs
     * With 13 values each: Ace, 2-10, Jack, Queen, King
     */
    public PokerDeck()
    {
        initializeDeck(new StringBasedCard[] {new StringBasedCard("Ace_Of_Spades")
                                , new StringBasedCard("Two_Of_Spades") 
                                , new StringBasedCard("Three_Of_Spades")
                                , new StringBasedCard("Four_Of_Spades")
                                , new StringBasedCard("Five_Of_Spades")
                                , new StringBasedCard("Six_Of_Spades")
                                , new StringBasedCard("Seven_Of_Spades")
                                , new StringBasedCard("Eight_Of_Spades")
                                , new StringBasedCard("Nine_Of_Spades")
                                , new StringBasedCard("Ten_Of_Spades")
                                , new StringBasedCard("Jack_Of_Spades")
                                , new StringBasedCard("Queen_Of_Spades")
                                , new StringBasedCard("King_Of_Spades")
                                    //Hearts
                                , new StringBasedCard("Ace_Of_Hearts")
                                , new StringBasedCard("Two_Of_Hearts") 
                                , new StringBasedCard("Three_Of_Hearts")
                                , new StringBasedCard("Four_Of_Hearts")
                                , new StringBasedCard("Five_Of_Hearts")
                                , new StringBasedCard("Six_Of_Hearts")
                                , new StringBasedCard("Seven_Of_Hearts")
                                , new StringBasedCard("Eight_Of_Hearts")
                                , new StringBasedCard("Nine_Of_Hearts")
                                , new StringBasedCard("Ten_Of_Hearts")
                                , new StringBasedCard("Jack_Of_Hearts")
                                , new StringBasedCard("Queen_Of_Hearts")
                                , new StringBasedCard("King_Of_Hearts") 
//Diamonds
                                     , new StringBasedCard("Ace_Of_Diamonds")
                                , new StringBasedCard("Two_Of_Diamonds") 
                                , new StringBasedCard("Three_Of_Diamonds")
                                , new StringBasedCard("Four_Of_Diamonds")
                                , new StringBasedCard("Five_Of_Diamonds")
                                , new StringBasedCard("Six_Of_Diamonds")
                                , new StringBasedCard("Seven_Of_Diamonds")
                                , new StringBasedCard("Eight_Of_Diamonds")
                                , new StringBasedCard("Nine_Of_Diamonds")
                                , new StringBasedCard("Ten_Of_Diamonds")
                                , new StringBasedCard("Jack_Of_Diamonds")
                                , new StringBasedCard("Queen_Of_Diamonds")
                                , new StringBasedCard("King_Of_Diamonds")   
                                //Clubs
                                , new StringBasedCard("Ace_Of_Clubs")
                                , new StringBasedCard("Two_Of_Clubs") 
                                , new StringBasedCard("Three_Of_Clubs")
                                , new StringBasedCard("Four_Of_Clubs")
                                , new StringBasedCard("Five_Of_Clubs")
                                , new StringBasedCard("Six_Of_Clubs")
                                , new StringBasedCard("Seven_Of_Clubs")
                                , new StringBasedCard("Eight_Of_Clubs")
                                , new StringBasedCard("Nine_Of_Clubs")
                                , new StringBasedCard("Ten_Of_Clubs")
                                , new StringBasedCard("Jack_Of_Clubs")
                                , new StringBasedCard("Queen_Of_Clubs")
                                , new StringBasedCard("King_Of_Clubs")   
                            }
        );
        
        
    }	
};