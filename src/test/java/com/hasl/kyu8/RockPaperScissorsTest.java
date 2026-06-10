package com.hasl.kyu8;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RockPaperScissorsTest {

    @Test
    public void testRps() {
        assertThat(RockPaperScissors.rps("rock", "scissors")).isEqualTo("Player 1 won!");
        assertThat(RockPaperScissors.rps("scissors", "rock")).isEqualTo("Player 2 won!");
        assertThat(RockPaperScissors.rps("paper", "paper")).isEqualTo("Draw!");
    }
}