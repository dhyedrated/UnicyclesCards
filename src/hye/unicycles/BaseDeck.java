package hye.unicycles;

import hye.unicycles.interfaces.Card;
import hye.unicycles.interfaces.Deck;
import java.util.Random;

/**
 *
 * @author David
 */
public class BaseDeck implements Deck {
    private Card[] _dckObject;
    private int _cursor;
    public BaseDeck() {
        _dckObject = new Card[]{};
        _cursor = -1;
    }
   
    @Override
    public void shuffle() {
        long seed = System.currentTimeMillis();
        Random r = new Random(seed);
        int dckSize = _dckObject.length;
        int oldCursor = _cursor;
        for (int lcv = _cursor+1; lcv<dckSize; ++lcv) {
            
            Card c = _dckObject[lcv];
            int toSwap = lcv + r.nextInt(dckSize-lcv); 
            //possible to swap with myself, but can't swap with a card before.
            Card temp = _dckObject[toSwap];
            _dckObject[toSwap] = c;
            _dckObject[lcv] = temp;
        }
        _cursor = oldCursor;
    }
    
    public int getRemainingCards() {
        return _dckObject.length - _cursor;
    }
	
    @Override    
    public Card dealOneCard() {
        ++_cursor;
        if(_cursor >= _dckObject.length){
           return null;
        }

        return _dckObject[_cursor];
    }
    
    // -- protected
    final protected void initializeDeck(Card[] inContents) {
        _dckObject = inContents;
        _cursor = -1;
    }
}
