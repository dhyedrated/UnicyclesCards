package hye.unicycles;


public class PokerDeck extends BaseDeck {

    /**
     *Deck of Poker style cards 52 in total
     * Made up of 4 suits: Spades, Hearts, Diamonds, Clubs
     * With 13 values each: Ace, 2-10, Jack, Queen, King
     */
    public PokerDeck()
    {
        initializeDeck(new Card[] {new Card("Ace_Of_Spades")
                                , new Card("Two_Of_Spades") 
                                , new Card("Three_Of_Spades")
                                , new Card("Four_Of_Spades")
                                , new Card("Five_Of_Spades")
                                , new Card("Six_Of_Spades")
                                , new Card("Seven_Of_Spades")
                                , new Card("Eight_Of_Spades")
                                , new Card("Nine_Of_Spades")
                                , new Card("Ten_Of_Spades")
                                , new Card("Jack_Of_Spades")
                                , new Card("Queen_Of_Spades")
                                , new Card("King_Of_Spades")
                                    //Hearts
                                , new Card("Ace_Of_Hearts")
                                , new Card("Two_Of_Hearts") 
                                , new Card("Three_Of_Hearts")
                                , new Card("Four_Of_Hearts")
                                , new Card("Five_Of_Hearts")
                                , new Card("Six_Of_Hearts")
                                , new Card("Seven_Of_Hearts")
                                , new Card("Eight_Of_Hearts")
                                , new Card("Nine_Of_Hearts")
                                , new Card("Ten_Of_Hearts")
                                , new Card("Jack_Of_Hearts")
                                , new Card("Queen_Of_Hearts")
                                , new Card("King_Of_Hearts") 
//Diamonds
                                     , new Card("Ace_Of_Diamonds")
                                , new Card("Two_Of_Diamonds") 
                                , new Card("Three_Of_Diamonds")
                                , new Card("Four_Of_Diamonds")
                                , new Card("Five_Of_Diamonds")
                                , new Card("Six_Of_Diamonds")
                                , new Card("Seven_Of_Diamonds")
                                , new Card("Eight_Of_Diamonds")
                                , new Card("Nine_Of_Diamonds")
                                , new Card("Ten_Of_Diamonds")
                                , new Card("Jack_Of_Diamonds")
                                , new Card("Queen_Of_Diamonds")
                                , new Card("King_Of_Diamonds")   
                                //Clubs
                                , new Card("Ace_Of_Clubs")
                                , new Card("Two_Of_Clubs") 
                                , new Card("Three_Of_Clubs")
                                , new Card("Four_Of_Clubs")
                                , new Card("Five_Of_Clubs")
                                , new Card("Six_Of_Clubs")
                                , new Card("Seven_Of_Clubs")
                                , new Card("Eight_Of_Clubs")
                                , new Card("Nine_Of_Clubs")
                                , new Card("Ten_Of_Clubs")
                                , new Card("Jack_Of_Clubs")
                                , new Card("Queen_Of_Clubs")
                                , new Card("King_Of_Clubs")   
                            }
        );
        
        
    }	
};