package org.example;

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
        int[] boardSize = {8, 8};
        int[] playerPosition = {1, 0};
        int[] expectedPosition = {0, 0};
        int[] actualPosition = Main.moveUp(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);

    }

    @Test
    void testMoveUp_impossible() {
        int[] boardSize = {8, 8};
        int[] playerPosition = {0, 0};
        int[] expectedPosition = {0, 0};
        int[] actualPosition = Main.moveUp(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);
    }

    @Test
    void testMoveDown_possible() {
        int[] boardSize = {8, 8};
        int[] playerPosition = {6, 0};
        int[] expectedPosition = {7, 0};
        int[] actualPosition = Main.moveDown(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);

    }

    @Test
    void testMoveDown_impossible() {
        int[] boardSize = {8, 8};
        int[] playerPosition = {7, 0};
        int[] expectedPosition = {7, 0};
        int[] actualPosition = Main.moveDown(boardSize, playerPosition);

        assertArrayEquals(expectedPosition, actualPosition);

    }

    void testMoveLeft() {

    }

    void testMoveRight() {

    }
}