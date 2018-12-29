package Board;

public class Board {
    static final int boardHeight = 10;
    static final int boardWidth = 9;

    Cell[][] board;
    public Board() {
        this.board = new Cell[boardWidth][boardHeight];
        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardHeight; j++) {
                // Insertion of cells here
            }
        }
    }

}
