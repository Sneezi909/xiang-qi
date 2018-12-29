package Piece;

public class Horse extends Piece {
    static String ID = "Horse";

    public Horse(int x, int y) {
        super(x, y);
    }

    public void move() {

    }

    public boolean validMove() {
        return false;
    }
}
