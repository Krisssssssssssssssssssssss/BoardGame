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
        char input = 'W';
        int[] boardSize = {8, 8};
        PlayerCharacter playerCharacter = new PlayerCharacter(0, 1, boardSize);
        int expectedPlayerX = 0;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }

    @Test
    void testMoveUp_impossible() {
        char input = 'W';
        int[] boardSize = {8, 8};
        PlayerCharacter playerCharacter = new PlayerCharacter(0, 0, boardSize);
        int expectedPlayerX = 0;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }

    @Test
    void testMoveDown_possible() {
        char input = 'S';
        int[] boardSize = {8, 8};
        PlayerCharacter playerCharacter = new PlayerCharacter(0,2, boardSize);
        int expectedPlayerX = 0;
        int expectedPlayerY = 3;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }

    @Test
    void testMoveDown_impossible() {
        char input = 'S';
        int[] boardSize = {8, 8};
        PlayerCharacter playerCharacter = new PlayerCharacter(0,7, boardSize);
        int expectedPlayerX = 0;
        int expectedPlayerY = 7;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }

    void testMoveLeft() {

    }

    void testMoveRight() {

    }
}