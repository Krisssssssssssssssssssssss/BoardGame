package org.example;

public class Renderer {
    private final char playerChar = '@';
    private final char emptyChar = '_';
    private final Board board;
    private final PlayerCharacter playerCharacter;

    public Renderer(Board board, PlayerCharacter playerCharacter) {
        this.board = board;
        this.playerCharacter = playerCharacter;
    }

    public void render() {
        int playerX = playerCharacter.getX();
        int playerY = playerCharacter.getY();
        int boardX = board.getSizeX();
        int boardY = board.getSizeY();

        System.out.println();
        for (int y = 0; y < boardY; y++) {
            for (int x = 0; x < boardX; x++) {
                if (playerX == x && playerY == y) {
                    System.out.print(playerChar);
                } else {
                    System.out.print(emptyChar);
                }
            }
            System.out.println();
        }
    }
}
