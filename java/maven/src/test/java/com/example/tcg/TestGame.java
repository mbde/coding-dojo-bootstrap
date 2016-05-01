package com.example.tcg;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestGame {

    @Test
    public void startGameWithActivePlayer() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Game game = new Game(playerOne, playerTwo);
        assertThat(game.getActivePlayer()).isNotNull();
    }

    @Test
    public void startGameWithTwoDifferentPlayers() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Game game = new Game(playerOne, playerTwo);
        assertThat(game.getPlayerOne()).isEqualTo(playerOne);
        assertThat(game.getPlayerTwo()).isEqualTo(playerTwo);
    }
}
