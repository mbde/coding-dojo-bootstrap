package com.example.tcg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Deck {
    List<String> deck = Arrays.asList("0,0,1,1,2,2,2,3,3,3,3,4,4,4,5,5,6,6,7,8".split(","));
    Iterator<String> deckIterator = deck.iterator();

    public int size() {
        return deck.size();
    }

    public String drawCard() {
        return deckIterator.next();
    }
}
