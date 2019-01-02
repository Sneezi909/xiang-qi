package board;

import piece.Piece;

import javax.swing.*;

public class Board extends JPanel {
    public static final int GRID_WIDTH = 9;
    public static final int GRID_HEIGHT = 10;

    private Cell[][] grid;

    public Board() {
        grid = new Cell[GRID_WIDTH][GRID_HEIGHT];
        for (int i = 0; i < GRID_WIDTH; i++) {
            for (int j = 0; j < GRID_HEIGHT; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public void addPiece(Piece p) {
        grid[p.getX()][p.getY()].setPiece(p);
    }

    /**
     * Move piece at coordinate (x1, y1) to (x2, y2).
     * ASSUMES VALID MOVE.
     *
     * @return true if a piece was eaten, false otherwise.
     */
    public boolean movePiece(int x1, int y1, int x2, int y2) {
        boolean eaten = (grid[x2][y2].getPiece() != null);

        grid[x2][y2].setPiece(grid[x1][y1].getPiece());
        grid[x1][y1].setPiece(null);

        return eaten;
    }

    public void view() {
        /**
        * Prints the board into the console using the symbols as denoted
        * Used for debugging purposes
        */
        for (int y = 9; y >= 0; y--) {
            for(int x = 0; x <= 8; x++) {
                StringBuilder str = new StringBuilder(grid[x][y].toString());
                System.out.print(str.substring(0, 3) + " ");
            }
            System.out.println("\n");
        }
    }
}
