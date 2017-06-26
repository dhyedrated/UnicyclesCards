/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hye.unicycles.game;

import java.util.*;
import hye.unicycles.*;
import java.lang.*;

/**
 *
 * @author David
 */
public class DeckFactory {
    private static DeckFactory _instance;
    private static ArrayList<String> _menu;
    private DeckFactory() 
    {
        _menu = new ArrayList<>();
        _menu.add("POKER");
        _menu.add("PINOCHLE");
    }
    static public DeckFactory getInstance() {
        if (_instance == null) {
            _instance = new DeckFactory();            
        }
        return _instance;
    }
    static public ArrayList<String> getMenu() {
        return _menu;
    }
    static public Deck create(String gameName) throws IllegalArgumentException
    {        
        int index = _menu.indexOf(gameName.toUpperCase());
        switch(index) {
            case 0:
            {
                return new PokerDeck();
            }
            case 1: {
                return new PinochleDeck();                
            }
            default: 
            {
                throw new IllegalArgumentException("Must specify a valid deck name");
            }            
        }
    }
}
