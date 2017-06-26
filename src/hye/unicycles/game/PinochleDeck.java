/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        initializeDeck(new Card[] {            
            new Card("Ace_Of_Spades")
            , new Card("Ace_Of_Spades")
            , new Card("Nine_Of_Spades")
            , new Card("Ten_Of_Spades")
            , new Card("Jack_Of_Spades")
            , new Card("Queen_Of_Spades")
            , new Card("King_Of_Spades")
            , new Card("Nine_Of_Spades")
            , new Card("Ten_Of_Spades")
            , new Card("Jack_Of_Spades")
            , new Card("Queen_Of_Spades")
            , new Card("King_Of_Spades")
        //Hearts
            , new Card("Ace_Of_Hearts")
            , new Card("Ace_Of_Hearts")
            , new Card("Nine_Of_Hearts")
            , new Card("Ten_Of_Hearts")
            , new Card("Jack_Of_Hearts")
            , new Card("Queen_Of_Hearts")
            , new Card("King_Of_Hearts") 
            , new Card("Nine_Of_Hearts")
            , new Card("Ten_Of_Hearts")
            , new Card("Jack_Of_Hearts")
            , new Card("Queen_Of_Hearts")
            , new Card("King_Of_Hearts") 
            //Diamonds
            , new Card("Ace_Of_Diamonds")
            , new Card("Ace_Of_Diamonds")
           , new Card("Nine_Of_Diamonds")
           , new Card("Ten_Of_Diamonds")
           , new Card("Jack_Of_Diamonds")
           , new Card("Queen_Of_Diamonds")
           , new Card("King_Of_Diamonds")  

           , new Card("Nine_Of_Diamonds")
           , new Card("Ten_Of_Diamonds")
           , new Card("Jack_Of_Diamonds")
           , new Card("Queen_Of_Diamonds")
           , new Card("King_Of_Diamonds")   
           //Clubs
           , new Card("Ace_Of_Clubs")
           , new Card("Ace_Of_Clubs")
           , new Card("Nine_Of_Clubs")
           , new Card("Ten_Of_Clubs")
           , new Card("Jack_Of_Clubs")
           , new Card("Queen_Of_Clubs")
           , new Card("King_Of_Clubs")  
           , new Card("Nine_Of_Clubs")
           , new Card("Ten_Of_Clubs")
           , new Card("Jack_Of_Clubs")
           , new Card("Queen_Of_Clubs")
           , new Card("King_Of_Clubs")  
        });
    }
};
