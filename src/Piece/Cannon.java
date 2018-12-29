package Piece;

public class Cannon extends Piece{
    static String ID = "Cannon";

    public Cannon(int x, int y) {
        super(x, y);
    }

    public void move() {

    }

    boolean validMove() {
        return false;
    }
}
