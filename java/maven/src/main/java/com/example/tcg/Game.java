package com.example.tcg;

import java.util.Random;

public class Game {
    private final Player playerOne;
    private final Player playerTwo;
    private Player activePlayer;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            activePlayer = playerOne;
        } else {
            activePlayer = playerTwo;
        }
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
}
