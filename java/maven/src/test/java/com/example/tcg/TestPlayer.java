package com.example.tcg;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestPlayer {

    @Test
    public void playerHas30HealthBeforeGameStarts() {
        Player player = new Player();
        assertThat(player.getHealth()).isEqualTo(30);
    }

    @Test
    public void playerHasZeroManaSlotsBeforeGameStarts() {
        Player player = new Player();
        assertThat(player.getManaSLots()).isEqualTo(0);
    }

    @Test
    public void playerHasThreeCardsBeforeGameStarts() {
        Player player = new Player();
        assertThat(player.getHand().size()).isEqualTo(3);
    }

}
