package org.example;

class Main {
    public static void main(String[] args) {

    }

    public static int[] moveUp(int[] boardSize, int[]playerPosition) {
        if (playerPosition[0] == 0) {
            return playerPosition;
        } else {
            return new int[]{playerPosition[0] - 1, playerPosition[1]};
        }
    }

    public static int[] moveDown(int[] boardSize, int[]playerPosition) {
        if (playerPosition[0] == boardSize[0] - 1) {
            return playerPosition;
        } else {
            return new int[]{playerPosition[0] + 1, playerPosition[1]};
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