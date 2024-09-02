package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// Your task is to develop a simple 2D game board and a game character.
// The game board is a grid on which you can move using the W (up), S (down), D (right), and A (left) keys.
// You will write tests to ensure that the game character moves correctly on the game board.
class MainTest {

    @org.junit.jupiter.api.Test
    void testInput() {

    }

    @Test
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

    @Test
    void testMoveUpGood_possible() {
        int[] boardSize = {8, 8};
        int[] playerPosition = {1, 0};
        int[] expectedPosition = {0, 0};
        int[] actualPosition = Main.moveUpGood(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);

    }

    @Test
    void testMoveUpBad_impossible() {
        boolean[][] board = {
                {true, false, false},
                {false, false, false},
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


    @Test
    void testMoveUpGood_impossible() {
        int[] boardSize = {8, 8};
        int[] playerPosition = {0, 0};
        int[] expectedPosition = {0, 0};
        int[] actualPosition = Main.moveUpGood(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);
    }

    void testMoveDown() {

    }

    void testMoveLeft() {

    }

    void testMoveRight() {

    }
}