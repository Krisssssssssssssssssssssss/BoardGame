package org.example;

import static org.junit.jupiter.api.Assertions.*;


// Your task is to develop a simple 2D game board and a game character.
// The game board is a grid on which you can move using the W (up), S (down), D (right), and A (left) keys.
// You will write tests to ensure that the game character moves correctly on the game board.
class MainTest {

    @org.junit.jupiter.api.Test
    void testInput() {

    }

    void testMoveUp_possible() {
        boolean[][] board = {
                {false, false, false},
                {true, false, false},
                {false, false, false},
        };
        boolean[][] expected = {
                {true, false, false},
                {false, false, false},
                {false, false, false},
        };

        boolean[][] actual = Main.moveUpBad(board);

        assertArrayEquals(expected, actual);
    }

    void testMoveUp_impossible() {
        boolean[][] board = {
                {true, false, false},
                {false, false, false},
                {false, false, false},
        };
    }

    void testMoveDown() {

    }

    void testMoveLeft() {

    }

    void testMoveRight() {

    }
}