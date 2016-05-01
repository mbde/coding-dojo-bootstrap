package com.example.tcg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    Deck deck = new Deck();

    public int getHealth() {
        return 30;
    }

    public int getManaSLots() {
        return 0;
    }

    public List<String> getHand() {
        return Arrays.asList("0","8","4");
    }
}
