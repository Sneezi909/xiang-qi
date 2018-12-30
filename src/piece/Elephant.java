package piece;

import game.Player.PlayerColor;

public class Elephant extends Piece {

    public Elephant(int x, int y, PlayerColor color) {
        super(x, y, PieceType.ELEPHANT, color);
    }

    public boolean validMove() {
        return false;
    }
}
