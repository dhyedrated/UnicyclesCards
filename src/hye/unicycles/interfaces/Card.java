package hye.unicycles;

import java.lang.*;

public class Card 
{    
    public Card(String faceValue) throws IllegalArgumentException
    {
        if (faceValue.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot construct card with an "
                    + "empty or whitespace only string");                    
        }
        _face = faceValue;
    }
    
    //Card-conceptual operation for viewing card face value.
    public String flipOver() {
        return getFace();
    }
    
    //Getter function for face value of card
    public String getFace() {
        return _face;
    }
    private String _face;            
};
/*
struct Card {
	Suit _suit;
	FaceValue _value;

};


class<T> PlayingCard {

	T Flip();
	
	Image back;  // property

}
*/