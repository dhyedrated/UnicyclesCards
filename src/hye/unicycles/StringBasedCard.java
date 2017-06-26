package hye.unicycles;

import hye.unicycles.interfaces.Card;
import java.lang.*;

public class StringBasedCard implements Card
{    
    public StringBasedCard(String faceValue) throws IllegalArgumentException
    {
        if (faceValue.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot construct card with an "
                    + "empty or whitespace only string");                    
        }
        _face = faceValue;
    }
    
    @Override
    public Object flipOver() {
        return getFace();
    }
    
    //Getter function for face value of card
    public String getFace() {
        return _face;
    }
    private String _face;            
};
