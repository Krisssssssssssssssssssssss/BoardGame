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
}