package board;

import piece.*;
/*
    Container for the pieces. That's about it
*/
public class Cell {
    private final int x;
    private final int y;

    private Piece p;

    public Cell(int x, int y) {
        this(x, y, null);
    }

    public Cell(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.p = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return p;
    }

    public void setPiece(Piece p) {
        this.p = p;
    }


}
