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
}