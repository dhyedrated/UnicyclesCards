package hye.unicycles;


public class PokerDeck extends BaseDeck {

    /**
     *Deck of Poker style cards 52 in total
     * Made up of 4 suits: Spades, Hearts, Diamonds, Clubs
     * With 13 values each: Ace, 2-10, Jack, Queen, King
     */
    public PokerDeck()
    {
        initializeDeck(new Card[] {new Card("AceOfSpades")
                                , new Card("TwoOfSpades") 
                                , new Card("ThreeOfSpades")}
        );
        
        
    }	
};