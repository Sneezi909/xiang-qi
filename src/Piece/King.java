package Piece;

public class King extends Piece{
    static String ID = "King";

    public King(int x, int y) {
        super(x, y);
    }

    public void move() {

    }

    boolean validMove() {
        return false;
    }
}
