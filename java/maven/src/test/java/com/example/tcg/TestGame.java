package com.example.tcg;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestGame {

    private Player playerOne = new Player();
    private Player playerTwo = new Player();
    private Game game = new Game(playerOne, playerTwo);

    @Test
    public void startGameWithActivePlayer() {
        assertThat(game.getActivePlayer()).isNotNull();
    }

    @Test
    public void startGameWithTwoDifferentPlayers() {
        assertThat(game.getPlayerOne()).isEqualTo(playerOne);
        assertThat(game.getPlayerTwo()).isEqualTo(playerTwo);
    }

    @Test
    public void startingPlayerHasThreeCards() {
        if (game.getPlayerOne() == game.getActivePlayer()) {
            assertThat(game.getPlayerTwo().getHand().size()).isEqualTo(4);
        } else {
            assertThat(game.getPlayerOne().getHand().size()).isEqualTo(4);
        }
    }
}
