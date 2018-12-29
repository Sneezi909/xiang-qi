package Board;

import Piece.*;
/*
    Container for the pieces. That's about it
*/
public class Cell {
    int x;
    int y;

    Piece p;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.p = null;
    }

    public Cell(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.p = piece;
    }

    public Piece getPiece() {
        return this.p;
    }

    public void setPiece(Piece p) {
        this.p = p;
    }


}
