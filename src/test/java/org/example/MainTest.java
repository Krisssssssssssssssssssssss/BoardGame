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
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0, 1, board);
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
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0, 0, board);
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
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0,2, board);
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
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0,7, board);
        int expectedPlayerX = 0;
        int expectedPlayerY = 7;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }
    //Left
    @Test
    void testMoveLeft() {
        char input = 'A';
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(3, 0, board);
        int expectedPlayerX = 2;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }
    @Test
    void testMoveLeftimpossible() {
        char input = 'A';
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0,0, board);
        int expectedPlayerX = 0;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }
    //Right
    @Test
    void testMoveRight() {
        char input = 'D';
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(3, 0, board);
        int expectedPlayerX = 4;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }
    @Test
    void testMoveRightimpossible() {
        char input = 'D';
        Board board = new Board(8, 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(7,0, board);
        int expectedPlayerX = 7;
        int expectedPlayerY = 0;
        playerCharacter.move(input);
        int actualPlayerX = playerCharacter.getX();
        int actualPlayerY = playerCharacter.getY();

        assertEquals(expectedPlayerX, actualPlayerX);
        assertEquals(expectedPlayerY, actualPlayerY);
    }
}