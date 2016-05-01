package com.example.tcg;

import java.util.Random;

public class Game {
    private final Player playerOne;
    private final Player playerTwo;
    private Player activePlayer;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        for (int i = 0; i < 3; i++) {
            playerOne.addNewCardToHand();
            playerTwo.addNewCardToHand();
        }
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            activePlayer = playerOne;
            playerTwo.addNewCardToHand();
        } else {
            activePlayer = playerTwo;
            playerOne.addNewCardToHand();
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
