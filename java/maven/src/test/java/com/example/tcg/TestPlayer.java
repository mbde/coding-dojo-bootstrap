package com.example.tcg;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestPlayer {

    @Test
    public void testPlayerHasDefault30Health(){
        Player player = new Player();
        assertThat(player.getHealth()).isEqualTo(30);
    }

    @Test
    public void testPlayerHasZeroManaSlots(){
        Player player = new Player();
        assertThat(player.getManaSLots()).isEqualTo(0);
    }

}
