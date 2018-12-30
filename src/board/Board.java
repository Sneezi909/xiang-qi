package board;

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

}