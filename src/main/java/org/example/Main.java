package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Board board = new Board(8 , 8);
        PlayerCharacter playerCharacter = new PlayerCharacter(0, 0, board);
        Renderer renderer = new Renderer(board, playerCharacter);
        Scanner scanner = new Scanner(System.in);

        renderer.render();
        while (true) {
            char nextChar = scanner.next().charAt(0);
            playerCharacter.move(nextChar);
            renderer.render();
        }
    }

    public static int[] moveLeft(int[] boardSize, int[]playerPosition) {
        if (playerPosition[1] == 0) {
            return playerPosition;
        } else {
            return new int[]{playerPosition[0], playerPosition[1] - 1};
        }
    }

    public static int[] moveRight(int[] boardSize, int[]playerPosition) {
        if (playerPosition[1] == boardSize[1] - 1) {
            return playerPosition;
        } else {
            return new int[]{playerPosition[0], playerPosition[1] + 1};
        }
    }
}