package com.pichincha.tennisgame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void shouldPlayerOneWon() {
        Player playerOne = new Player("Juan", 4);
        Player playerTwo = new Player("Pedro", 2);

        Game tennisGame = new Game(playerOne, playerTwo);
        String winner = tennisGame.getWinner();

        Assertions.assertEquals("Juan", winner);

    }
}
