package org.example;

import jdk.internal.net.http.common.Pair;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        boolean[][] boardBad = {
                {true, false, false},
                {false, false, false},
                {false, false, false},
        };

        int[] boardSizeGood = {5, 5};

    }

    public static boolean[][] moveUpBad(boolean[][] board) {
        // Check if player cannot move up.
        for (boolean element : board[0]) {
            if (element) return board;
        }

        // Find player current position.
        int playerLine = 0;
        int playerRow = 0;
        for (int lineNumber = 1; lineNumber < board.length; lineNumber++) {
            for (int columnNumber = 0; columnNumber < board[lineNumber].length; columnNumber++) {
                if (board[lineNumber][columnNumber]) {
                    playerLine = lineNumber;
                    playerRow = columnNumber;
                }
            }
        }

        // Set player new position.
        board[playerLine][playerRow] = false;
        board[playerLine - 1][playerRow] = true;
    }

    public static int[] moveUpGood(int[] boardSize, int[]playerPosition) {
        if (playerPosition[1] == 0) {
            return playerPosition;
        } else {
            int[] result = {playerPosition[0], playerPosition[1] - 1};
            return result;
        }
    }
}