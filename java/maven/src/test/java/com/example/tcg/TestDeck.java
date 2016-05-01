package com.example.tcg;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDeck {

    String defaultDeck = "0,0,1,1,2,2,2,3,3,3,3,4,4,4,5,5,6,6,7,8";

    @Test
    public void testInitialDeckSize() {
        Deck deck = new Deck();
        assertThat(deck.size()).isEqualTo(20);
    }

    @Test
    public void testCardsOfDefaultDeck() {
        Deck deck = new Deck();
        for (String card : defaultDeck.split(",")) {
            assertThat(deck.drawCard()).isEqualTo(card);
        }
    }
}
