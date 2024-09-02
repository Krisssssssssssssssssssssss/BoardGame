package org.example;

class Main {
    public static void main(String[] args) {
        boolean[][] boardBad = {
                {true, false, false},
                {false, false, false},
                {false, false, false},
        };

        // {row, column}
        int[] boardSizeGood = {5, 5};

    }

    public static int[] moveUp(int[] boardSize, int[]playerPosition) {
        if (playerPosition[0] == 0) {
            return playerPosition;
        } else {
            int[] result = {playerPosition[0] - 1, playerPosition[1]};
            return result;
        }
    }
}