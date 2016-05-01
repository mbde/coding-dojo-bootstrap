package com.example.tcg;

import java.util.ArrayList;

import java.util.List;

public class Player {

    Deck deck = new Deck();
    List<String> hand = new ArrayList<String>();

    public int getHealth() {
        return 30;
    }

    public int getManaSLots() {
        return 0;
    }

    public void addNewCardToHand() {
        hand.add(deck.drawCard());
    }

    public List<String> getHand() {
        return hand;
    }
}
