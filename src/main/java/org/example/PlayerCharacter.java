package org.example;

public class PlayerCharacter {
    private int x;
    private int y;
    private final int[] boardSize;

    public PlayerCharacter(int x, int y, int[] boardSize) {
        this.x = x;
        this.y = y;
        this.boardSize = boardSize;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(char direction) {
        switch (direction) {
            case 'W': moveUp(); break;
            case 'S': moveDown(); break;
            case 'A': moveLeft(); break;
            case 'D': moveRight(); break;
        }
    }

    public void moveUp() {
        if (this.y != 0) {
            this.y -= 1;
        }
    }

    public void moveDown() {
        if (this.y != boardSize[0] - 1) {
            this.y += 1;
        }
    }

    public void moveLeft() {
        if (this.x != 0) {
            this.x -= 1;
        }
    }

    public void moveRight() {
        if (this.x != boardSize[1] - 1) {
            this.x += 1;
        }
    }
}
